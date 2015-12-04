package main.java.web;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.domain.User;
import main.java.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController
{
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    @Autowired
    private UserService userService;

    public UserService getUserService()
    {
        return userService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    @RequestMapping()
    public List<User> findAll()
    {
        logger.info("findAll");
        return userService.findAll();
    }

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName,
            @RequestParam("password") String password)
    {
        User user = userService.findUserByUserName(userName);
        String result = user != null && user.getPassword().equals(password)
                ? "yes" : "no";
        String info = String.format(
                "Login [%s]:\n\nuserName: %s\npassword: %s\nresult: %s",
                new Date().toString(), userName, password, result);
        return info;
    }

    @RequestMapping("/register")
    public String save(@RequestParam("userName") String userName,
            @RequestParam("password") String password)
    {
        String result;
        User user = userService.findUserByUserName(userName);
        if (user != null)
            result = "Failed: Already exists.";
        else if ("".equals(userName) || "".equals(password))
            result = "Failed: Required fields.";
        else
        {
            user = new User();
            user.setUserId(new Random().nextInt(10));
            user.setUserName(userName);
            user.setPassword(password);
            userService.saveUser(user);
            result = "Success";
        }
        String info = String.format(
                "Register [%s]:\n\nuserName: %s\npassword: %s\nresult: %s",
                new Date().toString(), userName, password, result);
        return info;
    }
}

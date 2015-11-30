package main.java.web;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/login")
    public String login()
    {
        return "success";
    }

    @RequestMapping()
    public List<User> findAll()
    {
        logger.info("findAll");
        return userService.findAll();
    }
}

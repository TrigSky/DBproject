package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.dao.UserDao;
import main.java.domain.User;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public User findUserByUserName(String userName)
    {
        return userDao.findUserByUserName(userName);
    }

    public void saveUser(User user)
    {
        userDao.saveUser(user);
    }

    public List<User> findAll()
    {
        return userDao.findAll();
    }
}

package main.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.java.domain.User;

@Repository
@Transactional
public class UserDao extends BaseDao<User>
{
    @SuppressWarnings("unchecked")
    public User findUserByUserName(final String userName)
    {
        List<User> users = find(
                "from User u where u.userName = '" + userName + "'");
        if (users != null && users.size() > 0)
        {
            return users.get(0);
        }
        return null;
    }

    @Transactional(readOnly = false)
    public void saveUser(User user)
    {
        save(user);
    }

    @SuppressWarnings("unchecked")
    public List<User> findAll()
    {
        List<User> users = find("from User u");
        return users;
    }
}

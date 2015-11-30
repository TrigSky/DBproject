package main.java.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseDomain
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    private String password;
    @Column(name = "last_ip")
    private String lastIp;
    @Column(name = "last_visit")
    private Date lastVisit;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getLastIp()
    {
        return lastIp;
    }

    public void setLastIp(String lastIp)
    {
        this.lastIp = lastIp;
    }

    public Date getLastVisit()
    {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit)
    {
        this.lastVisit = lastVisit;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
}

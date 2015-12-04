package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseDomain
{
    private static final long serialVersionUID = 1L;

    private long userId;
    private String userName;
    private String password;
    private String wechat;
    private String extraInfo;
    private String sex;
    private String shortDesc;
    private String job;
    private String level;
    private String jobIn;
    private String projectNum;
    private String starNum;
    private String img;
    private String project;
    private String partyNum;
    private String party;

    @Id
    @Column(name = "user_id")
    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    @Column(name = "user_name")
    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    @Column(name = "password")
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Column(name = "wechat")
    public String getWechat()
    {
        return wechat;
    }

    public void setWechat(String wechat)
    {
        this.wechat = wechat;
    }
}

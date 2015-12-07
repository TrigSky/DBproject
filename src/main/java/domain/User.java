package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User
{
    @Id
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_name")
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

    public long getUserId()
    {
        return userId;
    }

    public void setUserId(long userId)
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

    public String getWechat()
    {
        return wechat;
    }

    public void setWechat(String wechat)
    {
        this.wechat = wechat;
    }

    public String getExtraInfo()
    {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo)
    {
        this.extraInfo = extraInfo;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getShortDesc()
    {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc)
    {
        this.shortDesc = shortDesc;
    }

    public String getJob()
    {
        return job;
    }

    public void setJob(String job)
    {
        this.job = job;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getJobIn()
    {
        return jobIn;
    }

    public void setJobIn(String jobIn)
    {
        this.jobIn = jobIn;
    }

    public String getProjectNum()
    {
        return projectNum;
    }

    public void setProjectNum(String projectNum)
    {
        this.projectNum = projectNum;
    }

    public String getStarNum()
    {
        return starNum;
    }

    public void setStarNum(String starNum)
    {
        this.starNum = starNum;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }

    public String getProject()
    {
        return project;
    }

    public void setProject(String project)
    {
        this.project = project;
    }

    public String getPartyNum()
    {
        return partyNum;
    }

    public void setPartyNum(String partyNum)
    {
        this.partyNum = partyNum;
    }

    public String getParty()
    {
        return party;
    }

    public void setParty(String party)
    {
        this.party = party;
    }
}

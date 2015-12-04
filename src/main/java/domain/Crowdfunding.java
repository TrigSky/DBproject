package main.java.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crowdfunding")
public class Crowdfunding
{
    @Id
    @Column(name = "cf_id")
    private int crowdfundingId;
    private String title;
    private String location;
    @Column(name = "peo_num")
    private int peoNum;
    @Column(name = "man_target")
    private double maxTarget;
    @Column(name = "min_target")
    private double minTarget;
    @Column(name = "time_post")
    private Date timePost;
    @Column(name = "time_limit")
    private Date timeLimit;
    @Column(name = "imagpre_url")
    private String imagPreUrl;
    private String type;
    @Column(name = "imag_num")
    private int imagNum;
    @Column(name = "web_url")
    private String webUrl;
    private String latitude;
    private String longitude;
    private String detail;
    @Column(name = "share_num")
    private int shareNum;
    @Column(name = "invest_num")
    private int investNum;

    public int getCrowdfundingId()
    {
        return crowdfundingId;
    }

    public void setCrowdfundingId(int crowdfundingId)
    {
        this.crowdfundingId = crowdfundingId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public int getPeoNum()
    {
        return peoNum;
    }

    public void setPeoNum(int peoNum)
    {
        this.peoNum = peoNum;
    }

    public double getMaxTarget()
    {
        return maxTarget;
    }

    public void setMaxTarget(double maxTarget)
    {
        this.maxTarget = maxTarget;
    }

    public double getMinTarget()
    {
        return minTarget;
    }

    public void setMinTarget(double minTarget)
    {
        this.minTarget = minTarget;
    }

    public Date getTimePost()
    {
        return timePost;
    }

    public void setTimePost(Date timePost)
    {
        this.timePost = timePost;
    }

    public Date getTimeLimit()
    {
        return timeLimit;
    }

    public void setTimeLimit(Date timeLimit)
    {
        this.timeLimit = timeLimit;
    }

    public String getImagPreUrl()
    {
        return imagPreUrl;
    }

    public void setImagPreUrl(String imagPreUrl)
    {
        this.imagPreUrl = imagPreUrl;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getImagNum()
    {
        return imagNum;
    }

    public void setImagNum(int imagNum)
    {
        this.imagNum = imagNum;
    }

    public String getWebUrl()
    {
        return webUrl;
    }

    public void setWebUrl(String webUrl)
    {
        this.webUrl = webUrl;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public int getShareNum()
    {
        return shareNum;
    }

    public void setShareNum(int shareNum)
    {
        this.shareNum = shareNum;
    }

    public int getInveNum()
    {
        return investNum;
    }

    public void setInveNum(int inveNum)
    {
        this.investNum = inveNum;
    }
}

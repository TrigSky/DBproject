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
    private String author;
    private String title;
    private String location;
    @Column(name = "max_people_num")
    private int maxPeopleNum;
    @Column(name = "max_target")
    private double maxTarget;
    @Column(name = "min_target")
    private double minTarget;
    @Column(name = "post_date")
    private Date postDate;
    @Column(name = "due_date")
    private Date dueDate;
    @Column(name = "cover_url")
    private String coverUrl;
    private String type;
    @Column(name = "img_num")
    private int imgNum;
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

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
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

    public int getMaxPeopleNum()
    {
        return maxPeopleNum;
    }

    public void setMaxPeopleNum(int maxPeopleNum)
    {
        this.maxPeopleNum = maxPeopleNum;
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

    public Date getPostDate()
    {
        return postDate;
    }

    public void setPostDate(Date postDate)
    {
        this.postDate = postDate;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getCoverUrl()
    {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl)
    {
        this.coverUrl = coverUrl;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getImgNum()
    {
        return imgNum;
    }

    public void setImgNum(int imgNum)
    {
        this.imgNum = imgNum;
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

    public int getInvestNum()
    {
        return investNum;
    }

    public void setInvestNum(int investNum)
    {
        this.investNum = investNum;
    }
}

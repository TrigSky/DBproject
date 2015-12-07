package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crowdfunding_img")
public class CrowdfundingImage
{
    @Id
    @Column(name = "img_url")
    private String imgUrl;
    @ManyToOne(targetEntity = Crowdfunding.class)
    @JoinColumn(name = "cf_id")
    private int crowdfundingId;

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public int getCrowdfundingId()
    {
        return crowdfundingId;
    }

    public void setCrowdfundingId(int crowdfundingId)
    {
        this.crowdfundingId = crowdfundingId;
    }
}

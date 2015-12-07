package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invest_option")
public class InvestOption
{
    @Id
    private int uuid;
    private double price;
    private String title;
    private String detail;
    @Column(name = "people_num")
    private int peopleNum;
    @ManyToOne(targetEntity = Crowdfunding.class)
    @JoinColumn(name = "cf_id")
    private int crowdfundingId;

    public int getUuid()
    {
        return uuid;
    }

    public void setUuid(int uuid)
    {
        this.uuid = uuid;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public int getPeopleNum()
    {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum)
    {
        this.peopleNum = peopleNum;
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

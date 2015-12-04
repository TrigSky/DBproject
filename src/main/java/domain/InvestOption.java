package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @Column(name = "imgs_arr")
    private String imgsArr;
    @Column(name = "peo_num")
    private int peopleNum;

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

    public String getImgsArr()
    {
        return imgsArr;
    }

    public void setImgsArr(String imgsArr)
    {
        this.imgsArr = imgsArr;
    }

    public int getPeopleNum()
    {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum)
    {
        this.peopleNum = peopleNum;
    }
}

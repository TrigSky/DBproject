package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invest_option_image")
public class InvestOptionImage
{
    @Id
    @Column(name = "img_url")
    private String imgUrl;
    @ManyToOne(targetEntity = InvestOption.class)
    @JoinColumn(name = "io_id")
    private int investOptionId;

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public int getInvestOptionId()
    {
        return investOptionId;
    }

    public void setInvestOptionId(int investOptionId)
    {
        this.investOptionId = investOptionId;
    }
}

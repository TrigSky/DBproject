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
    @Column(name = "people_num")
    private int peopleNum;
}

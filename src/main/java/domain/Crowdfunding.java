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
    @Column(name = "people_num")
    private int peoNum;
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
}

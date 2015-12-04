package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private long userId;
	private String userName;
	private String password;
	private String UUID;
	private String wechat;
	private String exInfo;
	private String sex;
	private String shorDes;
	private String job;
	private String level;
	private String jobIn;
	private String projectNum;
	private String starsNum;
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

	@Column(name = "uuid")
	public String getUUID() 
	{
		return UUID;
	}

	public void setUUID(String uUID) 
	{
		UUID = uUID;
	}

	@Column(name = "wechat")
	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) 
	{
		this.wechat = wechat;
	}

	@Column(name = "extroinfo")
	public String getExInfo() 
	{
		return exInfo;
	}

	public void setExInfo(String exInfo) 
	{
		this.exInfo = exInfo;
	}

	@Column(name = "sex")
	public String getSex() 
	{
		return sex;
	}

	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	@Column(name = "short_descri")
	public String getShorDes() 
	{
		return shorDes;
	}

	public void setShorDes(String shorDes) 
	{
		this.shorDes = shorDes;
	}

	@Column(name = "job")
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name = "level")
	public String getLevel() 
	{
		return level;
	}

	public void setLevel(String level) 
	{
		this.level = level;
	}

	@Column(name = "job_in")
	public String getJobIn() 
	{
		return jobIn;
	}

	public void setJobIn(String jobIn) 
	{
		this.jobIn = jobIn;
	}

	@Column(name = "project_num")
	public String getProjectNum() 
	{
		return projectNum;
	}

	public void setProjectNum(String projectNum) 
	{
		this.projectNum = projectNum;
	}

	@Column(name = "star_num")
	public String getStarsNum() 
	{
		return starsNum;
	}

	public void setStarsNum(String starsNum) 
	{
		this.starsNum = starsNum;
	}

	@Column(name = "img_url")
	public String getImg() 
	{
		return img;
	}

	public void setImg(String img) 
	{
		this.img = img;
	}

	@Column(name = "project")
	public String getProject() 
	{
		return project;
	}

	public void setProject(String project) 
	{
		this.project = project;
	}

	@Column(name = "party_num")
	public String getPartyNum() 
	{
		return partyNum;
	}

	public void setPartyNum(String partyNum) 
	{
		this.partyNum = partyNum;
	}

	@Column(name = "party")
	public String getParty() 
	{
		return party;
	}

	public void setParty(String party) 
	{
		this.party = party;
	}
}

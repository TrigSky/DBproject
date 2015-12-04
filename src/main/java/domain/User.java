package main.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseDomain {
	private static final long serialVersionUID = 1L;

	private int ID;
	private String UUID;
	private String Name;
	private String Wechat;
	private String ExInfo;
	private String Sex;
	private String ShorDes;
	private String Job;
	private String Level;
	private String JobIn;
	private String ProjectNum;
	private String StarsNum;
	private String Img;
	private String Project;
	private String PartyNum;
	private String Party;

	@Id
	@Column(name = "id")
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Column(name = "uuid")
	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	@Column(name = "name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Column(name = "wechat")
	public String getWechat() {
		return Wechat;
	}

	public void setWechat(String wechat) {
		Wechat = wechat;
	}

	@Column(name = "extroinfo")
	public String getExInfo() {
		return ExInfo;
	}

	public void setExInfo(String exInfo) {
		ExInfo = exInfo;
	}

	@Column(name = "sex")
	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	@Column(name = "short_descri")
	public String getShorDes() {
		return ShorDes;
	}

	public void setShorDes(String shorDes) {
		ShorDes = shorDes;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return Job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		Job = job;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return Level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(String level) {
		Level = level;
	}

	/**
	 * @return the jobIn
	 */
	public String getJobIn() {
		return JobIn;
	}

	/**
	 * @param jobIn
	 *            the jobIn to set
	 */
	public void setJobIn(String jobIn) {
		JobIn = jobIn;
	}

	/**
	 * @return the projectNum
	 */
	public String getProjectNum() {
		return ProjectNum;
	}

	/**
	 * @param projectNum
	 *            the projectNum to set
	 */
	public void setProjectNum(String projectNum) {
		ProjectNum = projectNum;
	}

	/**
	 * @return the starsNum
	 */
	public String getStarsNum() {
		return StarsNum;
	}

	/**
	 * @param starsNum
	 *            the starsNum to set
	 */
	public void setStarsNum(String starsNum) {
		StarsNum = starsNum;
	}

	/**
	 * @return the img
	 */
	public String getImg() {
		return Img;
	}

	/**
	 * @param img
	 *            the img to set
	 */
	public void setImg(String img) {
		Img = img;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return Project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(String project) {
		Project = project;
	}

	/**
	 * @return the partyNum
	 */
	public String getPartyNum() {
		return PartyNum;
	}

	/**
	 * @param partyNum
	 *            the partyNum to set
	 */
	public void setPartyNum(String partyNum) {
		PartyNum = partyNum;
	}

	/**
	 * @return the party
	 */
	public String getParty() {
		return Party;
	}

	/**
	 * @param party
	 *            the party to set
	 */
	public void setParty(String party) {
		Party = party;
	}
}

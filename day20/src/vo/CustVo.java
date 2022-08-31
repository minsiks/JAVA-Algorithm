package vo;

import java.util.Date;

public class CustVo {
	private String custid;
	private Date regdate;
	private String pwd;
	private int age;
	private int favno;
	private int tlistno;
	public CustVo() {
	}
	public CustVo(String custid, Date regdate, String pwd, int age, int favno, int tlistno) {
		this.custid = custid;
		this.regdate = regdate;
		this.pwd = pwd;
		this.age = age;
		this.favno = favno;
		this.tlistno = tlistno;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFavno() {
		return favno;
	}
	public void setFavno(int favno) {
		this.favno = favno;
	}
	public int getTlistno() {
		return tlistno;
	}
	public void setTlistno(int tlistno) {
		this.tlistno = tlistno;
	}
	@Override
	public String toString() {
		return "CustVo [custid=" + custid + ", regdate=" + regdate + ", pwd=" + pwd + ", age=" + age + ", favno="
				+ favno + ", tlistno=" + tlistno + "]";
	}

	
}

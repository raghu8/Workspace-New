package com.realhealthstudent;

import javax.persistence.*;

@Entity
@Table(name = "profession")
public class Profession {
	@Id
	@GeneratedValue
	@Column(name = "EDUCATION")
	private int EDUCATION;
	@Column(name = "HOURS")
	private int HOURS;
	@Column(name = "JOB_OUTLOOK")
	private String JOB_OUTLOOK;
	@Column(name = "JOBTITLE")
	private String JOBTITLE;
	@Column(name = "SALARY")
	private double SALARY;
	@Column(name = "UPWARD_MOBILITY")
	private String UPWARD_MOBILITY;

	public int getEDUCATION() {
		return EDUCATION;
	}

	public void setEDUCATION(int eDUCATION) {
		EDUCATION = eDUCATION;
	}

	public int getHOURS() {
		return HOURS;
	}

	public void setHOURS(int hOURS) {
		HOURS = hOURS;
	}

	public String getJOB_OUTLOOK() {
		return JOB_OUTLOOK;
	}

	public void setJOB_OUTLOOK(String jOB_OUTLOOK) {
		JOB_OUTLOOK = jOB_OUTLOOK;
	}

	public String getJOBTITLE() {
		return JOBTITLE;
	}

	public void setJOBTITLE(String jOBTITLE) {
		JOBTITLE = jOBTITLE;
	}

	public double getSALARY() {
		return SALARY;
	}

	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}

	public String getUPWARD_MOBILITY() {
		return UPWARD_MOBILITY;
	}

	public void setUPWARD_MOBILITY(String uPWARD_MOBILITY) {
		UPWARD_MOBILITY = uPWARD_MOBILITY;
	}
}

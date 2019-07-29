package com.flytxt.hibernate;

import java.io.*;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity implements Serializable
{  
    private static final long serialVersionUID = -1798070786993154676L;
     
    @Id
    @Column(name = "emp_no")
    private Integer no;
     
    @Column(name = "birth_date")
    private String bdate;
     
    @Column(name = "first_name")
    private String fname;
     
    @Column(name = "last_name")
    private String lname;
    
    @Column(name = "gender")
    private String gen;
    
    @Column(name = "hire_date")
    private String hdate;

    //Getters and setters

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getHdate() {
		return hdate;
	}

	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
    
}
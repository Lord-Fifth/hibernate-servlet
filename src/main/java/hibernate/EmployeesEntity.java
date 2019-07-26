package hibernate;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "employees", uniqueConstraints = {
        @UniqueConstraint(columnNames = "emp_no") })
public class EmployeesEntity implements Serializable
{  
    private static final long serialVersionUID = -1798070786993154676L;
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_no", unique = true, nullable = false)
    private Integer no;
     
    @Column(name = "birth_date", unique = false, nullable = false, length = 100)
    private String bdate;
     
    @Column(name = "first_name", unique = false, nullable = false, length = 100)
    private String fname;
     
    @Column(name = "last_name", unique = false, nullable = false, length = 100)
    private String lname;
    
    @Column(name = "gender", unique = false, nullable = false, length = 100)
    private String gen;
    
    @Column(name = "hire_date", unique = false, nullable = false, length = 100)
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
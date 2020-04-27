package com.makunpeng.common.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
/**
 * TPS实体类
 * @ClassName: TPS 
 * @Description: TODO
 * @author: 马坤鹏
 * @date: 2020年4月27日 上午10:53:41
 */
public class TPS {
	private BigInteger id;
	private String name;
	private Integer age;
	private BigDecimal salary;
	private Date startDate;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public TPS(BigInteger id, String name, Integer age, BigDecimal salary, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.startDate = startDate;
	}
	public TPS() {
		super();
	}
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", startDate=" + startDate
				+ "]";
	}
	

}

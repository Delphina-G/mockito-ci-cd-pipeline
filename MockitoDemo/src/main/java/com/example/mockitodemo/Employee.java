package com.example.mockitodemo;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamicUpdate
@Entity
@Table(name="m_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Long mobileNo;
	private String mailId;
	private String address;
	
	
	public synchronized Integer getId() {
		return id;
	}
	public synchronized void setId(Integer id) {
		this.id = id;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized Long getMobileNo() {
		return mobileNo;
	}
	public synchronized void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public synchronized String getMailId() {
		return mailId;
	}
	public synchronized void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public synchronized String getAddress() {
		return address;
	}
	public synchronized void setAddress(String address) {
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	public Employee(Integer id, String name, Long mobileNo, String mailId, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.address = address;
	}
}

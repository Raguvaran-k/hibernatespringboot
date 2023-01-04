package com.spring.jpa.entity;


import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;




@Entity
@Table(name = "tb_ragu_jpa")
public class User {
	
	@Id
	@GeneratedValue(generator ="UUID")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	
	
	 @Column(name ="id",updatable = false, nullable = false)
	private UUID id;
	
    @Column(name ="name")
	private String name;
    @Column(name ="passowrd")
	private String password;
    @Column(name ="phone")
	private String phone;
    @Column(name ="address")
	private String address;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
	
}

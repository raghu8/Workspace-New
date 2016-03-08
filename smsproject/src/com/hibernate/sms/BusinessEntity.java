package com.hibernate.sms;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "BusinessEntity")
public class BusinessEntity {
	@Id
	@GeneratedValue
	@Column(name = "BusinessEntityID")
	private int BusinessEntityID;
	@Column(name = "BusinessEntityName")
	private String BusinessEntityName;
	@OneToMany
	@JoinColumn(name = "AddressID")
	private int AddressID;
	@ManyToMany
	@JoinColumn(name = "PhoneID")
	private int PhoneID;

	@ManyToMany 
	@JoinColumn(name="BusinessEntity",insertable=false,updatable=false,nullable=false)
	private BusinessEntity BusinessEntity;

	public BusinessEntity() {
	}

	public BusinessEntity(int BusinessEntityID, String BusinessEntityName,
			int AddressID, int PhoneID) {
		this.BusinessEntityID = BusinessEntityID;
		this.BusinessEntityName = BusinessEntityName;
		this.PhoneID = PhoneID;
		this.AddressID = AddressID;
	}

	public int getBusinessEntityID() {
		return BusinessEntityID;
	}

	public static void setBusinessEntityID(int BusinessEntityID) {
		BusinessEntityID = BusinessEntityID;
	}

	public String getBusinessEntityName() {
		return BusinessEntityName;
	}

	public static void setBusinessEntityName(String BusinessEntityName) {
		BusinessEntityName = BusinessEntityName;
	}

	public int getAddressID() {
		return AddressID;
	}

	public static void setAddressID(int AddressID) {
		AddressID = AddressID;
	}

	public int getPhoneID() {
		return PhoneID;
	}

	public static void setPhoneID(int PhoneID) {
		PhoneID = PhoneID;
	}

	public BusinessEntity getBusinessEntity() {
		return BusinessEntity;
	}

	public void setBentity(BusinessEntity BusinessEntity) {
		this.BusinessEntity = BusinessEntity;
	}

	public static void getAddressID(Object setAddressID) {
		// TODO Auto-generated method stub
		
	}
	
}

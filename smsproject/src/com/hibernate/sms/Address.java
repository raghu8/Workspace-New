package com.hibernate.sms;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue
	@JoinColumn(name = "AddressID")
	private int AddressID;
	@Column(name = "AddressTypeID")
	private int AddressTypeID;
	@Column(name = "AddressLine1")
	private String AddressLine1;
	@Column(name = "AddressLine2")
	private String AddressLine2;
	@Column(name = "City")
	private String City;
	@Column(name = "State")
	private String State;
	@Column(name = "PostalCode")
	private String PostalCode;
	@ManyToMany
	@JoinColumn(name = "BusinessEntity")
	private int BusinessEntity;

	public Address() {
	}

	public Address(int AddressID, int AddressTypeID, String AddressLine1,
			String AddressLine2, String City, String State, String PostalCode,
			int BusinessEntity) {
		this.AddressID = AddressID;
		this.AddressTypeID = AddressTypeID;
		this.AddressLine1 = AddressLine1;
		this.AddressLine2 = AddressLine2;
		this.City = City;
		this.State = State;
		this.PostalCode = PostalCode;
		this.BusinessEntity = BusinessEntity;
	}

	public int getAddressID() {
		return AddressID;
	}

	public static int setAddressID(int AddressID) {
		return AddressID = AddressID;
	}

	public int getAddressTypeID() {
		return AddressTypeID;
	}

	public static void setAddressTypeID(int AddressTypeID) {
		AddressTypeID = AddressTypeID;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public static void setAddressLine1(String AddressLine1) {
		AddressLine1 = AddressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public static void setAddressLine2(String AddressLine2) {
		AddressLine2 = AddressLine2;
	}

	public String getCity() {
		return City;
	}

	public static void setCity(String City) {
		City = City;
	}

	public String getState() {
		return State;
	}

	public static void setState(String State) {
		State = State;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public static void setPostalCode(String PostalCode) {
		PostalCode = PostalCode;
	}

	public int getBusinessEntity() {
		return BusinessEntity;
	}

	public static void setBusinessEntity(int BusinessEntity) {
		BusinessEntity = BusinessEntity;
	}

}

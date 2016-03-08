package com.hibernate.sms;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="AddressType")
public class AddressType {
	@Id
	@GeneratedValue
	@Column(name="AddressTypeID")
	private int AddressTypeID;
	
	@Column(name="Name")
	private String Name;
	
	@ManyToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="department_id")
    @IndexColumn(name="idx")
	private Set<Address> address;

	public int getAddressTypeID() {
		return AddressTypeID;
	}

	public static void setAddressTypeID(int AddressTypeID) {
		AddressTypeID = AddressTypeID;
	}

	public String getName() {
		return Name;
	}

	public static void setName(String Name) {
		Name = Name;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public static void setAddressID() {
		// TODO Auto-generated method stub
		
	}
	
}

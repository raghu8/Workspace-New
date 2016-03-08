package com.hibernate.sms;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	@SuppressWarnings("Unchecked")
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		AddressType addressType=new AddressType();
		AddressType.setAddressTypeID(1);
		AddressType.setName("Raghu");
		
		Address address= new Address();
		Address.setAddressID(1);
		Address.setAddressTypeID(1);
		Address.setAddressLine1("firstLine");
		Address.setAddressLine2("Line2");
		Address.setCity("City");
		Address.setState("State");
		Address.setPostalCode("PostalCode");
		
		BusinessEntity businessentity= new BusinessEntity();
		BusinessEntity.setBusinessEntityID(1);
		BusinessEntity.setBusinessEntityName("rags");
		BusinessEntity.setPhoneID(444);
		BusinessEntity.setAddressID(1);
		
		session.getTransaction().commit();
		session.close();
	}
}

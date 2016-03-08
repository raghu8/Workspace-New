import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.Scanner;
import java.util.UUID;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class ClientForSave {

	public static void main(String[] args) throws IOException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//String pic = "C:/Users/Raghu/Pictures/flowers.jpg";
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p = new Product();
		String vin = UUID.randomUUID().toString();
		//String path="C:/Users/Raghu/Pictures/text.txt";
		File file = new File("flowers.jpg");
		byte[]bFile = new byte[(int) file.length()];
		 try {
		     FileInputStream fileInputStream = new FileInputStream(file);
		     //convert file into array of bytes
		     fileInputStream.read(bFile);
		     fileInputStream.close();
	        } catch (Exception e) {
		     e.printStackTrace();
	        }
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an ID: ");
		int id = keyboard.nextInt();
		//object declaration
		p.setProductId(id);
		System.out.print("Enter Product name:");
		String phonemodel=keyboard.next();
		p.setProName(phonemodel);
		p.setPrice(vin);
		p.setImage(bFile);
		 try{
	            FileOutputStream fos = new FileOutputStream("flowers.jpg"); 
	            fos.write(bFile);
	            fos.close();
	        }catch(Exception e){
	            e.printStackTrace();
	        }
		 //closing session
		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		
		tx.commit();
		session.close();
		factory.close();
	}

}
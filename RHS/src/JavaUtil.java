import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.dialect.pagination.FirstLimitHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.Iterator;

import javax.swing.*;

public class JavaUtil {
	private static SessionFactory factory;
	private static String title;
	ProfessionVO pvo = new ProfessionVO();

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("failed to create sessionfactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		JavaUtil ju = new JavaUtil();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter job:");
		title = keyboard.next();
		ju.firstprofessions(title);
		System.out.println();
	}

	public void firstprofessions(String title) {
		Session session = factory.openSession();
		Transaction tx = null;

		// System.out.print("Enter profession: ");

		String query = "FROM Profession Where JobTitle=";
		StringBuilder result = new StringBuilder();

		result.append(query).append("'").append(title).append("'");

		try {
			tx = session.beginTransaction();
			// Create query here
			List professions = session.createQuery(result.toString()).list();
			for (Iterator iterator = professions.iterator(); iterator.hasNext();) {
				Profession profession = (Profession) iterator.next();
				/*
				 * Map m1 = new HashMap(); m1.put("JobTitle",
				 * profession.getJobTitle()); m1.put("Education",
				 * profession.getEducation()); m1.put("Hours",
				 * profession.getHours()); m1.put("Salary",
				 * profession.getSalary()); m1.put("UpwardMobility",
				 * profession.getUpwardMobility()); m1.put("JobOutlook",
				 * profession.getJobOutlook());
				 */
				String jobtitle = profession.getJobTitle();
				int education = profession.getEducation();
				String joboutlook = profession.getJobOutlook();
				String upwardmobility = profession.getUpwardMobility();
				double salary = profession.getSalary();
				int hours = profession.getHours();
				pvo.setEducation(education);
				pvo.setJobtitle(jobtitle);
				pvo.setHours(hours);
				pvo.setJoboutlook(joboutlook);
				pvo.setUpwardmobility(upwardmobility);
				pvo.setSalary(salary);
				System.out.println("Hours:" + pvo.getHours());
				System.out.println("Education" + pvo.getEducation());
				System.out.println("JobOutlook" + pvo.getJoboutlook());
				System.out.println("UpwardMobility" + pvo.getUpwardmobility());
				System.out.println("Salary" + pvo.getSalary());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/*
	 * public static void secondprofessions(String title) { Session session =
	 * factory.openSession(); Transaction tx = null;
	 * 
	 * System.out.print("Enter profession: ");
	 * 
	 * String query = "FROM Profession Where JobTitle="; String firstpart = "'";
	 * String secondpart = "'"; String result = query + firstpart + title +
	 * secondpart; try { tx = session.beginTransaction(); List professions =
	 * session.createQuery(result).list(); for (Iterator iterator =
	 * professions.iterator(); iterator.hasNext();) { Profession profession =
	 * (Profession) iterator.next(); System.out.println("JobTitle: " +
	 * profession.getJobTitle()); System.out.println("Education: " +
	 * profession.getEducation() + "-years"); System.out.println("Hours: " +
	 * profession.getHours() + "/week"); System.out.println("JobOutlook: " +
	 * profession.getJobOutlook());
	 * 
	 * System.out.println("Salary: " + profession.getSalary());
	 * System.out.println("UpwardMobility: " + profession.getUpwardMobility());
	 * 
	 * } tx.commit(); } catch (HibernateException e) { if (tx != null)
	 * tx.rollback(); e.printStackTrace(); } finally { session.close(); }
	 * 
	 * }
	 */
}
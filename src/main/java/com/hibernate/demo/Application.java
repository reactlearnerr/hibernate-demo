/**
 * 
 */
package com.hibernate.demo;

import org.hibernate.Session;

import com.hibernate.demo.util.HibernateUtil;

/**
 * @author prithvi
 *
 */
public class Application {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();
	}
}

package hibernatePack;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MessageDBManager {
	public static SessionFactory getFactory() {

		// Initialize the Variables
		StandardServiceRegistry ssr = null;
		Metadata meta = null;
		SessionFactory factory = null;
		// Startup and return the Session factory
		// Make sure you have the right config file!
		try {
			ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			meta = new MetadataSources(ssr).getMetadataBuilder().build();
			factory = meta.getSessionFactoryBuilder().build();
		} catch (Throwable ex) {
			System.err.println("Error: " + ex.getMessage());
		}
		return factory;
	}
	
	public void createMessage(Message newMessage) {
		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			sx.save(newMessage);
			tx.commit();

			sx.close();
			fx.close();
		} catch (HibernateException hx) {
			if (tx != null)
				tx.rollback();

			System.err.println(hx.getMessage());
		} finally {
			// Clean up your mess!
			sx.close();
			fx.close();
		}
	}
	
	public Message readMessage(long messageId) {
		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		Message rMessage = null;

		try {

			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();

			rMessage = sx.get(Message.class, messageId);
			tx.commit();
			sx.close();
			fx.close();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		finally {
			sx.close();
			fx.close();
		}

		return rMessage;
	}
	
	public List listMessages() {

		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		List<Task> messages = null;

		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			Query newQuery = sx.createQuery("from message");
			
			messages = newQuery.getResultList();

			tx.commit();
			sx.close();
			fx.close();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			sx.close();
			fx.close();
		}

		return messages;
	}
}

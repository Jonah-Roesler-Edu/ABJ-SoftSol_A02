package hibernatePack;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DBManager {
		
	public static SessionFactory getFactory() {
			
			//Initialize the Variables
			StandardServiceRegistry ssr = null;
			Metadata meta = null;
			SessionFactory factory = null;
			//Startup and return the Session factory
			//Make sure you have the right config file!
			try {
			ssr = new
			StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			meta = new MetadataSources(ssr).getMetadataBuilder().build();
			factory = meta.getSessionFactoryBuilder().build();
			} catch (Throwable ex) {
			System.err.println("Error: " + ex.getMessage());
			}
			return factory;
		}
	
		//CREATE
	public void createPerson(Person newPerson) {
			//Declare Session Factory
			SessionFactory fx = null;
			//Declare Session
			Session sx = null;
			//Declare Transaction
			Transaction tx = null;
			
			try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			sx.save(newPerson);
			tx.commit();
			
			sx.close();
			fx.close();
			} catch (HibernateException hx) {
			if (tx != null)
			tx.rollback();
			
			System.err.println(hx.getMessage());
			} finally {
			//Clean up your mess!
			sx.close();
			fx.close();
		}
	}
	
	public Person readPerson (String email) {
		//Declare Session Factory
		SessionFactory fx = null;
		//Declare Session
		Session sx = null;
		//Declare Transaction
		Transaction tx = null;

		Person rPerson = null;
		
		try {
			
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			rPerson = sx.get(Person.class, email);
			tx.commit();
			sx.close();
			fx.close();
		} catch(HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();	
		}
		
		finally {
			sx.close();
			fx.close();
		}
		
		return rPerson;
	}
	
	public void updatePerson (Person uPerson) {
		
		//Declare Session Factory
		SessionFactory fx = null;
		//Declare Session
		Session sx = null;
		//Declare Transaction
		Transaction tx = null;
		
		try {
			
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			//Phone phone = (Phone)sx.get(Phone.class, uPhone.phoneID);
			sx.update(uPerson);
			//sx.update(object);
			tx.commit();
			sx.close();
			fx.close();
		}
		catch(HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();	
		}
		finally {
			sx.close();
			fx.close();
		}
	}
	
	public List listPersons() {
		
		//Declare Session Factory
		SessionFactory fx = null;
		//Declare Session
		Session sx = null;
		//Declare Transaction
		Transaction tx = null;
		
		List<Person> personList = null;
		
		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			personList = sx.createQuery("from Person").list();
			
			tx.commit();
			sx.close();
			fx.close();
		}
		catch(HibernateException e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();	
		}
		finally {
			sx.close();
			fx.close();
		}
		
		return personList;
	}
	
	
	
	
	
	
}

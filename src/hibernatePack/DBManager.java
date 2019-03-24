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

	// CREATE
	public void createEmployee(Employee newEmployee) {
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
			sx.save(newEmployee);
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

	public Employee readEmployee(String email) {
		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		Employee rEmployee = null;

		try {

			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();

			rEmployee = sx.get(Employee.class, email);
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

		return rEmployee;
	}

	public void updateEmployee(Employee uEmployee) {

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

			// Phone phone = (Phone)sx.get(Phone.class, uPhone.phoneID);
			sx.update(uEmployee);
			// sx.update(object);
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
	}
	
	public void deleteEmployee(Employee dEmployee) {

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
			
			sx.delete(dEmployee);
			
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
	}

	public List listEmployees() {

		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		List<Employee> employeeList = null;

		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();

			employeeList = sx.createQuery("from Employee").list();

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

		return employeeList;
	}

}

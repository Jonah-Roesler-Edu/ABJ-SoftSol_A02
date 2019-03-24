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

public class TaskDBManager {

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
	public void createTask(Task newTask) {
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
			sx.save(newTask);
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

	public List listCreatedTasks(String creatorEmail) {

		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		List<Task> taskList = null;

		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			Query newQuery = sx.createQuery("from Task where creatorEmail = :email");
			newQuery.setParameter("email", creatorEmail);
			
			taskList = newQuery.getResultList();

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

		return taskList;
	}

	
	
	//+ "'" + workerEmail + "'"
	public List listAssignedTasks(String workerEmail) {

		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		List<Task> taskList = null;

		try {
			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();
			
			Query newQuery = sx.createQuery("from Task where workerEmail = :email");
			newQuery.setParameter("email", workerEmail);
			
			taskList = newQuery.getResultList();

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

		return taskList;
	}
	
	public Task readTask(long taskId) {
		// Declare Session Factory
		SessionFactory fx = null;
		// Declare Session
		Session sx = null;
		// Declare Transaction
		Transaction tx = null;

		Task rTask = null;

		try {

			fx = getFactory();
			sx = fx.openSession();
			tx = sx.beginTransaction();

			rTask = sx.get(Task.class, taskId);
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

		return rTask;
	}
	
	public void updateTask(Task uTask) {

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
			
			sx.update(uTask);
			
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
	public void deleteTask(Task dTask) {

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
			
			sx.delete(dTask);
			
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
}
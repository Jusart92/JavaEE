package com.jusart.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jusart.hibernate.model.Course;
import com.jusart.hibernate.model.Teacher;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
//        Teacher teacher = new Teacher("Arturo", "URLAVATAR");
        Course course = new Course("Java Avanzado", "Tema 1", "Rest Api");
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
        session.close();
    }
}

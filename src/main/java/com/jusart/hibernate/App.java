package com.jusart.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jusart.hibernate.dao.TeacherDaoImpl;
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

        
        Teacher teacher = new Teacher("Saul", "URL AVATAR");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        teacherDaoImpl.saveTeacher(teacher);
        
        List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
        
        for (Teacher t : teachers) {
        	System.out.println("Nombre: " + t.getName());
        }
    }
}

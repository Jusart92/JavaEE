package com.jusart.hibernate.dao;

import java.util.List;

import com.jusart.hibernate.model.Teacher;

public class TeacherDaoImpl extends JusartSession implements TeacherDao{

	private JusartSession jusartSession;
	
	public TeacherDaoImpl() {
		jusartSession = new JusartSession();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		jusartSession.getSession().persist(teacher);
		jusartSession.getSession().getTransaction().commit();
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> findAllTeachers() {
		//Se utilizara HQL
		return jusartSession.getSession().createQuery("FROM Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

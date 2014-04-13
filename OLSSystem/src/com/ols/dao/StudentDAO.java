package com.ols.dao;

import java.util.List;

import com.ols.po.Course;
import com.ols.po.Student;
/**
 * @author adil alim
 *
 */
public interface StudentDAO {
	public Student getStudentByID(String studentID);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(String StudentID);
	
}

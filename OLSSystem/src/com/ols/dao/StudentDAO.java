package com.ols.dao;

import java.util.List;

import com.ols.po.Course;
import com.ols.po.Student;

public interface StudentDAO {
	public Student findByStudentID(String studentID);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public List<Student> findByStudentName(String studentName);
	public List<Course> getResisteredCourseList(String studentID);
}

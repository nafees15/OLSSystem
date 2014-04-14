package com.ols.service;

import java.util.List;
import com.ols.po.*;

/**
 * @author adil alim
 *
 */

public interface StudentService {
	
	public boolean allowLogin(String StudentID,String Password);
	public Student getStudentInfo(String StudentID);
	public List<Course> getResisteredCourseList(String studentID);
	public void setStudentResult(String StudentID);
}

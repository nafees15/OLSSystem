package com.ols.po;

import java.io.Serializable;

/**
 * @author adil alim
 *
 */
public class Course implements Serializable{
	
		public Course(String courseID, String courseName, String openSemester,
			int credit, String state, String description) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.openSemester = openSemester;
		this.credit = credit;
		this.state = state;
		this.description = description;
	}

		private static final long serialVersionUID = 1L;
		
		private String courseID;
		private String courseName;
		private String openSemester;
		private int credit;
		private String state;
		private String description;
		
		
		
		public String getCourseID() {
			return courseID;
		}

		public void setCourseID(String courseID) {
			this.courseID = courseID;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getOpenSemester() {
			return openSemester;
		}

		public void setOpenSemester(String openSemester) {
			this.openSemester = openSemester;
		}

		public int getCredit() {
			return credit;
		}

		public void setCredit(int credit) {
			this.credit = credit;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		


	
}

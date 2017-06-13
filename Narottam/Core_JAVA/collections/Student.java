package com.cubic.training.collections;

public class Student {
	int sID;
	String sName;
	Course course;

	public Student(int sID, String sName, Course course) {
		this.sID = sID;
		this.sName = sName;
		this.course = course;
	}

	/*@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", course=" + course + "]";
	}
	*/
	
}

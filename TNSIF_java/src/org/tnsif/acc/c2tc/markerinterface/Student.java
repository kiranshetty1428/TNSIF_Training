package org.tnsif.acc.c2tc.markerinterface;

public class Student implements Registerable{
	private int id;
	private String name;
	private double fees;
	private String course;
	Student(int ids,String names,double feess,String courses){
		id=ids;
		name=names;
		fees=feess;
		course=courses;
	}
	

	public static void main(String[] args) {
		
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public String getName() {
		return name;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	

	public double getFees() {
		return fees;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

	public String getCourse() {
		return course;
	}


	

}

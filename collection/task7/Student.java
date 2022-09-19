package com.yash.collection.task7;

public class Student {
	private int rollno;
	private String sname;
	private double avg;

	public Student(int rollno, String sname, double avg) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.avg = avg;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", avg=" + avg + "]";
	}
}
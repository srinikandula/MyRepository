package com.examples.srini;

public class Student {
	private int marks;
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int i) {
		this.marks = i;
	}
	public String getGrade(){
		if(this.marks >70)
			return "A";
		else
			return "B";
	}
}

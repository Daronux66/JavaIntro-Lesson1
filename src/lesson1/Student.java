package lesson1;

public class Student {
	private String name;
	private String surName;
	private String university;
	private String fieldOfStudy;
	
	public Student() {
	}
	
	public Student(String name, String surName, 
			String university, String fieldOfStudy) {
		this.name=name;
		this.surName=surName;
		this.university=university;
		this.fieldOfStudy=fieldOfStudy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	
	public String toString() {
		return "Name: "+name+" "+surName+"\nUniversity: "+university
				+"\nField of study: "+fieldOfStudy;
	}
}

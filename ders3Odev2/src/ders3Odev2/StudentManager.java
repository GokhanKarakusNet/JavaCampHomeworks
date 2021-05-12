package ders3Odev2;

public class StudentManager extends UserManager {
	

	public void addHomework(Student student) {
		
		System.out.println(student.firstName+" "+ student.lastName+" "+student.homework+" Ödevini yapti ve sisteme yükledi.");
		
		
	}

}
package ders3Odev2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Gökhan";
		student1.lastName = "Karakuş";
		student1.studentNumber="12345";
		student1.email="gokhan@gokhan.com";
		student1.homework="3.hafta";
		
		Instructor instructor1= new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroğ";
		instructor1.email="engindemirog@gmail.com";
		instructor1.certificate="PMP";
		
		
		
		UserManager userManager = new UserManager();
		
		User[]users= {student1,instructor1};
		userManager.addMultiple(users);
		userManager.login(student1);
		userManager.login(instructor1);
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCertificate(instructor1);
	
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.addHomework(student1);
		
		
	}

}

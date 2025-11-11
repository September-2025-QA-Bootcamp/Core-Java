package lec10_03_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Mohammad Sharkar");
		student.setStId(2188458);
		student.setStGender('M');
		student.setFullTimeSt(false);
		student.setStGrade(3.5345f);
		
		System.out.println("Student Name: " + student.getStName() + "\nStudent Id: " +  student.getStId() + "\nGender: "
				+ student.getStGender() + "\nFull Time student? : " + student.isFullTimeSt() + "\nGrade: " + student.getStGrade());
		
		System.out.println("\n-----------------------------------------------------------------");
		// If we create more object, then we can set new data and also can get the new outcome
		Student maria = new Student();
		maria.setStName("Maria Kerry");
		maria.setStId(36428);
		maria.setStGender('F');
		maria.setFullTimeSt(false);
		maria.setStGrade(4.00f);
		
		System.out.println("Student Name: " + maria.getStName() + "\nStudent Id: " + maria.getStId() + "\nGender: "
				+ maria.getStGender() + "\nFull Time student? : " + maria.isFullTimeSt() + "\nGrade: " + maria.getStGrade());
	
	
	
	}

}

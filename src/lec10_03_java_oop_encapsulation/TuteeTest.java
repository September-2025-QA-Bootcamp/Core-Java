package lec10_03_java_oop_encapsulation;

public class TuteeTest {

	public static void main(String[] args) {
		Tutee tutee = new Tutee("Alex F", 1009, 'M', false, 3.003f);
		System.out.println("Student Name: " + tutee.getStName()  + "\nStudent Id: " + tutee.getStId() + "\nGender: "
				+ tutee.getStGender() + "\nFull Time student? : " + tutee.isFullTimeSt() + "\nGrade: " + tutee.getStGrade());

		System.out.println("---------------");
		Student student = new Student();
		student.setStName("Mark G");
		System.out.println(student.getStName());
		
	}

}

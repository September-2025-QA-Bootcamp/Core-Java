package lec03_01_java_variables;

public class MyInfoTest {

	public static void main(String[] args) {

		MyInfo sanjida = new MyInfo(); // Constructor Initialized here

		System.out.println(sanjida.myName);
		System.out.println(sanjida.myAge);
		System.out.println(sanjida.myHeight);
		System.out.println(sanjida.myBankBalance);
		System.out.println(sanjida.myGender);
		System.out.println(sanjida.myYearlySalary);
		System.out.println(sanjida.myGrade);
		System.out.println(sanjida.usCitizen);
		sanjida.mySelf(); // object can call method
		sanjida.study_tour();
		sanjida.myInfo();

	}

}

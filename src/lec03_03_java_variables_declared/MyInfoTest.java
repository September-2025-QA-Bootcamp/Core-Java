package lec03_03_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {

		MyInfo muktadir = new MyInfo();  //default constructor initialized
		muktadir.myName = "Muktadir";
		muktadir.myAge = 100;
		muktadir.myApartmentRent = 22365;
		muktadir.myYearlySalary = 245635;
		muktadir.myBankBalance = 1256324587564l;
		muktadir.myHeight = 1.635f;
		muktadir.myGrade = 3.2555455;
		muktadir.myGender = 'M';
		muktadir.usCitizen = true;
		// method initialized
		muktadir.myInfo();

		System.out.println("\n");
		MyInfo sanjida = new MyInfo();
		sanjida.myName = "Sanjida";
		sanjida.myAge = 20;
		sanjida.myApartmentRent = 22365;
		sanjida.myYearlySalary = 245635;
		sanjida.myBankBalance = 1256324587564l;
		sanjida.myHeight = 5.6f;
		sanjida.myGrade = 3.2555455;
		sanjida.myGender = 'F';
		sanjida.usCitizen = true;
		// method initialized
		sanjida.myInfo();

		System.out.println("\n");
		MyInfo unknown = new MyInfo();
		unknown.myInfo();

		/*
		 * You must know it: Default value of String is null Default value of byte is 0
		 * Default value of short is 0 Default value of int is 0 Default value of long
		 * is 0 Default value of float is 0.0 Default value of double is 0.0 Default
		 * value of char is an unicode which is not defined by eclipse IDE [not
		 * important] Default value of boolean is false
		 * 
		 * Here, you must know default value for String, int and boolean [Important
		 * interview question]
		 */

	}

}

package lec03_02_variables_initialized;

public class MyInfo {
	
	//variables Initialized
	public String myName = "Saif Mahmud";
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.6443f;
	public double myGrade = 3.7657468566745;
	public char myGender = 'M';
	public boolean usCitizen = true;
	
	// Constructor declared
		public MyInfo() {
			System.out.println("--------------------> MyInfo <-------------------");
		}
	
	public void myInfo() { //method implemented
		System.out.println("My Name: " + myName +", My Age: " + myAge +", My Apartment Rent: " + myApartmentRent +", My Yearly Salary: " + myYearlySalary + ", My Bank Balance: " + myBankBalance +", My Height: "+ myHeight + "My Grade: " + myGrade +", US Citizen? :" +usCitizen);
	}
	
	
}

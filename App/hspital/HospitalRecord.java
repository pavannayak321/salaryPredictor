package hospitalrecord;
import hospitalrecord.Patient;

import java.util.Scanner;
public class HospitalRecord {
	
	static Patient[] patients =  new Patient[123];
	//counter variable to hold the number of objects
	static int counter = 0;
	

	
	
	public static void main(String[] args) {
		/* Menu to Show case the Available option */
		Scanner sc = new Scanner(System.in);
		System.out.println("   =================Menu================");
		System.out.println("1. Add Incoming Patient");
		System.out.println("2. Delete outgoing Patient");
		System.out.println("3. Display Patiets Trated By particular illness");
		System.out.println("4. Display Patients Having Same Illness");
		System.out.println("5. Display Patient with lowst Billed Amount");
		System.out.println("6 .Exit");
		System.out.println("   ======================================");
		
		System.out.println("Enter Your Choice");
		int option  = sc.nextInt();
		//sc.close();
		sc.nextLine();
		
		switch(option) {
		case 1 :
			/*
			 * Add Incoming Details
			 */
			System.out.println("Please Enter The Patient Details");
			
			System.out.println("Eneter The Patient Name");
			String name  = sc.nextLine();
			//sc.nextLine();
			
			System.out.println("Please Entetr The No Of Days Patient Aditted");
			int daysAdmitted = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Please Enter The Illness occured To The Patient");
			String[] illness =  new String[20];
			int cnt = 0;
			
			//storing the illnesses till it encounters an empty input from the user
			for(int i=0;i<illness.length;i++) {
				String inp = sc.nextLine();
				if(!inp.equals("")) {
					illness[cnt] = inp;
					cnt++;
				}
				else {
					break;
				}
			}
			//Printing the Illness of Patients
			for(int i=0;i<cnt;i++) {
				System.out.print(illness[i]+"  ===  ");
			}
			System.out.println();
			
			//copying the values of illness array into he temporary variable
			String[] illness1 = new String[cnt];
			for(int i=0;i<cnt;i++) {
				illness1[i] = illness[i];
			}
			
			
			//Bill Amount as the input
			System.out.println("Enter The Bill Amount");
			float billAmount = sc.nextFloat();
			sc.nextLine();
			
			//Taking No Of Doctors Treated
			System.out.println("Please Enter The Doctors Treated");
			String[] doctors = new String[20];
			int cnt1 = 0;
			
			for(int i=0;i<doctors.length;i++) {
				String k = sc.nextLine();
				if(!k.equals("")) {
					doctors[i] = k;
					cnt1++;
				}
				else {
					break;
				}
			}
			//Printing The Doctors Treated
			for(int i=0;i<cnt1;i++) {
				System.out.print(doctors[i]+"  ==  ");
			}
			//Copying The values into Temporary array
			String[] doctors1 = new String[cnt];
			for(int i=0;i<doctors1.length;i++) {
				doctors1[i] = doctors[i];
			}
			
			
			//setting up the values into the patients record
			patients[counter] = new Patient(name,daysAdmitted,illness1,billAmount,doctors1);
			
		case 2:
			/*
			 * Delete Outgoing Patient
			 */
		case 3:
			/*
			 * Display Particular Illness treated by particular illness
			 */
		case 4:
			/*
			 * Display patients having same illness
			 */
		case 5:
			/*
			 * patient with lowest billed amount
			 */
		}
	}

}

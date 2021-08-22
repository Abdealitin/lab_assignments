package healthcheckupasign.main;

import java.util.Scanner;

import healthcheckupasign.service.PatientService;

public class HealthCheckupApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientService ps = new PatientService();

		System.out.println("<<<<<Welcome to Health Checkup App>>>>>\nKindly select any one choice:");
		
		int d=0;
		while(d==0) {
			System.out.println("1. Do you want to enroll?\n2. Get details of first Patient.\n3. Get details of last Patient.");
			System.out.println("4. Get deatails of firsr five Patients.\n5. Get list of all patients.\n6. Exit");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch(i) {
			case 1:
				String name, gender,disease;
				int id,age;

				System.out.println("Enter ID:");
				id = sc.nextInt();
				System.out.println("Enter Name:");
				name = sc.next();
				System.out.println("Enter Gender:");
				gender = sc.next();
				System.out.println("Enter Age:");
				age = sc.nextInt();
				System.out.println("Enter Disease:");
				disease = sc.next();

				ps.addPatient(id, name, gender, age, disease);
				break;
			case 2:
				ps.getFirstPatient();
				break;
			case 3:
				ps.getLast();
				break;
			case 4:
				ps.getFive();
				break;
			case 5:
				ps.printList();
				break;
			case 6:
				d++;
				break;
			}
		}
	}

}

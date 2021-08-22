package healthcheckupasign.service;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import healthcheckupasign.model.Patient;

public class PatientService {
//	public LinkedHashSet<Patient> patientList(){
//		
//		LinkedHashSet<Patient> set = new LinkedHashSet<Patient>();
//		set.add(new Patient(101,"Jack",28,"M","Flu"));
//		set.add(new Patient(102,"Diana",38,"F","Fever"));
//		set.add(new Patient(103,"Daisy",18,"F","Cough"));
//		set.add(new Patient(104,"Neymar",52,"M","Cold"));
//		set.add(new Patient(105,"Camila",45,"F","Diabetes"));
//		set.add(new Patient(106,"Justin",30,"M","Flu"));
//		
//		return set;
//	}
	LinkedHashSet<Patient> patients = new LinkedHashSet<Patient>();
	public void addPatient(int id, String name,String gender, int age,String disease) {
		
		patients.add(new Patient(id,name,age,gender,disease));
		
	}
	
	public void printList() {
		System.out.println("All the Patients List:");
		
		Iterator value = patients.iterator();
		
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		
	}
	
	public void getFirstPatient() {
		System.out.println("First patient details : ");
		
		Iterator value = patients.iterator();
		
		System.out.println(value.next());
	}
	
	public void getLast() {
		
		System.out.println("Last Patient details:");
		
		Object[] pts = patients.toArray();
		System.out.println(pts[(pts.length)-1]);
	}
	
	public void getFive() {

		System.out.println("First five patient details:");
		if(patients.size()<5) {
			Iterator value = patients.iterator();

			int i=0;

			while(i<5) {
				value.hasNext();
				System.out.println(value.next());
				i++;
			}
		}
		else {
			System.out.println("We have only "+patients.size()+" patients!");
		}
	}
}

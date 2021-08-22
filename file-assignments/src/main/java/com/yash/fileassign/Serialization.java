package com.yash.fileassign;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"Jack","Trainee",20000,"19-10-2020");
		String filename = "file.ser";
		//Serialization
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream objStream = new ObjectOutputStream(file);
			
			objStream.writeObject(e1);
			
			System.out.println("Successfully Serialized!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		try
        {   
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            Employee e = (Employee)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("Employee ID : " + e.getId());
            System.out.println("Eployee Name :  " + e.getName());
            System.out.println("Eployee Designation : " + e.getDesignation());
            System.out.println("Eployee Salary : " + e.getSalary());
            System.out.println("Eployee Date of Joining : " + e.getDateOfJoining());
        }
          
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
	}

}

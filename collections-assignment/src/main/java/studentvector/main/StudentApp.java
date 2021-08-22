package studentvector.main;

//import studentvector.service.StudentService;
import studentvector.service.StudentServiceStack;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StudentService ss = new StudentService();
		StudentServiceStack sst = new StudentServiceStack(); 
//		System.out.println(ss.getSize());
//		System.out.println(ss.getCapacity());
//		ss.addStudent(106, "Juliana", 11);
//		ss.printList();
//		System.out.println(ss.getSize());
//		System.out.println(ss.getCapacity());
//		ss.setStadard(12);
//		System.out.println(ss.getSecondStudent());
		sst.printList();
		sst.addStudent(106, "Emily", 11);
		sst.printList();
	}

}

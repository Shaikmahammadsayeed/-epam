import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		//@SuppressWarnings("deprecation")
		Student st=new Student(539,"S Md Sayeed",new Date(1997,06,20),72.97);
		Student stud=new Student(516,"Giri prasad",new Date(1995,7,15),80);
		StudentGroup sg=new StudentGroup(2);
		sg.setStudent(st, 0);
		sg.setStudent(stud, 1);
		//System.out.println(sg.getStudent(0).getFullName());
		//System.out.println(sg.getStudent(1).getFullName());
		Student[] dup=sg.getStudents();
		System.out.println(dup[0].getFullName());
		System.out.println(dup[1].getFullName());
		
		
	}

}

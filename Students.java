package week3.day1;

public class Students {
	public static void main(String[] args) {
		Students data =new Students();
		data.getStudentInfo(701);
		data.getStudentInfo(703,"Basu");
		data.getStudentInfo("basu@gmail.com", 123456789l);
		
	}
public  void getStudentInfo(int id)
{
	System.out.println("Executing id method-" +id);
}
public void getStudentInfo(int id,String name)
{
	System.out.println("Student id is -" +id);
	System.out.println("Student name is - "+name);
}
public  void getStudentInfo(String email, Long phoneNumber)

{
	System.out.println("student email is "+email);
	System.out.println("student phonenumber is"+phoneNumber);
}




	
}

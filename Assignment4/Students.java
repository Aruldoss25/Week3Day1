package week3.Assignment4;

public class Students {
	
	
	
	public void getStudentInfo(int id,String name) {
		
		System.out.println("ID : "+id+ " Name: "+ name+"\n");
		
	}
public void getStudentInfo(String Email, String phoneNumber) {
	System.out.println("Email: "+ Email+" Phone Number"+ phoneNumber +"\n");
	
	
}
	public static void main(String[] args) {
		
		
		Students sb1=new Students();
		sb1.getStudentInfo(900727, "Aruldoss");
		sb1.getStudentInfo("aruldoss15@gmail.com", "9524820844");
	
	}

}

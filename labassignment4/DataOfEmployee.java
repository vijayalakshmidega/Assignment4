package labassignment4;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private String name;
	private int id;
	private String address;
	private double salary;
	public Employee(String name, int id, String address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {}
	public void display() {
		System.out.println("Emplopyee name "+name+"Employee id "+id+
				"Address "+address+"Salary"+salary);
	}
}
public class DataOfEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee("Prithviraj",121,"Chennai",15000);
		emp.display();
		try {
	    FileOutputStream fos=new FileOutputStream("data.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    
		oos.writeObject(emp);
		oos.flush();
		oos.close();

		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			FileInputStream fis=new FileInputStream("data.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp1=(Employee)ois.readObject();
			emp1.display();
					
		}catch(Exception ex) {
			ex.printStackTrace();
			
		} 
		
		}

}



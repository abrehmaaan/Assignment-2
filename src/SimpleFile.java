import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFile {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee("John", 1, 4444433331115L, "Teacher", "CS");
		Employee emp2 = new Employee("Jack", 2, 3333322220005L, "Teacher", "CS");
		FileOutputStream fout = new FileOutputStream("employeesfile.txt");
		fout.write(emp1.toString().getBytes());
		fout.write("\n".getBytes()); 
		fout.write(emp2.toString().getBytes());    
		fout.close();
		FileInputStream fin = new FileInputStream("employeesfile.txt");    
		int i;
		while((i=fin.read())!=-1){    
			System.out.print((char)i);    
		}    
		fin.close();
	}

}

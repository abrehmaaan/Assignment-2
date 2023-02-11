import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee("John", 1, 4444433331115L, "Teacher", "CS");
		Employee emp2 = new Employee("Jack", 2, 3333322220005L, "Teacher", "CS");
		RandomAccessFile thefile = new RandomAccessFile("employees.dat", "rw");
		thefile.writeUTF(emp1.getName());
		thefile.writeInt(emp1.getEmpID());
		thefile.writeLong(emp1.getCNIC());
		thefile.writeUTF(emp1.getDesignation());
		thefile.writeUTF(emp1.getDepartment());
		thefile.writeUTF(emp2.getName());
		thefile.writeInt(emp2.getEmpID());
		thefile.writeLong(emp2.getCNIC());
		thefile.writeUTF(emp2.getDesignation());
		thefile.writeUTF(emp2.getDepartment());
		thefile.seek(0);
		int count = 0;
		while (count < 2) {
			Employee object = new Employee(thefile.readUTF(), thefile.readInt(), thefile.readLong(), thefile.readUTF(), thefile.readUTF());
			count++;
			System.out.println("Object " + count + ": " + object.toString());
		}
		thefile.close();
	}
}
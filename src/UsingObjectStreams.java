import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingObjectStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee emp1 = new Employee("John", 1, 4444433331115L, "Teacher", "CS");
		Employee emp2 = new Employee("Jack", 2, 3333322220005L, "Teacher", "CS");
		ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("employees.txt")));
		objectOut.writeObject(emp1);
		objectOut.writeObject(emp2);
		objectOut.close();
		ObjectInputStream objectIn = null;
		int count = 0;
		Employee object = null;
		objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("employees.txt")));
		while (count < 2) {
			object = (Employee) objectIn.readObject();
			count++;
			System.out.println("Object " + count + ": " + object.toString());
		}
		objectIn.close(); 
	}
}

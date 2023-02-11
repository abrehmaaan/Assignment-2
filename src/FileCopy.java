import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		String inputFile = "satelliteimge.jpg";
		String outputFile = "satelliteimge-copy.jpg";
		long startTime, endTime;
		File fileIn = new File(inputFile);
		System.out.println("File size is " + fileIn.length() + " bytes");
		System.out.print("Copying without Buffer: ");
		try (FileInputStream  in  = new FileInputStream(inputFile); FileOutputStream out = new FileOutputStream(outputFile)) {
			startTime = System.nanoTime();
			int byteRead;
			while ((byteRead = in.read()) != -1) {
				out.write(byteRead);
			}
			endTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (endTime / 1000000.0) + " msec");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.print("Copying with Buffer: ");
		try (BufferedInputStream in = new BufferedInputStream(new 	FileInputStream(inputFile)); BufferedOutputStream out = new 	BufferedOutputStream(new FileOutputStream(outputFile))) {
			startTime = System.nanoTime();
			int byteRead;
			while ((byteRead = in.read()) != -1) {
				out.write(byteRead);
			}
			endTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (endTime / 1000000.0) + " msec");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

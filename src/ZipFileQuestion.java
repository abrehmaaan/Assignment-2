import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileQuestion {

	public static void main(String[] args) throws IOException {
		try (ZipFile zipFile = new ZipFile("archive.zip")) {
			ZipEntry zipEntry = zipFile.getEntry("lorem.txt");
			try (InputStream  in  = zipFile.getInputStream(zipEntry); FileOutputStream out = new FileOutputStream("newfolder/lorem.txt")) {
				int byteRead;
				while ((byteRead = in.read()) != -1) {
					out.write(byteRead);
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		try (FileInputStream inputStream = new FileInputStream("newfolder/lorem.txt")) {
			int i ;
			while ((i=inputStream.read())!=-1)
				System.out.print((char)i);
		}
	}

}

import java.io.*;

class ReadingByteFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// File myfile = new File("C:\\Users\\Laurent\\Desktop\\java demos\\java
		// utils\\mycv.txt");
		// FileInputStream fis =new FileInputStream(myfile);

		FileInputStream fis = new FileInputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv.txt");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv1.txt");

		try (Writer writer = new OutputStreamWriter(fos); Reader reader = new InputStreamReader(fis);) {
			char[] chars = new char[8];
			int c;
			while ((c = reader.read(chars)) > 0) {
				// System.out.print((char)c);
				// System.out.print(c);
				writer.write(chars, 0, c);

			}
		} catch (IOException w) {
		}

	}
	// finally{
	// reader.close();
	// writer.close();
}

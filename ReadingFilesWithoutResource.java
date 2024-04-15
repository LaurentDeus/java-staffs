import java.io.*;

class ReadingByteFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// File myfile = new File("C:\\Users\\Laurent\\Desktop\\java demos\\java
		// utils\\mycv.txt");
		// FileInputStream fis =new FileInputStream(myfile);

		FileInputStream fis = new FileInputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv.txt");
		Reader reader = new InputStreamReader(fis);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv1.txt");
		Writer writer = new OutputStreamWriter(fos);

		char[] chars = new char[8];
		int c;
		while ((c = reader.read(chars)) > 0) {
			// System.out.print((char)c);
			// System.out.print(c);
			writer.write(chars, 0, c);
		}
		reader.close();
		writer.close();
	}

}
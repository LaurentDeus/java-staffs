import java.io.*;

class ReadingByteFiles {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("mycv.txt");
		fw.write(
				"Hello Everyone,\nMy name is Laurent Wambura \nI'm currently working as TA Data Science at DUCE\nThank You Lord For all my achievements\nAmen");
		fw.close();

		FileReader fr = new FileReader("mycv.txt");
		System.out.println((char) fr.read());
		fr.close();

	}

}
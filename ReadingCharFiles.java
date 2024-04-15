import java.io.*;
import java.util.Arrays;

public class ReadingByteFiles{

private static int[] sortArray(int[] arr){

	int arr_len = arr.length;

	for(int j=0;j < arr_len - 1;j++){

		for(int i = 1;i<arr_len - j;i++){

		if(arr[i] > arr[i-1]){	
			int temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;	
			}
		
		}
	}
		return arr;

}

public static void main(String[] args) throws IOException{

FileWriter fw = new FileWriter("mycv.txt");
fw.write("Hello Everyone,\nMy name is Laurent Wambura \nI'm currently working as TA Data Science at DUCE\nThank You Lord For all my achievements\nAmen");
fw.close();

FileReader fr = new FileReader("mycv.txt");
System.out.println((char)fr.read());
fr.close();


}

}
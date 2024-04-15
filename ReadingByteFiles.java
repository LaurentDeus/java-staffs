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

public static void main(String[] args) throws FileNotFoundException{

File imgFile = new File("C:\\Users\\Laurent\\Desktop\\Datacamp Courses\\projects\\static files\\schoolbus.jpg");

FileInputStream fis = new FileInputStream(imgFile);
System.out.println(imgFile.getName());
//System.out.println(imgFile.length());

try{

int max = fis.available();
int[] b = new int[fis.available()];
for (int i = 0; i< max; i++){

b[i] = fis.read() & 0xFF;

}

System.out.println(Arrays.toString(b));
//System.out.println(fis.read(b));
//System.out.println(b.length);
//System.out.println(fis.available());

System.out.println(sortArray(b)[0]);

}
catch(IOException ioe){

}


}

}
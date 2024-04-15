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

public static void main(String[] args) throws FileNotFoundException,IOException {

//File myfile = new File("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv.txt");
//FileInputStream fis =new FileInputStream(myfile);

FileInputStream fis =new FileInputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv.txt");


FileOutputStream fos =new FileOutputStream("C:\\Users\\Laurent\\Desktop\\java demos\\java utils\\mycv1.txt");


try(Writer writer = new OutputStreamWriter(fos);Reader reader = new InputStreamReader(fis);){
char[] chars = new char[8];
int c;
while((c = reader.read(chars)) > 0){
//System.out.print((char)c);
//System.out.print(c);
writer.write(chars,0,c);

}
catch(IOException){
}

}
//finally{
//reader.close();
//writer.close();
}
}

}
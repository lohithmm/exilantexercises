import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Question2 {
	
static BufferedReader filereader=null;
public static long spredSheetCheckSumPart1(String inputFile) 
{
	long finalTotal = 0;
	 try {
		filereader=new BufferedReader(new FileReader(new File(inputFile)));
	    String line=filereader.readLine();
	while(line!=null) {
		int[] array = Arrays.asList(line.split(",")).stream().mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		line=filereader.readLine();
		finalTotal=finalTotal+array[array.length-1]-array[0];
	}
	 } catch (IOException e) {
			e.printStackTrace();
		}
	return finalTotal;
}

public static long spredSheetCheckSumPart2(String inputFile) 
{
	long finalTotal = 0;
	try {
	 filereader=new BufferedReader(new FileReader(new File(inputFile)));
	String line=filereader.readLine();
	while(line!=null) {
		
		int[] array = Arrays.asList(line.split(",")).stream().mapToInt(Integer::parseInt).toArray();
					
		for(int j=0;j<array.length;j++)
		{
			for(int i=0;i<array.length;i++)
			{
				if(i==j)continue;
				if(array[j]%array[i]==0) {
					finalTotal=finalTotal+array[j]/array[i];
					break;
				}
			}
		}
		
		line=filereader.readLine();
	}
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	return finalTotal;
}
}

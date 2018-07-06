import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Question4 {
	public static void main(String[] args) throws IOException {
		
		part2();
		
		
		
	}
	static void part1() throws IOException
	{
		int totalCount=0;
		int invaliedLineCount=0;
		BufferedReader filereader=new BufferedReader(new FileReader(new File("/Users/lohith.m/Desktop/temp2.txt")));
		String line=filereader.readLine();
		while(line!=null)
		{
			totalCount++;
		String[] wordsary=line.split(" ");
		HashSet  words=new HashSet<>();
		
		for(String str:wordsary)
		{
			if( words.contains(str)) {
				invaliedLineCount++;
				break;
			}
			else  words.add(str);
		}
		line=filereader.readLine();
		}
		
		System.out.println(totalCount-invaliedLineCount);
	}
	
	
	static void part2() throws IOException
	{
		int totalCount=0;
		int invaliedLineCount=0;
		BufferedReader filereader=new BufferedReader(new FileReader(new File("/Users/lohith.m/Desktop/temp2.txt")));
		String line=filereader.readLine();
		while(line!=null)
		{
			totalCount++;
		String[] wordsary=line.split(" ");
		HashSet  words=new HashSet<>();
	
		for(String str:wordsary)
		{
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String soretedStr=new String(ch);
			if( words.contains(soretedStr)) {
				invaliedLineCount++;
				break;  
			}
			else  words.add(soretedStr);
		}
		
		line=filereader.readLine();
		}
		filereader.close();
		
		System.out.println(totalCount-invaliedLineCount);
	}
}

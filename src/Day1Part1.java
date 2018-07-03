
public class Day1Part1 
{

public static long checkRepatedAndSum(String str)
{
	long total=0;
	char[] numbers=str.toString().toCharArray();
	for (int i = 0; i < numbers.length; i++) {
		
		if(i==numbers.length-1)
		{
			 if(numbers[i]==numbers[0])
			{
				int number=(int)numbers[i]-48;
				total=total+number;
			}
			
		}
		else 
		{ 
			if(numbers[i]==numbers[i+1]) 
			{
			int number=(int)numbers[i]-48;
			total=total+number;
		    }
		}
		
	}
	return total;
	
}

}

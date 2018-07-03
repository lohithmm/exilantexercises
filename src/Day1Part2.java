
public class Day1Part2 {
	
	public static long checkRepatedAndSum(String str)
	{
		long total=0;
		char[] numbers=str.toString().toCharArray();
		int findIndCnt=numbers.length/2;
		for (int i = 0; i < numbers.length; i++) {
			
				int shiftIndex=i+findIndCnt;
				if(shiftIndex>numbers.length-1)
					shiftIndex=i-findIndCnt;
				else shiftIndex=i+findIndCnt;
				
				if(numbers[i]==numbers[shiftIndex]) {
				int number=(int)numbers[i]-48;
				total=total+number;
			}
			
			
		}
		return total;
		
	}
}

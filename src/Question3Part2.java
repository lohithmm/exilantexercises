
public class Question3Part2 
{
	static int[][] matrix=new int[5][5];
public static void main(String[] args) 
{
	matrix[2][2]=1;
	sfiftRight(2,3);
}

static void sfiftRight(int i,int j)
{
	System.out.println("right=="+i+"--"+j);
	if(i<5&&j<5&&matrix[i][j]==0) {
		matrix[i][j]=1;
		if(j+1<5&&matrix[i][j+1]!=0)sfiftRight(i+1,j);
	}
	if(matrix[i-1][j]==0)sfiftLeft(i-1, j);
	else if(j+1<5)sfiftRight(i,j+1);
}

static void sfiftLeft(int i,int j)
{
	System.out.println("left=="+i+"--"+j);

	if(i<5&&j<5&&matrix[i][j]==0) {
		matrix[i][j]=2;
		if(j-1>0&&matrix[i][j-1]!=0) {
			if(j==4)sfiftLeft(i-1,j);
			else sfiftLeft(i+1,j);
		}

	}
	if(i+1<5&&matrix[i+1][j]==0)sfiftRight(i+1, j);
	else sfiftLeft(i,j-1);
}

}

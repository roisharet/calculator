package strNum;

public class strNum 
{
	public int Add(String numbers)
	{

		int j=0; 
		for (int i = 0; i < numbers.length() ; i++)
		{
			j+=numbers.charAt(i)-48;
			
		}
		return j;
	}

}

package Week1.day1;

public class ConvertNegative {
	
	public static void main(String[] args) 
	{
		int num1=-40;
		int num2;
		
		if (num1<0)
		{
			num2 = num1 * -1;
			System.out.println(" Negative number " +num1+ " is converted to a Postive number " +num2);
		}
		else
		{
			System.out.println(num1+ " is a Positive Number");
		}
	}

}

package Week1.day1;

public class Fibonacciseries {

	public static void main(String[] args) 
	{	
		int n1 = 0;
		int n2 = 1;
		int tot;
		System.out.println(n1);
		
		for (int i=1; i <= 8; i++)
		{
			tot = n1 + n2;
			System.out.println(n2);
			n1=n2;
			n2=tot;
		
		}
	}
}

package week1.day1;

public class JavaBasics {

	public static void main(String[] args) 
	{
		JavaBasics obj = new JavaBasics();
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		System.out.println("Addition " + obj.addNumber(firstNum, secondNum));
		System.out.println("Subtraction " + obj.SubNumber(firstNum, secondNum));
		System.out.println("Multiplication  " + obj.MultNumber(firstNum, secondNum));
		System.out.println("Division " + obj.DivNumber(firstNum, secondNum));

	}
	
	public int addNumber(int a, int b)
	{
		return a+b;
	}
	
	public int SubNumber(int a, int b)
	{
		return Math.abs(a-b);
	}
	
	public int MultNumber(int a, int b)
	{
		return a*b;
	}
	
	public int DivNumber(int a, int b)
	{
		return a/b;
	}
	
}

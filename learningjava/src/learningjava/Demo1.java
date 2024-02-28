package learningjava;

  class Demo1
 {
	
 public boolean Palindromecheck(String str)
 {
	String Reverse ="" ;
	boolean answer=false;
	for(int i= str.length()-1;i>=0;i--)
	{
		Reverse= Reverse+ str.charAt(i);
	}
	if(str.equalsIgnoreCase(Reverse))
	{
		answer= true;
	}
	
	return answer;
 }
	public static void main(String[] args)
	{
	
		Demo1 obj= new Demo1();
		boolean A= obj.Palindromecheck("DON");
	if (A==true)
	{
		System.out.println("The String is a Palindrome");
	}
	else
	{
		System.out.println("The String is not a Palindrome");
	}
 }
 }

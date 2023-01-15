
// 2. Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
// 5*1=5.......5*10=50)




public class Question2 {
	
	public void Multiplication(int no)
	{
		for(int i = 1; i<=10;i++)
		{
		
	System.out.println(no +"*" +i +"="+(no*i));
	
		}
		
		
	}

	public static void main(String[] args) {
		

		Question2 multi = new Question2();
		multi.Multiplication(5);
		
		
		
	}

}

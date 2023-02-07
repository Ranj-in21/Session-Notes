package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 34343;
		int temp = 0 ;
		for(int i=0;i<5;i++) {
			temp = temp*10 + num%10;
			num = num/10;
		}
		System.out.println(temp);
		if(num==temp) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
		
	}

}

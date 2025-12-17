import java.util.*;
// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : "); // even odd 
// 		int num  = sc.nextInt();

// 		if( num % 2== 0)
// 		{
// 			System.out.println(num + " is Even Number.");
// 		}
// 		else{
// 			System.out.println(num + " is Odd Number.");
// 		}
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : "); // prime no
// 		int num  = sc.nextInt();
// 		int cnt = 2;
// 		for(int i = 2; i < num/2;i++)
// 		{
// 			if(num % i == 0)
// 			{

// 				cnt++;
// 			}
// 		}

// 		if(cnt == 2){
// 			System.out.println("Prime");
// 		}else{
// 			System.out.println("Not Prime.");
// 		}
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int fact = 1;
// 		for(int i = 1; i<= num;i++)
// 		{
// 			fact *= i;
// 		}
// 		System.out.println(fact);
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
		
// 		for(int i = 1; i<= num;i++)
// 		{
// 			if(num % i == 0)System.out.print(i + " ");
// 		}
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
		
// 		int a = 0,b = 1;
// 		System.out.print(a + " " + b);
// 		for(int i = 1; i<= num;i++)
// 		{
// 			int c =  a +b;
// 			System.out.print(" "+ c + " ");
// 			a = b;
// 			b = c;
// 		}
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int dup = num;
		
// 		int rev = 0;

// 		while(num != 0)
// 		{
// 			int d = num % 10;
// 			rev = rev * 10 + d;
// 			num /= 10;
// 		}

// 		System.out.println(dup + " is reversed : " + rev);
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int dup = num;
		
// 		int cnt = 0;

// 		while(num != 0)
// 		{
// 		cnt++;
// 			num /= 10;
// 		}

// 		System.out.println(dup + " contain a : " + cnt + " digits.");
		
// 	}
	
// }


// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();

		
// 		int pro = 1;

// 		while(num != 0)
// 		{
// 			int d = num % 10;
// 			pro *= d;
// 			num /= 10;
// 		}

// 		System.out.println("product of digits is : " + pro );
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int dup = num;

// 		int sum = 0;
		
// 		while( num != 0)
// 		{
// 			int d = num % 10;
// 			sum += d;
// 			num /= 10;
// 		}
// 		System.out.println( dup +" sum Of Digits is : " + sum);
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int dup = num;
		
// 		int rev = 0;

// 		while(num != 0)
// 		{
// 			int d = num % 10;
// 			rev = rev * 10 + d;
// 			num /= 10;
// 		}

// 		if(rev == dup)
// 		{
// 			System.out.println("Palindrome.");
// 		}
// 		else{
// 			System.out.println("Not Palindrome.");
			
// 			}
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Number : ");
// 		int num  = sc.nextInt();
// 		int dup = num;
		
// 		int rev = 0;

// 		while(num != 0)
// 		{
// 			int d = num % 10;
// 			rev = rev * 10 + d;
// 			num /= 10;
// 		}

// 		if(rev == dup)
// 		{
// 			System.out.println("Palindrome.");
// 		}
// 		else{
// 			System.out.println("Not Palindrome.");
			
// 			}
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the String  : ");
// 		String str  = sc.next();
		
// 		String revstr = "";

// 		for(int i = str.length()-1; i >= 0;i--)
// 		{
// 			revstr  = revstr + str.charAt(i);
// 		}

// 		System.out.println(str + " reverse String : " + revstr);

		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the String  : ");
// 		String str  = sc.next();
		
// 		String revstr = "";
// 		int count = 0;
// 		for(int i = 0; i < str.length();i++)
// 		{
// 			int ch = str.toUpperCase().charAt(i);
// 			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
// 			{
// 				count++;
// 			}
// 		}

// 		System.out.println("Count of vowels in the " + str + " is : " + count + " .");
		
// 	}
	
// }

// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Size of array  : ");
// 		int n  = sc.nextInt();

// 		int [] arr = new int [n];

// 		for (int i = 0; i < n; i++) {
// 			arr[i]  = (int ) (Math.random() * 100);
			
// 		}
// 		System.out.println(Arrays.toString(arr));

// 		int max = arr[0];

// 		for (int i = 1; i < arr.length ;i++ ) {
// 			if( max < arr[i])
// 			{
// 				max = arr[i];
// 			}
			
// 		}

// 		System.out.println(" maximum value of array is : " + max);


		
		
// 	}
	
// }


// class Practice{

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the Size of array  : ");
// 		int n  = sc.nextInt();

// 		int [] arr = new int [n];

// 		for (int i = 0; i < n; i++) {
// 			arr[i]  = (int ) (Math.random() * 100);
			
// 		}
// 		System.out.println(Arrays.toString(arr));

// 		int min = arr[0];

// 		for (int i = 1; i < arr.length ;i++ ) {
// 			if( min > arr[i])
// 			{
// 				min = arr[i];
// 			}
			
// 		}

// 		System.out.println(" minimum value of array is : " + min);


		
		
// 	}
	
// }


class Practice{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of array  : ");
		int n  = sc.nextInt();

		int [] arr = new int [n];

		for (;;) {
			arr[i]  = (int ) (Math.random() * 100);

			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}




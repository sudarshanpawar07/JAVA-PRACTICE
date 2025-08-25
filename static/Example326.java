class Example326
{
	public static void main(String [] args)
	{
		System.out.print("main() ");

		System.out.println(Example324.a);
		System.out.println(Example324.a);
		System.out.println(Example324.a);
		System.out.println(Example324.a);

	}
}
class Example324
{
	static int a = 123;
	static{
		System.out.println(" static block example323"); // int this program bytecopde is generated 
	      }
}
/*
C:\Users\Lenovo\OneDrive\Desktop\M65\Static>javap -c Example326
Compiled from "Example326.java"
class Example326 {
  Example326();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String main()
       5: invokevirtual #15                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       8: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: getstatic     #21                 // Field Example324.a:I
      14: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
      17: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      20: getstatic     #21                 // Field Example324.a:I
      23: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
      26: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      29: getstatic     #21                 // Field Example324.a:I
      32: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
      35: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      38: getstatic     #21                 // Field Example324.a:I
      41: invokevirtual #27                 // Method java/io/PrintStream.println:(I)V
      44: return
}
*/
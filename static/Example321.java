class Example321
{
	public static void main(String [] args)
	{
		System.out.print("main() ");
	}
}
class Example323
{
	static int a = 123;
	static{
		System.out.println(" static block example323"); // this statis block is not called int the bytcode in driver class we havent give class name as refernce
	      }
}
/*

Compiled from "Example321.java"
class Example321 {
  Example321();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String main()
       5: invokevirtual #15                 // Method java/io/PrintStream.print:(Ljava/lang/String;)V
       8: return
} 
*/
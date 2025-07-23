class SwitchExpression {
    public static void main(String[] args) {
        for (char ch = 0; ch <= 127; ch++) 
{
            switch (ch) {
               	 case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println( ch + " is vowel");

                
            };

                    }
    }
}

/*
String result = switch (ch)
		 {
               		 case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> ch + " is vowel";

                	default -> "";
            	};

            if (result != "")
	    {
                System.out.println(result);
            }
*/
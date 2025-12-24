class ReversedStringWord
{
	public static void main(String[] args) {
		String str = "the sky is blue";

		String [] arr = str.split(" ");

		// boolean [] trace = new boolean[arr.length];
		// System.out.println(Arrays.toString(arr));

		String rev = "";

		for (int i = arr.length-1; i >= 0;i--)
		{

					rev  = rev + arr[i] + " ";
		}

		System.out.println(rev.trim());
	}
}
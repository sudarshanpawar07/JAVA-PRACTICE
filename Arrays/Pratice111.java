import java.util.Arrays;
class Pratice111{
	public static void main(String[] args) {
		int []arr=new int[20];
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		int k=19;
		

		int op=ternarySearch(arr,arr.length,k);
		int op1=ternarySearch(arr,arr.length-1,0,k);

		System.out.println(k+":"+op);
		System.out.println(k+":"+op1);
	}
	public static int ternarySearch(int[]arr,int n,int k){
		int low=0;
		int high=n-1;
		while(low<=high){
			int mid1=low+(high-low)/3;
			int mid2=high-(high-low)/3;

			if(arr[mid1]==k)return mid1;
			if(arr[mid2]==k)return mid2;
			else if(k<arr[mid1]){
				high=mid1-1;

			}
			else if(k>arr[mid2]){
				low=mid2+1;
			}else{
				low=mid1+1;
				high=mid2-1;
			}
		}
		return -1;

	}
	public static int ternaryRecursion(int[]arr,int high,int low,int k){

		if(low<=high){
			int mid1=low+(high-low)/3;
			int mid2=high-(high-low)/3;

			if(arr[mid1]==k)return mid1;
			if(arr[mid2]==k)return mid2;
			else if(k<arr[mid1])return ternaryRecursion(arr,mid1-1,low,k);
			else if(k>arr[mid2])return ternaryRecursion(arr,high,mid2+1,k);
			else{
				return ternaryRecursion(arr,mid2-1,mid1+1,k);
			}
		}
		return -1;



	}

}
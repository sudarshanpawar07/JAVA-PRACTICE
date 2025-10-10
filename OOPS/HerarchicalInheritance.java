import java.util.* ;
class UserCollection{
	int [] arr ; 
	int indx = 0 ;

	UserCollection(int length)
	{
		arr = new int[length];
		System.out.println(Arrays.toString(arr));
	}
	
		public int size(){
			return indx;
		}
		public String displayCollection(){
			if(size()==0) return "Empty";
			String op = "";
			for (int i = 0;i<=size()-1 ;i++ ) {
				op+=arr[i]+" ";
			}
			return op ;
		}
}
class UserStack extends UserCollection{
	UserStack(int length){
		super(length);
	}
	public void push(int element){
		arr[indx] = element ;
		indx++;
	}
	public int pop(){
		int pop = arr[size()-1];
		arr[size()-1] = 0 ;
		indx++;
		return pop ;
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public int peek(){
		return arr[size()-1];
	}
}
class UserQueue extends UserCollection{
	UserQueue(int length){
		super(length);
	}
	public void offer(int element){
		arr[indx] = element ;
		indx++;
	}
	public int poll(){
		int poll = arr[0];
		for (int i = 1;i<=size()-1 ;i++ ) {
			arr[i-1] = arr[i];
		}
		arr[size()-1] = 0;
		indx--;
		return poll ;
	}
}
class HerarchicalInheritance{
	public static void main(String[] args) {
		int length = 10 ;
		UserStack stack = new UserStack(length);
		System.out.println(stack.displayCollection());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println("peek : "+ stack.peek());
		System.out.println("Size :"+stack.size());
		System.out.println("Before Removing");

		System.out.println(stack.displayCollection());

		System.out.println("Pop :"+stack.pop());
		System.out.println("Pop :"+stack.pop());
		System.out.println("Size :"+stack.size());
		System.out.println("After Removing");
		
		System.out.println(stack.displayCollection());
		System.out.println("peek : "+ stack.peek());

		System.out.println("-----------------");

		UserQueue queue = new UserQueue(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		System.out.println("Before Removing");

		System.out.println(queue.displayCollection());	
		
		System.out.println(stack.displayCollection());
		System.out.println("Size :"+queue.size());	
		System.out.println("Queue-Poll : "+queue.poll());	
		System.out.println("Queue-Poll : "+queue.poll());
		System.out.println("After Removing");
		System.out.println(queue.displayCollection());	
		System.out.println("Size :"+queue.size());		
	}
}

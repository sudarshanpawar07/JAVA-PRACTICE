import java.util.*;
class Solution
{

    public static void main(String[] args){
        int [] arr = {4,1,2,1,2};
        
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr)
    {

       boolean [] trace = new boolean[arr.length];

       for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) 
       {
            
                if(trace[i])continue;
            for(int j = i+ 1;j < arr.length;j++){

                if(arr[i] == arr[j])
                {
                    cnt++;
                    trace[j] = true;
                }

                    
                if(cnt == 1){
                    return arr[i];
                }

            }
            
        }
        return 1; 
    }
}

    
   

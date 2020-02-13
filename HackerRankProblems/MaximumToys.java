import java.util.*;

class MaximumToys{
 
static int maximumToys(int[] a, int k) {

        int sum =0,count=-1;

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length-1;j++){

                int temp =0;

                if(a[j]>a[j+1]){

                    temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp ;

                }

            }
            
        }

        for(int x :a){
            if(sum + x <= k){
                count++ ;
                sum += +x;
                 

            }
        } 

       return count;

   //  return a;

    }

    public static void main(String args[]){

        int[] arry ={10,120,30,40,4,5};
        
        int k = 30;

      int  result = maximumToys(arry,k);
        
      //  arry = maximumToys(arry, k) ;

       // System.out.println("the maximum toys are "+Arrays.toString(arry));

       System.out.println("the maximum toys are "+result);

    }}

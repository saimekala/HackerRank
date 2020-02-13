import java.util.Map;
import java.util.*;

class CountTriplets{

    public static long countTriplets(List<Long> arr, long r){

        Long count =0L;
        Long c1=0L,c2=0L;

        Map<Long,Long> leftMap = new HashMap();

        Map<Long,Long> rightMap = new HashMap();

        for(long x : arr){

            
            rightMap.put(x,rightMap.getOrDefault(x,0L)+1) ;

         }

         for(int i=0;i<arr.size();i++){

            long midterm = arr.get(i);

            rightMap.put(midterm,rightMap.getOrDefault(midterm,0L)-1);

            if(leftMap.containsKey(midterm / r) && midterm % r ==0){

                c1= leftMap.get(midterm/r);

            }

            if(rightMap.containsKey(midterm*r)){

                c2 = rightMap.get(midterm*r);

            }
                count +=c1*c2;

             leftMap.put(midterm,leftMap.getOrDefault(midterm, 0L)+1);
            
       }

        return count;
    }

     public static void main(String args[]){

       int[] arr = {1,3,3,5,9,9,27};

       List arry = Arrays.asList(arr);

       Long result = countTriplets(arry,7);

       System.out.println(result);

    }
}

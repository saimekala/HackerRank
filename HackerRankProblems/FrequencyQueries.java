import java.util.Map;

public class FrequencyQueries{
    




public static List<Integer> freqQuery(List<List<Integer>> queries ){
    
    List<Integer> lis = new List<Integer>;
    Map<Integer,Integer> map = new HashMap<Integer>();

    List<Integer> resultList = new List<Integer>;

    


for(long i =0;i<queries.size();i++){
  
    lis = queries.get(i);

    int value = lis.get(1);


    if(lis.get(0)==1){
    
    map.put(value,map.getOrDefault(value,0)+1);

    }

    elseif(lis.get(0)==2)
    {

        if(map.containsKey(value))
        {

           map.put(value,map.getOrDefault(value,0)-1) ;

        }

    }

    elseif(lis.get(0)==3)
    {
        if(map.containsValue(value)){

            list.add(1);

        }

        else

        list.add(0);
    }
}

}

public static void main(String args[]){

List<List<Integer>> list = new ArrayList<ArrayList<Integer>>();






}}
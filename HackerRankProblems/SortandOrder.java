import java.util.List;
import java.util.Map;
import java.util.*;
import java.io.*;
import java.util.ArrayList;


class SortandOrder{


public static Integer[] sort(int[] input,int[] order){

    int count =0;

    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<Integer>();

    for(int x : input){

        map.put(count++,x);
    }

    for(int x: order){

        if(map.containsValue(x)){

                list.add(x);
        }
    }

    Integer[] result = new Integer[list.size()];

    result = list.toArray(result) ;
/*
    for(int i =0;i<list.size();i++){

        result[i] = list.get(i);

    } */

    return result;

}

//time complexity O(n)


    public static void main(String[] args){

            int[] input = {5,2,9,3};
            int[] order = {8,3,9,5,2};

            System.out.println("The sorted array is "+ Arrays.toString(sort(input,order)));


    }
}
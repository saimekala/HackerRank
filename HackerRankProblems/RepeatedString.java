import java.util.Scanner;

public class RepeatedString{

    public static int repeatedString(int n, String s){

        int len = s.length();
        int count = 0;      
        
        StringBuilder sb = new StringBuilder(n);

        
        for(int i =0; i < n/len ; i++){

            sb.append(s);
        }

        String str = sb.toString();

        for(char c : str.toCharArray()){
            if(c=='a'){
                count++;
            }
        }
        
        return count;

    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        int result = repeatedString(n,s);

        System.out.println("The letter a is occuring "+result +" times");
    }
}
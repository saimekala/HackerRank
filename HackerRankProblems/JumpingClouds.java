import java.util.Scanner;

public class JumpingClouds{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int jump=-1;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<n;i++){

            if(i+2<n && a[i]==0){
                i++;
            }
            jump++;
        }

        System.out.println("The minimun number of jumps "+ jump);

    }
}

import java.util.Scanner;
public class Odd_even{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n);
        }
        else{
            System.out.println("It's not even");
        }
    }
}
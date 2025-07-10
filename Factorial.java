import java.util.Scanner;
public class Factorial{
    public static void fact(int n){
        int fact=1;
        if(n==0||n==1){
            fact=1;
        }
        else{
            for(int i=2;i<=n;i++){
                fact=fact*i;
            }
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
 }
    

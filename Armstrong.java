import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int arm=0;
      while(n!=0){
        int dig=n%10;
        arm=arm+(dig*dig*dig);
        n=n/10;
      }
      if(arm==temp){
        System.out.println("Armstrong number");
      }else{
        System.out.println("Not an Armstrong number");
      }
    }
}
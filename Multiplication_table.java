import java.util.Scanner;
public class Multiplication_table{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=1;i<n;i++){
    System.out.println(i+"*"+m+"="+(i*m));
}
}
}
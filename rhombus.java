package patterns;
import java.util.*;
public class rhombus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
 
 
            //num
            for(int j=1; j<=n; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
       
 
 
    }
}

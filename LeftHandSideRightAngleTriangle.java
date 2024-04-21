package patterns;
import java.util.*;
public class LeftHandSideRightAngleTriangle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("give a number");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

package patterns;
import java.util.*;
public class rectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows do you want");
        int n=sc.nextInt();
        System.out.println("how many coloums do you want");
        int m=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

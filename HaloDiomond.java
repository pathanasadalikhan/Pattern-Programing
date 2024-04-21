package patterns;
import java.util.*;
public class HaloDiomond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                //System.out.print("*");
                if(j==1 ||j==2*(i-1)+1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                //System.out.print("*");
                if(j==1 ||i==n ||j==2*(i-1)+1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}
// input
// 5
// output
//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *
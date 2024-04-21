package patterns;
import java.util.*;
public class invertPyramidNum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nor=n, noc=1;
        for(int i=1;i<=(n*2)-1;i++){
            for(int j=1;j<=nor;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=noc;j++){
                System.out.print(j+" ");
            }
            if(i<n){
                noc++;
                nor--;
            }
            else{
                noc--;
                nor++;
            }
            System.out.println();
        }
    }
}
// input
// 5
// output
//      1
//     1 2 
//    1 2 3
//   1 2 3 4
//  1 2 3 4 5
//   1 2 3 4
//    1 2 3
//     1 2
//      1

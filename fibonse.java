package patterns;
import java.util.*;
public class fibonse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
//input
//7
//output
// 0
// 1
// 1
// 2
// 3
// 5
// 8


//input
//10
//output
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34

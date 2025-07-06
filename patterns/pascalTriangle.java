
import java.util.Scanner;
public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        int space=n;
        int num;
        for(int i=0;i<n;i++){
            // for spaces
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            space--;
            System.out.println();
        }

    }
}

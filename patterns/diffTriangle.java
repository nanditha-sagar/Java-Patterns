import java.util.Scanner;

public class diffTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int s=1;
        for(int i=1;i<=n;i++){
            // for spaces
            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }
            int val=s;
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val+=2;
            }

            s++;
            System.out.println();
        }
    }
}

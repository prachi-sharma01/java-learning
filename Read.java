import java.util.Scanner;

public class Read {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        int z = x+y;
        System.out.println("sum is"+z);
    }
}

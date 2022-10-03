import java.util.Scanner;

public class ConditiolStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the two no.");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if (num1>num2){
            System.out.println("largest no. is="+ num1);
        }
        else{
            System.out.println("largest no. is="+ num2);
        }

    }
}

import javax.swing.*;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("enter your age");
        int x=age.nextInt();

        if(x>=18) {
            System.out.println("you are applicable for vote");
        }
            else{
                System.out.println("you are not applicable for vote");

            }


    }
}

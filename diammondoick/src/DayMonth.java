import java.util.Scanner;

public class DayMonth {
    public static void main(String[] args) {
        int m,month,remday;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the days");
        m=s.nextInt();
        month=m/30;
        System.out.println("no.of month="+month);
        remday=(m-(month*30));
        System.out.println("no.of remaing days="+remday);




    }
}

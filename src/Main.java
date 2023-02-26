import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double result =0;
        System.out.println("Sayıyı giriniz:");
        num = input.nextInt();

        for(double x =1 ; x<=num ;x++){
            result += (1/x);

        }

        System.out.println(result);

    }
}
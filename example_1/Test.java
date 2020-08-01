import java.util.Scanner;


public class Test {
    public static void main (String[] args){
        int arguments=0;
        int argumentsCount=0;
        System.out.println("введите количество чисел");
        Scanner scan = new Scanner(System.in);
        argumentsCount=scan.nextInt();
        System.out.println("вводите числа");
        for (int i=argumentsCount;i>0;i--){
            arguments+=scan.nextInt();
        }
        System.out.println("сумма введённых чисел ");
    }
}

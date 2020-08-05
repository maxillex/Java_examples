import java.util.Scanner;

public class Tome1_Test1 {
    public static void main (String[] args){
            int arguments=0;
            int argumentsCount;
            System.out.println("введите количество чисел");
            Scanner scan = new Scanner(System.in);
            argumentsCount=scan.nextInt();
            System.out.println("вводите числа");
            for (int i=argumentsCount;i>0;i--){
                arguments+=scan.nextInt();
            }System.out.println("сумма введённых чисел "+ arguments);
    }
}


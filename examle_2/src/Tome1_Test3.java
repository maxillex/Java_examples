import java.util.Scanner;

public class Tome1_Test3 {
    public static void main(String[] args) {
        int n = 10,max=0,min=0;
        int[] numbers = new int[n];
        System.out.println("Заполните массив целыми числами");
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i=0;i<n;i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("\nЧётные числа: ");
        for (int i=0;i<n;i++)
            if (numbers[i] % 2 == 0) {
                System.out.print(" " + numbers[i] + " ");
            }
        System.out.println("\nНечётные числа: ");
        for (int i=0;i<n;i++)
            if (numbers[i] % 2 == 1) {
                System.out.print(" " + numbers[i] + " ");
            }
        for(int i=0;i<n;i++){
            if (i==0){
                max=numbers[i];
                min=numbers[i];
            }
            if (max<=numbers[i]){
                max=numbers[i];
            }
            if (min>=numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("\nМаксимальное значение: "+max+"\nМинимальное значение: "+min);
        System.out.println("\nЧисла которые делятся на 3: ");
        for (int i=0;i<n;i++)
            if (numbers[i] % 3 == 0) {
                System.out.print(" " + numbers[i] + " ");
            }
        System.out.println("\nЧисла которые делятся на 9: ");
        for (int i=0;i<n;i++)
            if (numbers[i] % 9 == 0) {
                System.out.print(" " + numbers[i] + " ");
            }
        
    }
}

import java.util.Scanner;

public class Tome1_Test3 {
    public static void main(String[] args) {
        int numbersCount,max=0,min=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество используемых чисел");
        numbersCount=scan.nextInt();
        int[] numbers = new int[numbersCount];
        System.out.println("Заполните массив целыми числами");
        for (int i=0;i<numbersCount;i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i=0;i<numbersCount;i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("\nЧётные числа: ");
        for (int i=0;i<numbersCount;i++)
            if (numbers[i] % 2 == Math.abs(0)) {
                System.out.print(" " + numbers[i] + " ");
            }
        System.out.println("\nНечётные числа: ");
        for (int i=0;i<numbersCount;i++)
            if (numbers[i] % 2 == Math.abs(1)) {
                System.out.print(" " + numbers[i] + " ");
            }

        for(int i=0;i<numbersCount;i++){
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
        for (int i=0;i<numbersCount;i++)
            if (numbers[i] % 3 == 0&&numbers[i]!=0) {
                System.out.print(" " + numbers[i] + " ");
            }
        System.out.println("\nЧисла которые делятся на 9: ");
        for (int i=0;i<numbersCount;i++)
            if (numbers[i] % 9 == 0&&numbers[i]!=0) {
                System.out.print(" " + numbers[i] + " ");
            }
        //пытаюсь изобразить сортировку пузырьком причём по модулю
        System.out.println("\nОтсортированный массив по абсолютному значению:");
            int bubbleSortTemp;
            for (int j=1;j<numbersCount;j++){
                for (int i=0;i<numbersCount-j;i++){
                    if (Math.abs(numbers[i])>Math.abs(numbers[i+1])) {
                        bubbleSortTemp=numbers[i+1];
                        numbers[i + 1] = numbers[i];
                        numbers[i]=bubbleSortTemp;
                        //swap или что-то подобное не нашёл, пришлось использовать костыль
                    }
                }
            }
        for (int i=0;i<numbersCount;i++) {
            System.out.print(numbers[i] + "  ");
        }

        System.out.println("\nОтсортированный массив по возрастанию");
        for (int j=1;j<numbersCount;j++){
            for (int i=0;i<numbersCount-j;i++){
                if (numbers[i]>numbers[i+1]) {
                    bubbleSortTemp=numbers[i+1];
                    numbers[i + 1] = numbers[i];
                    numbers[i]=bubbleSortTemp;
                }
            }
        }
        for (int i=0;i<numbersCount;i++) {
            System.out.print(numbers[i] + "  ");
        }

        System.out.println("\nОтсортированный массив по убыванию");
        for (int j=1;j<numbersCount;j++){
            for (int i=0;i<numbersCount-j;i++){
                if (numbers[i]<numbers[i+1]) {
                    bubbleSortTemp=numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1]=bubbleSortTemp;
                }
            }
        }
        for (int i=0;i<numbersCount;i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("\nЧисла Фибоначчи для "+numbersCount+"-ти элементов:");
        int fibonacciTemp0=1;
        int fibonacciTemp1=1;
        int fibonacciTemp2;
        System.out.print(fibonacciTemp0+" "+fibonacciTemp1+" ");
        for (int i=3;i<=numbersCount;i++){
            fibonacciTemp2=fibonacciTemp0+fibonacciTemp1;
            System.out.print(fibonacciTemp2+" ");
            fibonacciTemp0=fibonacciTemp1;
            fibonacciTemp1=fibonacciTemp2;
        }
        System.out.println();

    }
}

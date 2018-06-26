import java.util.LinkedList;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        Integer element = scanner.nextInt();

        int x = 0;
        while (element>-1){
            numbers.add(element);
            element = scanner.nextInt();

        }

        int allNumbers = numbers.get(0);
        int size = numbers.size();
        System.out.println(size);
        System.out.println(numbers);
        System.out.println(element.max(element, element));
        System.out.println(element.min(element, element));
    }
}

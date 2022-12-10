import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
(try быть не должно)*/
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String input = scanner.nextLine();
        if (input == "") {
            throw new NullPointerException("Пустые строки вводить нельзя");
        }
    }
}

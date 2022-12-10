import java.util.Scanner;

/* 1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
  вместо этого, необходимо повторно запросить у пользователя ввод данных.
   В этом задании не используем try catch. Пишем регулярное выражение и используем на строке метод matches.
   */
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число number: ");
        String input = scanner.next();
        while (!input.matches("\\d+\\.\\d+")) {
            System.out.println("Введите дробное число number: ");
            input = scanner.next();
        }
        float number = Float.parseFloat(input);
        System.out.println(number);

    }
}






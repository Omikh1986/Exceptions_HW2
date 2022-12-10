/* Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/

/*public class task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 0;
        int i = 3;
        if (b == 0) throw new ArithmeticException("Ошибка - деление на ноль");
        System.out.println(a / b);
        System.out.println(23 + 234);
        int[] abc = {1, 2};
        if (i < 0 | i >= abc.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс массива выходит за его пределы");
        }
        abc[i] = 9;
          }

}*/

// try / catch - если в задании имелось ввиду исправить порядок следования обработки ошибок -
// подкласс должен обрабатываться до обработки супер класса.

/*public class task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 1;
        try {
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}*/




/* Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/

/*public class task2 {
    public static void main(String[] args) {
        int intArray[] = {0, 1, 3, 5, 6, 8, 10, 8, 9};
        int d = 1;
        if (d == 0) throw new ArithmeticException("На ноль делить нельзя");
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}*/

// можно также добавить проверку на соответствие индекса пределам массива:

/*public class task2 {
    public static void main(String[] args) {
        int intArray[] = {0, 1, 3, 5, 6, 8, 10, 8, 9};
        int d = 0;
        int i = 0;
        if (i >= intArray.length | i < 0){
            throw new ArrayIndexOutOfBoundsException("индекс элемента массива выходит за его пределы");
        }
        if (d == 0) throw new ArithmeticException("На ноль делить нельзя");
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}*/

//try/catch

/*public class task2 {
    public static void main(String[] args) {
        int intArray[] = {0, 1, 3, 5, 6, 8, 10, 8, 9};
        int d = 1;
        try {
            double catchedRes1 = intArray[10] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}*/


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWord();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWord() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = 7;
        int b = 5;
        int i = a + b;
        if (i > 0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательна");
        }

    }
    public static void printColor() {
        int value = 310;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if ( value > 0 && value <= 100) {
                System.out.println("Жёлтый");
        }
        if (value > 100){
            System.out.println("Зелёный");
        }

    }
    public static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a>=b) {
            System.out.println("a>=b");
        }
            else System.out.println("a<b");

    }
}

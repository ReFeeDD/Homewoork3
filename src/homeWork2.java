public class homeWork2 {
    public static void main(String[] args) {
        sumCheck();
        NumberCheck();
        System.out.println(isNegative(5));
        TextTime(5, "Hello");


    }
    public static void sumCheck() {
        int a = 115;
        int b = 3;
        int c = a+b;
        boolean sumcheck = c >= 10 && c <= 20 ;
        System.out.println(sumcheck);
    }

    public static void NumberCheck() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Positive");
        }
        else
            System.out.println("Negative");
    }
    public static boolean isNegative(int x) {
        if (x>=0) {
            return true;
        }
        return false;

    }

        public static void TextTime(int y, String x) {
       for ( y=y ; y>0; y--) {
           System.out.println(x);
        }
    }

}

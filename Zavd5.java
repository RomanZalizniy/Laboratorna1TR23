public class Zavd5 {
    public static void main(String[] args) {
        int num = 412;

        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }

        System.out.println("Результат: " + revNum);
    }
}


package handson3;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
            if (i > 15) {
                break;
            }
        } while ( i <=20 );
    }
}

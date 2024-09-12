package handson3;

public class ForEach {
    public static void main(String[] args) {
        int[] angka = new int[20];

        for (int i = 1; i <= 20; i++){
            angka[i-1]=i;
        }

        for (int i : angka){
            if (i % 3 == 0 ){
                continue;
            }
            else if (i > 15){
                break;
            }
            System.out.println(i);
        }
    }
}

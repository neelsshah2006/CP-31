import java.util.Scanner;

public class AAmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, Math.abs(sc.nextInt()));
        }
        sc.close();
        System.out.println(min);
    }
}
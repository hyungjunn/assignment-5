import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int a = InputView.inputNumber();

        int r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0; // 주사위 눈이 나온 횟수 0으로 초기화

        // 입력한 횟수만큼 주사위를 던지는걸 반복한다
        // 어떠한 주사위 눈이 나오면 그 주사위 눈이 나온 횟수를 1씩 증가시킨다
        for (int i = 0; i < a; i++) {
            double b = Math.random() * 6;
            if (b >= 0 && b < 1) {
                r1++;
            } else if (b >= 1 && b < 2) {
                r2++;
            } else if (b >= 2 && b < 3) {
                r3++;
            } else if (b >= 3 && b < 4) {
                r4++;
            } else if (b >= 4 && b < 5) {
                r5++;
            } else if (b >= 5 && b < 6) {
                r6++;
            }
        }

        // 몇 번 나왔는지 출력한다
        System.out.printf("1은 %d번 나왔습니다.\n", r1);
        System.out.printf("2은 %d번 나왔습니다.\n", r2);
        System.out.printf("3은 %d번 나왔습니다.\n", r3);
        System.out.printf("4은 %d번 나왔습니다.\n", r4);
        System.out.printf("5은 %d번 나왔습니다.\n", r5);
        System.out.printf("6은 %d번 나왔습니다.\n", r6);
    }
}

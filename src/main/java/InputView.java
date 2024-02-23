import java.util.Scanner;

public class InputView {
    public static int inputNumber() {
        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}

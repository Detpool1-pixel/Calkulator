import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Calculator---");

        System.out.print("-> ");
        int a = scanner.nextInt();
        System.out.print("");
        char cal = scanner.next().charAt(0);
        switch (cal) {
            case '+':
                System.out.print("-> ");
                System.out.println(a + scanner.nextInt());
                break;
            case '-':
                System.out.print("-> ");
                System.out.println(a - scanner.nextInt());
                break;
            case '*':
                System.out.print("-> ");
                System.out.println(a * scanner.nextInt());
                break;
            case '/':
                System.out.print("-> ");
                System.out.println(a / scanner.nextInt());
                break;
            default: try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid operator");
            }
            break;
        }
    }
}
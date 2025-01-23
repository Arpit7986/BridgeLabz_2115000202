import java.util.*;
public class RocketLaunchForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
    }
}

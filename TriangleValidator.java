import java.util.Arrays;
import java.util.Scanner;

public class TriangleValidator {
    public static boolean canFormTriangle(long side1, long side2, long side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        long[] sides = {side1, side2, side3};
        Arrays.sort(sides);

        return sides[0] > sides[2] - sides[1];
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap 3 canh cua tam giac: ");

            if (!scanner.hasNextLong()) {
                System.out.println("nhap 3 so nguyen duong.");
                return;
            }
            long side1 = scanner.nextLong();
            if (!scanner.hasNextLong()) {
                System.out.println("nhap 3 so nguyen duong.");
                return;
            }
            long side2 = scanner.nextLong();
            if (!scanner.hasNextLong()) {
                System.out.println("nhap 3 so nguyen duong.");
                return;
            }
            long side3 = scanner.nextLong();

            if (canFormTriangle(side1, side2, side3)) {
                System.out.println("3 canh tren co the tao thanh mot tam giac.");
            } else {
                System.out.println("3 canh tren khong the tao thanh mot tam giac.");
            }
        }
    }
}

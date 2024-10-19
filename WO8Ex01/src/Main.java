import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số nguyên đầu tiên
            System.out.println("nhap so nguyen thu nhat: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            // Nhập số nguyên thứ hai
            System.out.println("nhap so nguyen thu hai: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Nhập toán tử
            System.out.println("nhap toan tu (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            // Thực hiện phép tính
            int result = calculate(num1, num2, operator);

            // In ra kết quả
            System.out.println("ket qua: "+ result);

        } catch (NumberFormatException e) {
            System.out.println("Loi: nhap lai so nguyen hop le");
        } catch (ArithmeticException e) {
            System.out.println("Loi: khong the chia cho 0");
        } catch (IllegalArgumentException e){
            System.out.println("Loi: toan tu khong hop le");
        }
    }

    public static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0){
                    throw new ArithmeticException("khong the chis cho 0");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Toan tu khong hop le");
        }
    }
}
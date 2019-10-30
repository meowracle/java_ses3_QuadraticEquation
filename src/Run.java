import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminat() < 0) {
            System.out.println("No roots!");
        } else if (equation.getDiscriminat() == 0) {
            System.out.println("Equation has 1 root: " + equation.getRoot1());
        } else {
            System.out.println("Equation has 2 root: root 1: " + equation.getRoot1() + " , root 2: " + equation.getRoot2());
        }
    }
}

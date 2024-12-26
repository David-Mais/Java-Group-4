package savarjisho1;

import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("შეიყვანეთ მრავალკუთხედის გვერდების რაოდენობა: ");
        int sides = sc.nextInt();
        System.out.print("შეიყვანეთ მრავალკუთხედის გვერდების სიგრძე: ");
        double polygonLength = sc.nextDouble();

        System.out.print("შეიყვანეთ სამკუთხედის გვერდების სიგრძე: ");
        double triangleLength = sc.nextDouble();

        System.out.print("შეიყვანეთ კვადრატის გვერდების სიგრძე: ");
        double squareLength = sc.nextDouble();

        Polygon polygon = new Polygon(sides, polygonLength);
        Triangle triangle = new Triangle(triangleLength);
        Square square = new Square(squareLength);

        System.out.println("\nმრავალკუთხედის პერიმეტრი: " + polygon.perimeter());
        System.out.println("სამკუთხედის პერიმეტრი: " + triangle.perimeter());
        System.out.println("კვადრატის პერიმეტრი: " + square.perimeter());
    }
}

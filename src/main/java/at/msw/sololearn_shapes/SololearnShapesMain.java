package at.msw.sololearn_shapes;

import java.util.Scanner;

public class SololearnShapesMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);

        a.area();
        b.area();
    }
}

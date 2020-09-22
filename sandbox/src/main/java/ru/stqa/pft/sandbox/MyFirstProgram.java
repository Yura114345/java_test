package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello ("world");
    hello ("user");
    hello ("Yuri");

    Square s = new Square(5);
    System.out.println("Плрщадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Плрщадь прямоугольника со сторонвми " + r.a + " и " + r.b +" = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
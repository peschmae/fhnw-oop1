package ch.mpetermann.fhnw.oop1.ctrl_struct;

import java.util.Scanner;

public class ScannerTest {

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter some text: ");
      String s = scanner.nextLine();
      System.out.println(s);
    }
  }
}

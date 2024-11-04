import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите пример: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        if (a>10 || b>10) {
            throw new Exception  ("Вы ввели неверное число!");
        }
        if (elements[1].equals("+")) {
            System.out.println(a + b);
        } else if (elements[1].equals("-")) {
            System.out.println(a - b);
        } else if (elements[1].equals("*")) {
            System.out.println(a * b);
        } else if (elements[1].equals("/")) {
            System.out.println(a / b);
        }else {
            throw new Exception ("Вы ввели неверный знак!");
        }




        }
    }










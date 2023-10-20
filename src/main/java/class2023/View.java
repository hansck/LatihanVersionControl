package View;

import java.util.Scanner;
import Controller.*;

public class View {
    Controller control = new Controller();
    Scanner scan = new Scanner(System.in);

    public void menu() {
        Boolean exit = false;
        while (!exit) {
            System.out.println(
                    "1. Show User Post \n" +
                            "2. Show Message \n" +
                            "3. Change Post State \n" +
                            "4. Show User Best Post \n" +
                            "5. Exit");
            System.out.print("Pilih Menu :");
            int menu = scan.nextInt();
            switch (menu) {
                case 1:
                    break;
                case 2:
                    System.out.println(control.showPost("Post1"));                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
            System.out.println();
        }
    }
}

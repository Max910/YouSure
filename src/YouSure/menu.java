package YouSure;

import java.util.Scanner;

public class menu {
    void menu1() throws InterruptedException {
        Scanner S = new Scanner(System.in);
        ClearConsole CC = new ClearConsole();
        category1 C1 = new category1();
        category2 C2 = new category2();
        category3 C3 = new category3();

        boolean wrong_choice = true;
        char option ;

        Thread.sleep(900);
        System.out.println("\n\nHere are 3 category's from these select 1");
        System.out.println("category 1: Quiz related to Java ☕");
        Thread.sleep(900);
        System.out.println("category 2: Quiz related to General Knowledge 🧏‍ ");
        Thread.sleep(1000);
        System.out.println("category 3: Quiz related to Technology 💻 ");
        Thread.sleep(1000);
//        System.out.println("category 4: Quiz related to ");
//        Thread.sleep(1000);
//        System.out.println("category 5: Quiz related to ");
        System.out.println("\npress 1 to select to category 1\npress 2 to select to category 2\npress 3 to select to category 3\n");
        option = S.next().charAt(0);
        if (option == '0'|| option > '3'){
            while (wrong_choice){
                System.out.println("Please select valid choice");
                System.out.println("only type in between 1 to 5");
                option = S.next().charAt(0);
                if (option >='1' && option <='3'){
                    wrong_choice = false;
                }
            }
        }
        if (option == '1'){
            System.out.println("You have selected category 1: Quiz related to Java \nGood Luck");
            Thread.sleep(1000);
            CC.cs();
            C1.Category1();
        }
        if (option == '2'){
            System.out.println("You have selected category 2: Quiz related to General Knowledge \nGood Luck");
            Thread.sleep(1000);
            CC.cs();
            C2.Category2();
        }
        if (option == '3'){
            System.out.println("You have selected category 3: Quiz related to Technology \nGood Luck");
            Thread.sleep(1000);
            CC.cs();
            C3.Category3();
        }


    }
}

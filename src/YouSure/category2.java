package YouSure;


import java.util.Random;
import java.util.Scanner;

//This is Category2 only regarding General Knowledge questions
public class category2 {
    void Category2() throws InterruptedException {

        Random r = new Random();
        Scanner S = new Scanner(System.in);

        System.out.println("***Welcome to GK World!***\n\n");

        //String Array to store questions using array
        String[] Question = new String[]{"water vapor is from the sublimation of ice.", "The world famous monument ‘Pyramid’ is located in ______","'Teacher's Day' is observed on which of the date?", "India has largest deposits of ____ in the world.", "Which city is known as 'Electronic City of India'"};
        int Random_num, j; // all local Variables
        int[] b = new int[5]; // array to store random numbers size is 3
        char option, YouSure_Choice;

        for(int  i = 0; i<b.length; i++) {
            b[i]= r.nextInt(5);
            for ( j = 0; j<i;j++){
                if(b[i]==b[j]) {
                    i--;
                }
            }
        }
        for(int i=0;i<5;i++) {
            Random_num = r.nextInt(2);
            Thread.sleep(500);
            //q1 starts here
            if (b[i] == 0) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[0] + "\n");
                Thread.sleep(2000);
                if (Random_num == 1) {
                    //printing q1
                    System.out.println("A) True\nB) False");
                    System.out.println("Press A for True or Press B for False");
                    option = S.next().charAt(0);// storing A or B
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    System.out.println("\nYou Sure? It's " + "\"" + option + "\" " + "? It might be other one 👀");
                    System.out.println("If you sure press A to continue,     if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);

                    if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {

                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"True\"\nYou,re Correct!!\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"False\" and You,re Wrong!! Water vapor is from the sublimation of ice.\n");
                        }
                    }

                    Random_num = r.nextInt(2);
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[0]);
                        System.out.println("\nA) True\nB) False");
                        System.out.println("Press A for True or Press B for False");
                        option = S.next().charAt(0);
                        if (option != 'b' && option != 'a' && option != 'B' && option != 'A') {
                            boolean wrong_option = true;
                            while (wrong_option) {
                                System.out.println("You have selected invalid choice please type A or B");
                                option = S.next().charAt(0);
                                if (option == 'A' || option == 'a' || option == 'b' || option == 'B') {
                                    wrong_option = false;
                                }
                            }
                        }
                        if (Random_num == 1) {
                            System.out.println("\nWaittt!!!! You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A to continue,    to if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                                boolean wrong_option = true;
                                while (wrong_option) {
                                    System.out.println("You have selected invalid choice please type A or B");
                                    YouSure_Choice = S.next().charAt(0);
                                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                        wrong_option = false;
                                    }
                                }
                            }
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"True\"\nYou,re Correct!!\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\" and You,re Wrong!! Water vapor is from the sublimation of ice.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[0]);
                                System.out.println("\nTime to select for sure\tA) True     or\tB) False");
                                System.out.println("Press A for True or Press B for False");
                                option = S.next().charAt(0);
                                if (option != 'b' && option != 'a' && option != 'B' && option != 'A') {
                                    boolean wrong_option = true;
                                    while (wrong_option) {
                                        System.out.println("You have selected invalid choice please type A or B");
                                        option = S.next().charAt(0);
                                        if (option == 'A' || option == 'a' || option == 'b' || option == 'B') {
                                            wrong_option = false;
                                        }
                                    }
                                }
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"True\"\nYou,re Correct!!\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\" and You,re Wrong!! Water vapor is from the sublimation of ice.\n");
                                }
                            }
                        }

                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"True\"\nYou,re Correct!!\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"False\" and You,re Wrong!! Water vapor is from the sublimation of ice.\n");
                            }
                        }
                    }
                }
                else {
                    System.out.println("A) True\nB) False");
                    System.out.println("Press A for True or Press B for False");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"True\"\nYou,re Correct!!\n");

                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"False\" and You,re Wrong!! Water vapor is from the sublimation of ice.\n");
                    }
                }
            }
// q1 ends
            Thread.sleep(900);
            //q2 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 1) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[1]+ "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) Iraq\nB) Russia\nC) Egypt\nD) Greece");
                    System.out.println("Press 'A' for Iraq, Press 'B' for Russia,Press 'C' for Egypt, Press 'D' for Greece");
                    option = S.next().charAt(0);// storing option
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    System.out.println("\nYou Sure? It's " + "\"" + option + "\" " + "? It might be other one 👀");
                    System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);
                    if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nIraq not have ‘Pyramid’.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nRussia not have ‘Pyramid’.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Correct!!\nEgypt have ‘Pyramid’.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nGreece not have ‘Pyramid’.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[1]);
                        System.out.println("A) Iraq\nB) Russia\nC) Egypt\nD) Greece");
                        System.out.println("Press 'A' for Iraq, Press 'B' for Russia,Press 'C' for Egypt, Press 'D' for Greece");
                        option = S.next().charAt(0);
                        if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                            boolean wrong_option = true;
                            while (wrong_option) {
                                System.out.println("You have selected invalid choice please type A or B or C or D");
                                option = S.next().charAt(0);
                                if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                    wrong_option = false;
                                }
                            }
                        }
                        if (Random_num == 1) {
                            System.out.println("\nWaittt!!!! You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                                boolean wrong_option = true;
                                while (wrong_option) {
                                    System.out.println("You have selected invalid choice please type A or B");
                                    YouSure_Choice = S.next().charAt(0);
                                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                        wrong_option = false;
                                    }
                                }
                            }
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nIraq not have ‘Pyramid’.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nRussia not have ‘Pyramid’.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\nEgypt have ‘Pyramid’.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nGreece not have ‘Pyramid’.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[1]);
                                System.out.println("A) Iraq\nB) Russia\nC) Egypt\nD) Greece");
                                System.out.println("Press 'A' for Iraq, Press 'B' for Russia,Press 'C' for Egypt, Press 'D' for Greece");

                                option = S.next().charAt(0);
                                if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                                    boolean wrong_option = true;
                                    while (wrong_option) {
                                        System.out.println("You have selected invalid choice please type A or B or C or D");
                                        option = S.next().charAt(0);
                                        if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                            wrong_option = false;
                                        }
                                    }
                                }
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nIraq not have ‘Pyramid’.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nRussia not have ‘Pyramid’.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\nEgypt have ‘Pyramid’.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nGreece not have ‘Pyramid’.\n");
                                }
                            }
                        }
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nIraq not have ‘Pyramid’.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nRussia not have ‘Pyramid’.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Correct!!\nEgypt have ‘Pyramid’.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nGreece not have ‘Pyramid’.\n");
                            }
                        }
                    }
                }
                else {
                    System.out.println("A) Iraq\nB) Russia\nC) Egypt\nD) Greece");
                    System.out.println("Press 'A' for Iraq, Press 'B' for Russia,Press 'C' for Egypt, Press 'D' for Greece");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nIraq not have ‘Pyramid’.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nRussia not have ‘Pyramid’.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Correct!!\nEgypt have ‘Pyramid’.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nGreece not have ‘Pyramid’.\n");
                    }
                }
            }
            //q2 ends
            Thread.sleep(900);
            //q3 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 2) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[2]+ "\n");
                Thread.sleep(2000);

                if (Random_num == 1) {
                    System.out.println("A) September 5\nB) October 5\nC) August 1\nD) September 6");
                    System.out.println("Press 'A' for September 5, Press 'B' for October 5, Press 'C' for August 1, Press 'D' for September 6");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    System.out.println("\nYou Sure? It's " + "\"" + option + "\" " + "? It might be other one 👀");
                    System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);
                    if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"A\" and You,re Correct!!\nTeacher's Day' is observed on September 5.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                        }
                    }


                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[2]);
                        System.out.println("A) September 5\nB) October 5\nC) August 1\nD) September 6");
                        System.out.println("Press 'A' for September 5, Press 'B' for October 5, Press 'C' for August 1, Press 'D' for September 6");
                        option = S.next().charAt(0);
                        if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                            boolean wrong_option = true;
                            while (wrong_option) {
                                System.out.println("You have selected invalid choice please type A or B or C or D");
                                option = S.next().charAt(0);
                                if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                    wrong_option = false;
                                }
                            }
                        }
                        Random_num = r.nextInt(2);
                        if (Random_num == 1) {
                            System.out.println("\nWaittt!!!! You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                                boolean wrong_option = true;
                                while (wrong_option) {
                                    System.out.println("You have selected invalid choice please type A or B");
                                    YouSure_Choice = S.next().charAt(0);
                                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                        wrong_option = false;
                                    }
                                }
                            }
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[2]);
                                System.out.println("\nTime to select for sure\tA) September 5   or\tB) October 5  or\tC) August 1   or\tD) September 6");
                                System.out.println("Press 'A' for September 5, Press 'B' for October 5, Press 'C' for August 1, Press 'D' for September 6");

                                option = S.next().charAt(0);
                                if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                                    boolean wrong_option = true;
                                    while (wrong_option) {
                                        System.out.println("You have selected invalid choice please type A or B or C or D");
                                        option = S.next().charAt(0);
                                        if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                            wrong_option = false;
                                        }
                                    }
                                }
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                                }
                            }
                        }

                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Correct!!\nTeacher's Day' is observed on September 5.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                            }
                        }
                    }


                }

                else {
                    System.out.println("A) September 5\nB) October 5\nC) August 1\nD) September 6");
                    System.out.println("Press 'A' for September 5, Press 'B' for October 5, Press 'C' for August 1, Press 'D' for September 6");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"A\" and You,re Correct!!\nTeacher's Day' is observed on September 5.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nTeacher's Day' is observed on September 5.\n");
                    }
                }
            }
            Thread.sleep(900);
//q3 ends
            // q4 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 3) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[3]+ "\n");
                Thread.sleep(2000);


                if (Random_num == 1) {
                    System.out.println("A) gold\nB) copper\nC) mica\nD) bronze");
                    System.out.println("Press 'A' for gold, Press 'B' for copper, Press 'C' for mica, Press 'D' for bronze ");
                    option = S.next().charAt(0);// storing option
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    System.out.println("\nYou Sure? It's " + "\"" + option + "\" " + "? It might be other one 👀");
                    System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);
                    if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Correct !!\nIndia has largest deposits of mica in the world.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                        }
                    }


                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[3]);
                        System.out.println("A) gold\nB) copper\nC) mica\nD) bronze");
                        System.out.println("Press 'A' for gold, Press 'B' for copper, Press 'C' for mica, Press 'D' for bronze ");
                        option = S.next().charAt(0);
                        if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                            boolean wrong_option = true;
                            while (wrong_option) {
                                System.out.println("You have selected invalid choice please type A or B or C or D");
                                option = S.next().charAt(0);
                                if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                    wrong_option = false;
                                }
                            }
                        }
                        Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                        if (Random_num == 1) {
                            System.out.println("\nWaittt!!!! You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                                boolean wrong_option = true;
                                while (wrong_option) {
                                    System.out.println("You have selected invalid choice please type A or B");
                                    YouSure_Choice = S.next().charAt(0);
                                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                        wrong_option = false;
                                    }
                                }
                            }
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct !!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[3]);
                                System.out.println("\nTime to select for sure\tA) gold   or\tB) copper  or\tC) mica   or\tD) bronze");
                                System.out.println("Press 'A' for gold, Press 'B' for copper,Press 'C' for mica, Press 'D' for bronze");

                                option = S.next().charAt(0);
                                if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                                    boolean wrong_option = true;
                                    while (wrong_option) {
                                        System.out.println("You have selected invalid choice please type A or B or C or D");
                                        option = S.next().charAt(0);
                                        if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                            wrong_option = false;
                                        }
                                    }
                                }
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct !!\nIndia has largest deposits of mica in the world.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Correct !!\nIndia has largest deposits of mica in the world.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) gold\nB) copper\nC) mica\nD) bronze");
                    System.out.println("Press 'A' for gold, Press 'B' for copper, Press 'C' for mica, Press 'D' for bronze ");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Correct !!\nIndia has largest deposits of mica in the world.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nIndia has largest deposits of mica in the world.\n");
                    }
                }
            }
//q4 ends
            Thread.sleep(900);
            //q5 starts
            Random_num = r.nextInt(2);
            if (b[i] == 4) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[4]+ "\n");
                Thread.sleep(2000);

                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) Mumbai\nB) Hyderabad\nC) Guragon\nD) Bangalore ");
                    System.out.println("Press 'A' for Mumbai, Press 'B' for Hyderabad, Press 'C' Guragon, Press 'D' Bangalore ");
                    option = S.next().charAt(0);// storing option
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    System.out.println("\nYou Sure? It's " + "\"" + option + "\" " + "? It might be other one 👀");
                    System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                    YouSure_Choice = S.next().charAt(0);
                    if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                        if (option == 'A' || option == 'a') {
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Correct !!\nBangalore is known as 'Electronic City of India.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[4]);
                        System.out.println("\nA) String\nB) int\nC) boolean\nD) double ");
                        System.out.println("Press 'A' for String, Press 'B' for int, Press 'C' boolean, Press 'D' double ");
                        option = S.next().charAt(0);
                        if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                            boolean wrong_option = true;
                            while (wrong_option) {
                                System.out.println("You have selected invalid choice please type A or B or C or D");
                                option = S.next().charAt(0);
                                if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                    wrong_option = false;
                                }
                            }
                        }
                        Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                        if (Random_num == 1) {
                            System.out.println("\nWaittt!!!! You Reeally sure?? It might be other one 👀");
                            System.out.println("If you sure press A to continue,    if you not sure press B to change option");
                            YouSure_Choice = S.next().charAt(0);
                            if (YouSure_Choice != 'b' && YouSure_Choice != 'a' && YouSure_Choice != 'B' && YouSure_Choice != 'A') {
                                boolean wrong_option = true;
                                while (wrong_option) {
                                    System.out.println("You have selected invalid choice please type A or B");
                                    YouSure_Choice = S.next().charAt(0);
                                    if (YouSure_Choice == 'A' || YouSure_Choice == 'a' || YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                                        wrong_option = false;
                                    }
                                }
                            }
                            if (YouSure_Choice == 'A' || YouSure_Choice == 'a') {
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Correct !!\nBangalore is known as 'Electronic City of India.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[4]);
                                System.out.println("\nTime to select for sure\tA) Mumbai   or\tB) Hyderabad  or\tC) Guragon   or\tD) Bangalore");
                                System.out.println("Press 'A' for Mumbai, Press 'B' for Hyderabad, Press 'C' Guragon, Press 'D' Bangalore ");

                                option = S.next().charAt(0);
                                if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                                    boolean wrong_option = true;
                                    while (wrong_option) {
                                        System.out.println("You have selected invalid choice please type A or B or C or D");
                                        option = S.next().charAt(0);
                                        if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                            wrong_option = false;
                                        }
                                    }
                                }
                                if (option == 'A' || option == 'a') {
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Correct !!\nBangalore is known as 'Electronic City of India.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Correct !!\nBangalore is known as 'Electronic City of India.\n");
                            }
                        }
                    }
                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) Mumbai\nB) Hyderabad\nC) Guragon\nD) Bangalore ");
                    System.out.println("Press 'A' for Mumbai, Press 'B' for Hyderabad, Press 'C' Guragon, Press 'D' Bangalore ");
                    option = S.next().charAt(0);
                    if (option != 'b' && option != 'a' && option != 'B' && option != 'A' && option != 'c' && option != 'C' && option != 'd' && option != 'D') {
                        boolean wrong_option = true;
                        while (wrong_option) {
                            System.out.println("You have selected invalid choice please type A or B or C or D");
                            option = S.next().charAt(0);
                            if (option == 'A' || option == 'a' || option == 'b' || option == 'B' || option == 'c' || option == 'C' || option == 'd' || option == 'D') {
                                wrong_option = false;
                            }
                        }
                    }
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nBangalore is known as 'Electronic City of India.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Correct !!\nBangalore is known as 'Electronic City of India.\n");
                    }
                }
            }
        }
    }
}
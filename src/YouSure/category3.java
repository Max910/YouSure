package YouSure;

import java.util.Random;
import java.util.Scanner;

//This is Category3 only regarding Technology questions
public class category3 {
    void Category3() throws InterruptedException {

        Random r = new Random();
        Scanner S = new Scanner(System.in);

        System.out.println("***Welcome to Techno World!***\n\n");
        //String Array to store questions using array
        String[] Question = new String[]{"'.MOV' extension refers usually to image file? ","'OS' computer abbreviation usually means ?", "How many computer languages are in use?", "Which of these is not a peripheral, in computer terms?", "Which of these is not an early computer?"};
        int Random_num, j; // all local Variables
        int[] b = new int[5]; // array to store random numbers size is 3
        char option, YouSure_Choice;

        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt(5);
            for (j = 0; j < i; j++) {
                if (b[i] == b[j]) {
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
                            System.out.println("You Selected \"True\"\nYou,re Wrong!! .Mov is not extension of movie file\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"False\" and You,re Correct!! .Mov is not extension of image file\n");
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
                                    System.out.println("You Selected \"True\"\nYou,re Wrong!! .Mov is not extension of movie file\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\" and You,re Correct!! .Mov is not extension of image file\n");
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
                                    System.out.println("You Selected \"True\"\nYou,re Wrong!! .Mov is not extension of movie file\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\" and You,re Correct!! .Mov is not extension of image file\n");
                                }
                            }
                        } else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"True\"\nYou,re Wrong!! .Mov is not extension of movie file\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"False\" and You,re Correct!! .Mov is not extension of image file\n");
                            }
                        }
                    }
                } else {
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
                        System.out.println("You Selected \"True\"\nYou,re Wrong!! .Mov is not extension of movie file\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"False\" and You,re Correct!! .Mov is not extension of image file\n");
                    }
                }
            }
// q1 ends
            //q2 starts here
            Thread.sleep(500);
            Random_num = r.nextInt(2);
            if (b[i] == 1) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[1] + "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) Order Significance\nB) Open Software\nC) Operating System\nD) Optical Sensor");
                    System.out.println("Press 'A' for Order Significance, Press 'B' for Open Software,Press 'C' for Operating System, Press 'D' for Optical Sensor");
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
                            System.out.println("You Selected \"A\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[1]);
                        System.out.println("A) Order Significance\nB) Open Software\nC) Operating System\nD) Optical Sensor");
                        System.out.println("Press 'A' for Order Significance, Press 'B' for Open Software,Press 'C' for Operating System, Press 'D' for Optical Sensor");
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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[1]);
                                System.out.println("A) Order Significance\nB) Open Software\nC) Operating System\nD) Optical Sensor");
                                System.out.println("Press 'A' for Order Significance, Press 'B' for Open Software,Press 'C' for Operating System, Press 'D' for Optical Sensor");

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
                                    if (option == 'A' || option == 'a') {
                                        System.out.println("You Selected \"A\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                                    }
                                    if (option == 'b' || option == 'B') {
                                        System.out.println("You Selected \"B\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                                    }
                                    if (option == 'c' || option == 'C') {
                                        System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                                    }
                                    if (option == 'd' || option == 'D') {
                                        System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                                    }
                                }
                            }
                        }
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                            }
                        }
                    }
                }
                else {
                    System.out.println("A) Order Significance\nB) Open Software\nC) Operating System\nD) Optical Sensor");
                    System.out.println("Press 'A' for Order Significance, Press 'B' for Open Software,Press 'C' for Operating System, Press 'D' for Optical Sensor");
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
                        System.out.println("You Selected \"A\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                    }
                }
            }
            //q2 ends
            Thread.sleep(500);
            //q3 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 2) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[2]+ "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) 2000\nB) 5000\nC) 50\nD) 20");
                    System.out.println("Press 'A' for 2000, Press 'B' for 5000, Press 'C' for 50, Press 'D' for 20");
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
                            System.out.println("You Selected \"A\" and You,re Correct!!\nThere are 2000 computer languages in use.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[2]);
                        System.out.println("A) 2000\nB) 5000\nC) 50\nD) 20");
                        System.out.println("Press 'A' for 2000, Press 'B' for 5000, Press 'C' for 50, Press 'D' for 20");
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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[2]);
                                System.out.println("\nTime to select for sure\tA) 2000   or\tB) 5000 or\tC) 50   or\tD) 20");
                                System.out.println("Press 'A' for 2000, Press 'B' for 5000, Press 'C' for 50, Press 'D' for 20");

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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                                }
                            }
                        }

                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Correct!!\nThere are 2000 computer languages in use.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) 2000\nB) 5000\nC) 50\nD) 20");
                    System.out.println("Press 'A' for 2000, Press 'B' for 5000, Press 'C' for 50, Press 'D' for 20");
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
                        System.out.println("You Selected \"A\" and You,re Correct!!\nThere are 2000 computer languages in use.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nThere are 2000 computer languages in use.\n");
                    }
                }
            }
            Thread.sleep(500);
//q3 ends
            // q4 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 3) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[3]+ "\n");
                Thread.sleep(2000);


                if (Random_num == 1) {
                    System.out.println("A) Keyboard\nB) Monitor\nC) Printer\nD) Motherboard");
                    System.out.println("Press 'A' for Keyboard, Press 'B' for Monitor, Press 'C' for Printer, Press 'D' for Motherboard ");
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
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                        }
                    }


                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[3]);
                        System.out.println("A) Keyboard\nB) Monitor\nC) Printer\nD) Motherboard");
                        System.out.println("Press 'A' for Keyboard, Press 'B' for Monitor, Press 'C' for Printer, Press 'D' for Motherboard ");
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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[3]);

                                System.out.println("\nTime to select for sure\tA) Keyboard   or\tB) Monitor  or\tC) Printer   or\tD) Motherboard");
                                System.out.println("Press 'A' for Keyboard, Press 'B' for Monitor, Press 'C' for Printer, Press 'D' for Motherboard ");

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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Correct!!\n'OS' computer abbreviation usually means Operating System.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\n'OS' computer abbreviation usually means Operating System\n");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) Keyboard\nB) Monitor\nC) Printer\nD) Motherboard");
                    System.out.println("Press 'A' for Keyboard, Press 'B' for Monitor, Press 'C' for Printer, Press 'D' for Motherboard ");
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
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nMotherboard is not a peripheral, in computer terms.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Correct!!\nMotherboard is not a peripheral, in computer terms.\n");
                    }
                }
            }
            Thread.sleep(500);
//q4 ends
            //q5 starts
            Random_num = r.nextInt(2);
            if (b[i] == 4) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[4] + "\n");
                Thread.sleep(2000);

                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) ENIAC\nB) UNIVAC\nC) NESC\nD) SAGE ");
                    System.out.println("Press 'A' for ENIAC, Press 'B' for UNIVAC, Press 'C' NESC, Press 'D' SAGE ");
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
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nNESC is not an early computer.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nNESC is not an early computer.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Correct!!\nNESC is not an early computer.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nNESC is not an early computer.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[4]);
                        System.out.println("A) ENIAC\nB) UNIVAC\nC) NESC\nD) SAGE ");
                        System.out.println("Press 'A' for ENIAC, Press 'B' for UNIVAC, Press 'C' NESC, Press 'D' SAGE ");
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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[4]);
                                System.out.println("\nTime to select for sure\tA) ENIAC   or\tB) UNIVAC  or\tC) NESC   or\tD) SAGE");
                                System.out.println("Press 'A' for ENIAC, Press 'B' for UNIVAC, Press 'C' NESC, Press 'D' SAGE ");


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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Correct!!\nNESC is not an early computer.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nNESC is not an early computer.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {
                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nNESC is not an early computer.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nNESC is not an early computer.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Correct!!\nNESC is not an early computer.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nNESC is not an early computer.\n");
                            }
                        }
                    }
                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) ENIAC\nB) UNIVAC\nC) NESC\nD) SAGE ");
                    System.out.println("Press 'A' for ENIAC, Press 'B' for UNIVAC, Press 'C' NESC, Press 'D' SAGE ");
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
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nNESC is not an early computer.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nNESC is not an early computer.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Correct!!\nNESC is not an early computer.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nNESC is not an early computer.\n");
                    }
                }
            }
        }
    }
}

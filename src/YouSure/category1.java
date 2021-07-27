package YouSure;

import java.util.Random;
import java.util.Scanner;

//This is Category1 only regarding java questions
public class category1 {
    void Category1() throws InterruptedException {

        Random r = new Random();
        Scanner S = new Scanner(System.in);

        System.out.println("***Welcome to Java World!***\n\n");

        //String Array to store questions using array
        String[] Question  = new String[] {"Java is short for JavaScript?", "What is the default value of byte variable", "What is the range of ‘byte’ data type?" ,"check the output of following code\nclass Test\n{\n   public static void main(String args[])\n   {\n\tint a=12;\n\tint b=0;\n\tint c=a/b;\n\tSystem.out.println(\"The value of c is\"+c);\n   }\n}", "Which of the following is not considered as data type in Java?"};
        int Random_num,j; // all local Variables
        int[] b = new int[5]; // array to store random numbers size is 3
        char option, YouSure_Choice;


//      for now Generating Random numbers from 0 to 2 and it will be stored in b[]
        for(int  i = 0; i<b.length; i++) {
            b[i]= r.nextInt(5);
            // when we generating random numbers duplicate numbers are big headache
            // so to avoid duplicate numbers like 1,2,2 or 0,0,1
            // using another for loop to check if there is duplicate number
            // if there is i will decrement as long there are duplicate Numbers once there is no duplicate num loop will exit.
            for ( j = 0; j<i;j++){
                if(b[i]==b[j]) {
                    i--;
                }
            }
        }
//        Now b[] has 0,1,2,3,4 in random manner so this help to select questions randomly instead of fixed manner

        // using for loop to print string array which has questions
        for(int i=0;i<5;i++) {
            // first generating Random Number in between 0 to 1 for You Sure Method
            Random_num = r.nextInt(2);

            //q1 starts here
            // checking b[i] = 0
            if (b[i] == 0) {
                Thread.sleep(500);
                System.out.println("Question " + (int)(i + 1) + ")\n" + Question[0]+ "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
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
                            System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
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
                                    System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript\n");
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
                                    System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"True\" and You,re Wrong!! Java is not short for JavaScript\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"False\"\nYou,re Correct!! Java is not short for JavaScript\n");
                            }
                        }
                    }
                }
                // if Random num =0 else will trigger
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
                        System.out.println("You Selected \"True\" and You,re Wrong!! \nJava is not short for JavaScript\n");

                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"False\" and You,re Correct!! \nJava is not short for JavaScript\n");
                    }
                }
            }
            Thread.sleep(900);
// q1 ends

            //q2 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 1) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[1]+ "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) 0\nB) false\nC) null\nD) not defined");
                    System.out.println("Press 'A' for 0, Press 'B' for false,Press 'C' for null, Press 'D' for not defined");
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
                            System.out.println("You Selected \"A\" and You,re Correct!!\n0 is default value of byte variable.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nfalse is not default value of byte variable.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nnull is not default value of byte variable.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nnot defined is not default value of byte variable.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    Random_num = r.nextInt(2);// generating 0 or 1 again // this second run
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[1]);
                        System.out.println("\nA) 0\nB) false\nC) null\nD) not defined");
                        System.out.println("Press 'A' for 0, Press 'B' for false,Press 'C' for null, Press 'D' for not defined");
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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\n0 is default value of byte variable.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nfalse is not default value of byte variable.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nnull is not default value of byte variable.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nnot defined is not default value of byte variable.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[1]);
                                System.out.println("\nTime to select for sure\tA) 0    or\tB) false    or\tC) null    or\tD) not defined");
                                System.out.println("Press 'A' for 0, Press 'B' for false,Press 'C' for null, Press 'D' for not defined");

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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\n0 is default value of byte variable.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nfalse is not default value of byte variable.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nnull is not default value of byte variable.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nnot defined is not default value of byte variable.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Correct!!\n0 is default value of byte variable.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nfalse is not default value of byte variable\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nnull is not default value of byte variable\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nnot defined is not default value of byte variable\n");
                            }
                        }
                    }
                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) 0\nB) false\nC) null\nD) not defined");
                    System.out.println("Press 'A' for 0, Press 'B' for false,Press 'C' for null, Press 'D' for not defined");
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
                        System.out.println("You Selected \"A\" and You,re Correct!!\n0 is default value of byte variable.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nfalse is not default value of byte variable\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nnull is not default value of byte variable\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nnot defined is not default value of byte variable\n");
                    }
                }
            }
//q3 ends
            Thread.sleep(900);
            //q3 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 2) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[2]+ "\n");
                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) -128 to 126\nB) -128 to 116\nC) -127 to 128\nD) -128 to 127");
                    System.out.println("Press 'A' for -128 to 126, Press 'B' for -128 to 116, Press 'C' for -127 to 128, Press 'D' for -128 to 127");
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
                            System.out.println("You Selected \"A\" and You,re Wrong!!\n-128 to 126 is not range of byte data type.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\n-128 to 116 is is not range of byte data type.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\n-127 to 128 is not range of byte data type.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Correct!!\n-128 to 127 is range of byte data type.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[2]);
                        System.out.println("A) -128 to 126\nB) -128 to 116\nC) -127 to 128\nD) -128 to 127");
                        System.out.println("Press 'A' for -128 to 126, Press 'B' for -128 to 116, Press 'C' for -127 to 128, Press 'D' for -128 to 127");
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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\n-128 to 126 is not range of byte data type.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\n-128 to 116 is is not range of byte data type.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\n-127 to 128 is not range of byte data type.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Correct!!\n-128 to 127 is range of byte data type.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[2]);
                                System.out.println("\nTime to select for sure\tA) -128 to 126   or\tB) -128 to 116  or\tC) -127 to 128   or\tD) -128 to 127");
                                System.out.println("Press 'A' for -128 to 126, Press 'B' for -128 to 116,Press 'C' for -127 to 128, Press 'D' for -128 to 127");

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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\n-128 to 126 is not range of byte data type.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\n-128 to 116 is is not range of byte data type.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\n-127 to 128 is not range of byte data type.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Correct!!\n-128 to 127 is range of byte data type.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\n-128 to 126 is not range of byte data type.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\n-128 to 116 is is not range of byte data type.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\n-127 to 128 is not range of byte data type.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Correct!!\n-128 to 127 is range of byte data type.\n");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) -128 to 126\nB) -128 to 116\nC) -127 to 128\nD) -128 to 127");
                    System.out.println("Press 'A' for -128 to 126, Press 'B' for -128 to 116, Press 'C' for -127 to 128, Press 'D' for -128 to 127");
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
                        System.out.println("You Selected \"A\" and You,re Wrong!!\n-128 to 126 is not range of byte data type.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\n-128 to 116 is is not range of byte data type.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\n-127 to 128 is not range of byte data type.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Correct!!\n-128 to 127 is range of byte data type.\n");
                    }
                }
            }
//q3 ends

            // q4 starts here
            Random_num = r.nextInt(2);
            if (b[i] == 3) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[3]+ "\n");
                Thread.sleep(2000);

                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) Compilation error\nB) Run time error\nC) The value of c is 0\nD) The value of c is 1 ");
                    System.out.println("Press 'A' for Compilation error, Press 'B' for Run time error, Press 'C' for The value of c is 0, Press 'D' for The value of c is 1 ");
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
                            System.out.println("You Selected \"A\" and You,re Wrong!!\nit's not Compilation error.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Correct!!\nit's Run time error.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not the value of c is 0 its Run time error.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not the value of c is 1 its Run time error.\n");
                        }
                    }

                    // this code will only trigger if user selected b option in You Sure
                    if (YouSure_Choice == 'b' || YouSure_Choice == 'B') {
                        System.out.println("\n\nBe Sure This Time!! UwU");
                        System.out.println(Question[3]);
                        System.out.println("A) Compilation error\nB) Run time error\nC) The value of c is 0\nD) The value of c is 1 ");
                        System.out.println("Press 'A' for Compilation error, Press 'B' for Run time error, Press 'C' for The value of c is 0, Press 'D' for The value of c is 1 ");
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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nit's not Compilation error.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Correct!!\nit's Run time error.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not the value of c is 0 its Run time error.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not the value of c is 1 its Run time error.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[3]);
                                System.out.println("A) Compilation error\nB) Run time error\nC) The value of c is 0\nD) The value of c is 1 ");
                                System.out.println("Press 'A' for Compilation error, Press 'B' for Run time error, Press 'C' for The value of c is 0, Press 'D' for The value of c is 1 ");

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
                                    System.out.println("You Selected \"A\" and You,re Wrong!!\nit's not Compilation error.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Correct!!\nit's Run time error.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not the value of c is 0 its Run time error.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not the value of c is 1 its Run time error.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Wrong!!\nit's not Compilation error.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Correct!!\nit's Run time error.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not the value of c is 0 its Run time error.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not the value of c is 1 its Run time error.\n");
                            }
                        }
                    }


                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) Compilation error\nB) Run time error\nC) The value of c is 0\nD) The value of c is 1 ");
                    System.out.println("Press 'A' for Compilation error, Press 'B' for Run time error, Press 'C' for The value of c is 0, Press 'D' for The value of c is 1 ");
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
                        System.out.println("You Selected \"A\" and You,re Wrong!!\nit's not Compilation error.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Correct!!\nit's Run time error.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not the value of c is 0 its Run time error.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not the value of c is 1 its Run time error.\n");
                    }
                }
            }
            Thread.sleep(900);
//q4 ends
            //q5 starts
            Random_num = r.nextInt(2);
            if (b[i] == 4) {
                System.out.println("Question " + (int) (i + 1) + ")\n" + Question[4]+ "\n");

                Thread.sleep(2000);
                // checking if random number equal to 1
                if (Random_num == 1) {
                    System.out.println("A) String\nB) int\nC) boolean\nD) double ");
                    System.out.println("Press 'A' for String, Press 'B' for int, Press 'C' boolean, Press 'D' double ");
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
                            System.out.println("You Selected \"A\" and You,re Correct!!\nit's String.\n");
                        }
                        if (option == 'b' || option == 'B') {
                            System.out.println("You Selected \"B\" and You,re Wrong!!\nit's not int, it's String.\n");
                        }
                        if (option == 'c' || option == 'C') {
                            System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not int, it's String.\n");
                        }
                        if (option == 'd' || option == 'D') {
                            System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not int, it's String.\n");
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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nit's String.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                            }
                            if (YouSure_Choice == 'B' || YouSure_Choice == 'b') {
                                System.out.println("\n\nBe Reallyyyy Sure This Time!! UwU");
                                System.out.println(Question[4]);
                                System.out.println("\nTime to select for sure\tA) String   or\tB) int  or\tC) boolean   or\tD) double");
                                System.out.println("Press 'A' for String, Press 'B' for int,Press 'C' for boolean, Press 'D' for double");

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
                                    System.out.println("You Selected \"A\" and You,re Correct!!\nit's String.\n");
                                }
                                if (option == 'b' || option == 'B') {
                                    System.out.println("You Selected \"B\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                                if (option == 'c' || option == 'C') {
                                    System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                                if (option == 'd' || option == 'D') {
                                    System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not int, it's String.\n");
                                }
                            }
                        }

                        // this else will trigger if random number is 0 in second run
                        else {

                            if (option == 'A' || option == 'a') {
                                System.out.println("You Selected \"A\" and You,re Correct!!\nit's String.\n");
                            }
                            if (option == 'b' || option == 'B') {
                                System.out.println("You Selected \"B\" and You,re Wrong!!\nit's not int, it's String.\n");
                            }
                            if (option == 'c' || option == 'C') {
                                System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not int, it's String.\n");
                            }
                            if (option == 'd' || option == 'D') {
                                System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not int, it's String.\n");
                            }
                        }
                    }
                }

                // if Random num =0 else will trigger
                else {
                    System.out.println("A) String\nB) int\nC) boolean\nD) double ");
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
                    if (option == 'A' || option == 'a') {
                        System.out.println("You Selected \"A\" and You,re Correct!!\nit's String.\n");
                    }
                    if (option == 'b' || option == 'B') {
                        System.out.println("You Selected \"B\" and You,re Wrong!!\nit's not int, it's String.\n");
                    }
                    if (option == 'c' || option == 'C') {
                        System.out.println("You Selected \"C\" and You,re Wrong!!\nit's not int, it's String.\n");
                    }
                    if (option == 'd' || option == 'D') {
                        System.out.println("You Selected \"D\" and You,re Wrong!!\nit's not int, it's String.\n");
                    }
                }
            }

        }
    }
}

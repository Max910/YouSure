package YouSure;

public class Main {
    public static void main(String[] args)throws InterruptedException  {
        ClearConsole CC = new ClearConsole();
        Art AsciiArt = new Art();
        menu menu = new menu();

        CC.cs();
        AsciiArt.Hey();
        System.out.println("Hey!🎈");
        System.out.print("Hello There🤠🐱‍👤!!");
        System.out.println("⚜ Welcome⚜ to Quiz Game💫 Called");
        Thread.sleep(1500);
//        AsciiArt.Art1();
        AsciiArt.Art2();
        menu.menu1();
        Thread.sleep(1000);
        System.out.println("🎉Quiz has completed🎉\n\t👋Bye! 👋👋Bye!!");
        System.out.print("\t\t( ´ ▽ ` )ﾉ");
        Thread.sleep(2000);
        CC.cs2();
    }
}
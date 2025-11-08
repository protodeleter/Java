import java.util.Scanner;

public class HomeWorkStrings {


    static Scanner inp = new Scanner(System.in);

    /**
     *
     */
    public HomeWorkStrings() {


//        exOne();
//        extwo();
//        exthree();
//        exfour();
//        exfive();
//        exsix();
//        exseven();
//        exeight();

        exenine();

    }


    /**
     * Get input value
     * Print  "OK" if input includes AMF chars only in any order (FAM\MFA\
     * Print "not OK" if input has some other char in a string
     */
    static void exOne() {

        String strsts = "";

        System.out.println("Enter any string to check if it starts with FMA chars");
        strsts = inp.nextLine();

        boolean flag = true;
        int cc = 0;
        for (int i = 0; i <= strsts.length() - 1; i++) {

            if (strsts.charAt(i) != 'A' && strsts.charAt(i) != 'F' && strsts.charAt(i) != 'M') {
                flag = false;
                cc++;
            }

        }

//        System.out.println(flag);
//        System.out.println(cc);

        if (flag && cc != 3) {
            System.out.println("Ok");
        } else {
            System.out.println("not OK");
        }


    }

    /**
     * Gets inp of a string with two words separated with space " "
     * Prints out length of word before space and after space
     */
    static void extwo() {

        System.out.print("Enter two words with a space between : ");
        String inpstr = inp.nextLine();

        int length = inpstr.length();
        int getSpace = inpstr.indexOf(' ');
        int secondWord = length - 1 - getSpace;
        int firstWord = length - 1 - secondWord;

        System.out.println("First Word is: " + firstWord);
        System.out.println("Second Word is: " + secondWord);

    }

    /**
     * Gets inp of 50 strings
     * Prints out how mony strings had char H in it
     */
    static void exthree() {


        int hcc = 0;
        for (int i = 0; i <= 50; i++) {

            System.out.print("Enter any string: ");
            String inpString = inp.nextLine();

            if (inpString.indexOf('H') >= 0) {
                hcc++;
            }
        }

        System.out.println("Found " + hcc + " strings with H cahr");

    }


    /**
     * Gets inp of string
     * Prints out same sting in opposite order
     */
    static void exfour() {

        System.out.print("Enter any string: ");
        String inps = inp.nextLine();
        String s2 = "";
        int len = inps.length();

        for (int i = len - 1; i >= 0; i--) {
            s2 += inps.charAt(i);
        }
        System.out.println(s2);
    }


    /**
     * Gets inp of 20 strings with space bvetween
     * Prints out how mony strings had char F after space Char
     */
    static void exfive() {

        int hcc = 0, spaceChar = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print("Enter two words with a space between : ");
            String inpString = inp.nextLine();
            spaceChar = inpString.indexOf(' ');
            if (inpString.indexOf("F", spaceChar) > 0) {
                hcc++;
            }
        }

        System.out.println("Found " + hcc + " strings with H cahr");

    }

    /**
     * Get string as input
     * gets 2 integers
     * replaces last and first chars according to integers value
     */
    static void exsix() {
        System.out.print("Enter a string: ");
        String inps = inp.nextLine();

        System.out.print("Enter X: ");
        int x = inp.nextInt();

        System.out.print("Enter Y: ");
        int y = inp.nextInt();

        int len = inps.length();


        if (x > len - 1 || y > len - 1) {
            System.out.println("numbers can be bigger the the whole string...");
        }


        String first = inps.substring(0, x);
        String middle = inps.substring(x, len - y);
        String last = inps.substring(len - y);

        String result = last + middle + first;

        System.out.println("New string: " + result);
    }

    /**
     *
     */
    static void exseven() {
        System.out.print("Enter a string: ");
        String inps = inp.nextLine();

        int len = inps.length();

        String strRepeat = inps + inps;
        String withOpposit = inps;
        String doubleChar = "";

        for (int i = len - 1; i >= 0; i--) {
            withOpposit += inps.charAt(i);
        }

        for (int i = 0; i < len; i++) {
            doubleChar += inps.substring(i, i + 1) + inps.substring(i, i + 1);
        }

        System.out.println(strRepeat);
        System.out.println(withOpposit);
        System.out.println(doubleChar);
//        METRO

    }

    /**
     * Get input string circle replacing string chars
     * get int input for number of iterations
     */
    static void exeight() {

        System.out.println("Enter String: ");
        String inps = inp.nextLine();

        System.out.println("Enter number of circles :");
        int circles = inp.nextInt(),
                len = inps.length();

        String temp = "", temp2 = "";

        if (circles <= len - 1) {
            for (int i = circles; i >= 0; i--) {
                temp = inps.substring(i, len);
                temp2 = inps.substring(0, i);
                System.out.println(temp + temp2);
            }
        } else {
            System.out.println(inps);
        }
    }

    /**
     * get string input with multiple words
     * conver every word to capital letter
     */
    static void exenine() {

        System.out.println("Enter String: ");
        String inps = inp.nextLine();


    }

}

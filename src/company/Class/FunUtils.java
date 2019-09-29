package company.Class;

import java.util.Scanner;

/**
 * Class function utils
 */
public class FunUtils {
    /**
     * Is this number positive?
     * @param str Input data
     * @return This number is positive
     */
    public static int isPositive(final Scanner str) {
        int positive = isInt(str);
        while (positive < 0){
            System.out.println("That not a positive number");
            positive = isInt(str);
        }
        return positive;
    }

    /**
     * Is this number int?
     * @param str Input data
     * @return This number is int
     */
    private static int isInt(final Scanner str){
        while (!str.hasNextInt()){
            System.out.println("That not a number!");
            str.next();
        }
        return str.nextInt();
    }
}

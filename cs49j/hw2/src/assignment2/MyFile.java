import java.io.*;
import java.util.Scanner;

public class MyFile {
    public static int writePrimes(String first, String second) {
        try (
                Scanner linescan = new Scanner(new File(first));
                FileOutputStream fos = new FileOutputStream(second)
        ) {
            while (linescan.hasNextLine()) {
                String[] wordarray = linescan.nextLine().split(",");

                for (int i = 0; i < wordarray.length; i++) {
                    String word = wordarray[i];
                    if (checkPrime(word))
                        fos.write((word + "\n").getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());
            return -1;
        }
        return 0;
    }

    public static boolean checkPrime(String word) {
        if (!isNumeric(word)) // first check if string parameter is numeric or not, if its not numeric -> return false
            return false;

        int num = Integer.parseInt(word); // then parse word as int
        if (num < 2) // first file should contain >=2 so if its less than 2 return false
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true; // if its prime number
    }

    public static boolean isNumeric(String str) // check if its numeric
    {
        if (str == null || str.isEmpty()) // if parameter is null or is empty, return false because there is nothing or null
            return false;

        int num = str.length(); // store the whole string as a num
        int i = 0;

        while (i < num) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
            i++;
        }

        return true;
    }
}

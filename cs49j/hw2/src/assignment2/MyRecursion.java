public class MyRecursion {

    public static int indexOf(String first, String second) {
        return recursiveHelper(first, second, 0);
    }

    public static int recursiveHelper(String first, String second, int index) {
        if (first.startsWith(second)) // ex2 -> if index matches first then return index(0)
            return index;

        if (second.length() > first.length()) // ex3 if substring length is bigger than original word, index = -1
            return -1;

        return recursiveHelper(first.substring(1), second, index + 1); // ex1 -> if ex2&3 does not match, do index + 1 for counting
    }
}

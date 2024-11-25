package assignment2;

import java.util.*;

public class MyCollections {
    public static void downsize(Collection<String> employees, int n)  // parameter Collection<String> and in
    {
        if ((employees == null) || (n <= 0)) // base case if there is no input
            //System.out.println("There is no input");
            throw new IllegalArgumentException("There is no input");


        //assert employees != null; // not sure if it's necessary but try not to get an error in inerator(), it was automatically created
        Iterator<String> iterator = employees.iterator();
        int cnt = 0;

        while (iterator.hasNext()) {
            iterator.next();

            if ((cnt + 1) % n == 0)
                iterator.remove();

            cnt++;
        }
    }

    public static boolean isBalanced(String s) {
        if ((s == null) || (s.isEmpty())) // base case if there is no input
        {
            //System.out.println("There is no input check1");
            return true;
        }

        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        while (cnt < s.length()) {
            char c = s.charAt(cnt); // c = chracters index num -> base = 0

            if (c == '(' || c == '[') // check the first parentheses
                stack.push(c); // if there is put into stakc

            else if (c == ')' || c == ']') {
                if (stack.isEmpty())
                    return false;

                char a = stack.pop();
                if ((c == ')' && a != '(') || (c == ']' && a != '['))
                    return false;
            }
            cnt++;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Collection<String> employees = new LinkedList<>();

        System.out.println("Empty LinkedList with employees: " + employees);

        employees.add("Tom");
        System.out.println("(1) Add tom: " + employees);

        employees.add("Bob");
        System.out.println("(2) Add bob: " + employees);

        employees.add("Cathy");
        System.out.println("(3) Add Cathy: " + employees + "\n");
        employees.add("Alice");
        employees.add("Trudy");
        employees.add("Harry");
        employees.add("Denny");

        System.out.println("Fully added: " + employees + "\n");
        downsize(employees, 3); // it will remove every 3rd elemet -> Cathy

        System.out.println("After downsize function: " + employees);

        System.out.println(isBalanced("")); // no input test
        System.out.println("\n");
        System.out.println(isBalanced("println(list.get(0))")); // true
        System.out.println(isBalanced("[] (3*5) ^2")); // true
        System.out.println(isBalanced("[(2+3)*5)^2")); // false
        System.out.println(isBalanced("println(list.get(0)")); // false
        System.out.println(isBalanced("[(3*5)]^2]")); // false
    }
}

package exam;

import java.util.*;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> ids = new Stack<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);

        Stack<Integer> grades = new Stack<Integer>();
        grades.add(20);
        grades.add(10);
        grades.add(18);

        calculate(ids , grades);
        System.out.println("Average is: "+ average(grades));
    }

    private static void calculate(Stack<Integer>  ids , Stack<Integer> grades) {
        Stack<String> result = new Stack<String>();

        for (int i = 0; i < ids.size(); i++) {
            result.add(grades.get(i) + " is grade of student number with ID : " + ids.get(i));
        }
        result.sort(Collections.reverseOrder());

        //printing
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static int average( Stack<Integer> grades){
        int total = 0;
        int length = grades.size();
        for (Integer grade : grades) {
            total = total + grade;
        }
        return total / length;
    }
}
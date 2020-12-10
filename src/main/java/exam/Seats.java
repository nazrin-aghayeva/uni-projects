package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Seats {
    public static void isBusy() {
       HashMap<Integer, String> seats = new HashMap<>();
        seats.put(0, "ok");
        seats.put(1, "busy");
        seats.put(2, "ok");
        seats.put(3, "busy");
        seats.put(4, "busy");
        seats.put(5, "ok");
        seats.put(6, "busy");
        seats.put(7, "ok");
        seats.put(8, "busy");
        seats.put(9, "busy");
        seats.put(10, "busy");
        seats.put(11, "ok");
        seats.put(12, "busy");
        seats.put(14, "busy");
        seats.put(15, "ok");
        seats.put(16, "busy");


        for (int i = 0; i < seats.size(); i++) {
            System.out.println("Please enter seat or if you want to exit enter -1:");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == -1) break;
            else if (seats.get(number).equals("ok")){
                System.out.println("Selected");
                seats.replace(number, "busy");
                break;
            }

            else {
                while (seats.get(number).equals("busy")) {
                    System.out.println("This seat is busy select another one:");
                    Scanner in = new Scanner(System.in);
                    int num = in.nextInt();
                    if (seats.get(num).equals("ok")) {
                        System.out.println("Selected");
                        seats.replace(number, "busy");
                        break;
                    }
                }
            }
        }
        System.out.println(seats);
}
    public static void main(String[] args) {
        isBusy();
    }
}

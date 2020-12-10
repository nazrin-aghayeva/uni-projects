package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Seats {
    public static void isBusy() {
       HashMap<Integer, String> seats = new HashMap<>();

        for (int i=0; i<30; i++){
            String result = ((int)(Math.random()*2)==0) ? // 0 or 1
                    "busy" :"ok";
            seats.put(i,result);
        }

        System.out.println(seats);

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
}
    public static void main(String[] args) {
        isBusy();
    }
}

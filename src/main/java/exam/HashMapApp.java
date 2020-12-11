package exam;

import java.util.*;

public class HashMapApp {
    public static HashMap<Integer, String> randomFill() {
        HashMap<Integer, String> nums = new HashMap<>();

        for (int i = 1; i <= 30; i++) {
            String result= (int) (Math.random() * 2) ==0 //0 || 1
                    ? "busy" : "ok";
            nums.put(i, result);
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(randomFill());
    }
}

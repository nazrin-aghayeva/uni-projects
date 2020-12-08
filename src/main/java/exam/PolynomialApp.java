package exam;

import java.util.*;

public class PolynomialApp {
//    static List<String> result= new ArrayList<>();
        public static void main(String[] args) {
        String polynomial = "3x^3+4x^5+6";

        String[] array = polynomial.split("\\+" );

        for (String isConstantNum : array) {
            if (isConstant(isConstantNum)) {
                System.out.println(isConstantNum);
            }
        }
    }

    public static boolean isConstant(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    // needed improve
//    public static void main(String[] args) {
//        isConstant();
//    }
//
//    public static void isConstant() {
//        HashMap<Integer, String> function = new HashMap<>();
//        function.put(0, "x");
//        function.put(1, " ");
//        function.put(2, "x");
//        function.put(3, " ");
//
//        for (int i = 0; i < function.size(); i++) {
//            if (function.get(i).equals(" ")) {
//                String constant= function.keySet().toArray()[i].toString();
//                result.add(constant);
//            }
//        }
//        System.out.println("Are constants: "+result);
//    }
}
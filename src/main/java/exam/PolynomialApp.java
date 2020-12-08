package exam;

public class PolynomialApp {
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
}
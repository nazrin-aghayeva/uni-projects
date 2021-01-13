import org.apache.commons.lang3.Range;

public class RangeApp {
    public static FilterType type= FilterType.PAN;
    public static String value= "4127622088936124";
    public static void main(String[] args) {
        System.out.println(type.getMax());
        System.out.println(Range.between(type.getMin(),type.getMax()));
        System.out.println(value.length());
        System.out.println(Range.between(type.getMin(),type.getMax()).contains(value.length()));
    }
}

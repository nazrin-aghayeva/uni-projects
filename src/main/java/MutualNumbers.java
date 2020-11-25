import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MutualNumbers {
    public static List<Integer> findMutual(List<Integer> numbers,  List<Integer> numbers2){
        return numbers.stream().filter(i-> !numbers.get(i).equals(numbers2.get(i))).collect(Collectors.toList());
    }

    public static List<Integer> doubled(List<Integer> numbers){
        return numbers.stream().map(i -> i*2).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input= new Random().ints(1, 10).boxed().limit(10).collect(Collectors.toList());
        List<Integer> input2= new Random().ints(1, 10).boxed().limit(10).collect(Collectors.toList());
        System.out.println("First list: "+ input);
        System.out.println("Second List: "+ input2);
        System.out.println("Mutual numbers are: "+findMutual(input, input2));
        System.out.println("Doubled: " + doubled(input));
    }
}

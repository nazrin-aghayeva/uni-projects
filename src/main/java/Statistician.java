import java.util.Arrays;

public class Statistician {
    double [] sequence;
    int size;
    int capacity;

    public Statistician(){
        sequence = new double[2];
        size=0;
        capacity=2;
    }

    public void nextNumber(int index,double input){
        if (size == capacity){
            ensureCapacity(2);
        }
        if (size - index >= 0) System.arraycopy(sequence, index, sequence, index + 1, size - index);
        sequence[index]=input;
        size++;
    }

    public void nextNumberEnd(double input){
        if (size == capacity){
            ensureCapacity(2);
        }
        sequence[size]=input;
        size++;
    }

    public void ensureCapacity(int minCapacity){
        double[] temp = new double[capacity*minCapacity];
        if (capacity >= 0) System.arraycopy(sequence, 0, temp, 0, capacity);
        sequence = temp;
        capacity = capacity * minCapacity;
    }

    public double median(){
        double[] list=  Arrays
                .stream(sequence)
                .sorted().toArray();
        int middle= list.length/2;
        return list[middle];
    }

    public int length(){
        return sequence.length;
    }

    public double lastNumber(){
        int last= length()-1;
        return sequence[last];
    }

    public double sum(){
        return Arrays.stream(sequence).sum();
    }

    public double mean(){
        return sum()/length()-1;
    }

    public double smallestNumber(){
        return Arrays.stream(sequence).min().orElseThrow(RuntimeException::new);
    }

    public double largestNumber(){
        return Arrays.stream(sequence).max().orElseThrow(RuntimeException::new);
    }


    @Override
    public String toString() {
        return "Statistician: "+ Arrays.toString(sequence);
    }

    public static void main(String[] args) {
        Statistician s= new Statistician();
        s.nextNumber(0,2.34);
        s.nextNumber(1,4.67);
        s.nextNumber(2,5.12);
        s.nextNumber(3,6.23);
        System.out.println("Median is: " + s.median());
        System.out.println("Last number is: " + s.lastNumber());
        System.out.println("Sum of array is: "+ s.sum());
        System.out.println("Length is: "+ s.length());
        System.out.println("Mean is: "+ s.mean());
        System.out.println("Smallest number is: "+ s.smallestNumber());
        System.out.println("Largest number is: " + s.largestNumber());
        System.out.println(s.toString());
    }
}

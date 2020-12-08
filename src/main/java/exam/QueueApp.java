package exam;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static Queue<Integer> isExist(int input){
        Queue<Integer> inputQueue= new PriorityQueue<Integer>();
        inputQueue.add(234);
        inputQueue.add(12);
        inputQueue.add(17);
        inputQueue.add(5);
        for (int i=0; i<inputQueue.size();i++){
            if (!inputQueue.contains(input)){
                inputQueue.add(input);
            }
            else
            {
                return inputQueue;
            }
        }
        return inputQueue;
    }

    public static void main(String[] args) {
        System.out.println(isExist(16));
    }
}

package exam;

import java.util.*;

import java.util.ArrayList;

public class ListApp {
    public static List<String> concatStrings(){
        List<String> names= new ArrayList<>();
        List<String> surnames= new ArrayList<>();
        List<String> result= new ArrayList<>();

        names.add("Nazrin");
        names.add("Zeynab");
        names.add("Rauf");

        surnames.add("Aghayeva");
        surnames.add("Mammadova");
        surnames.add("Hacizade");
        for (int i=0; i<names.size();i++){
            String concat= names.get(i)+" "+ surnames.get(i);
            result.add(concat);
        }
            return result;
    }

    public static void main(String[] args) {
        System.out.println(concatStrings());
    }
}

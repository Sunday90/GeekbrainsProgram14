package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

    }

    public List<Integer> subArray (ArrayList<Integer> array) {
        int start = array.lastIndexOf(4);
        if (start==-1) {
            throw new RuntimeException("No 4 in array");
        }
        return new ArrayList<Integer>(array.subList(start,array.size()));
    }

    public boolean checkArray (ArrayList<Integer> array) {
        if (!(array.contains(1) && array.contains(4))) {
            return false;
        }
        else return true;
    }
}

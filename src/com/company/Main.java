package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ar = {1,2,3,11};
        IntOnlyArrayList arrays = new IntOnlyArrayList(ar);
        System.out.println(arrays.size());
        arrays.add(13);
        System.out.println(arrays.size());
    }
}

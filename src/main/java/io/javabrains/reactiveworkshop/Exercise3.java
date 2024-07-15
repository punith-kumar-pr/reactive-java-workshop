package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<Integer> numbers = ReactiveSources.intNumbersFlux().toStream().toList();
        System.out.println("List is " + numbers);
        System.out.println("size " + numbers.size());
        // The above is blocking operation,
        // Flux emit values over time, but stream displays all at a time.
        // We are converting flux into stream
        // Hence we can remove the below lines,

        // These lines are not requires here
        System.out.println("Press a key to end");
//        System.in.read();
    }

}

package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int A = 4;
        int B = 6;
        out.println("Sum of 4 and 6: " + Sum.sum(A, B));

        float C = 4.5F;
        float D = 5.5F;
        out.println("Sum of 4.5 and 5.5: " + Sum.sum(C, D));
    }
}
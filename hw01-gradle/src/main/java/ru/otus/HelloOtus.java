package ru.otus;

import com.google.common.math.IntMath;
import java.math.RoundingMode;

public class HelloOtus {
    public static void main(String[] args) {
        int log = IntMath.log2(1024, RoundingMode.DOWN);
        System.out.println(log);
    }
}
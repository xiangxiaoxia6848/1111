package com.example.bigstack;

public class BigStackFormat {

    private static final String INFINITE = "\u221E"; // ∞

    public static String format(int count) {
        if (count == Integer.MAX_VALUE) {
            return INFINITE;
        }
        if (count >= 1_000_000_000) {
            return (count / 1_000_000_000) + "G";
        }
        if (count >= 1_000_000) {
            return (count / 1_000_000) + "M";
        }
        if (count >= 1_000) {
            return (count / 1_000) + "K";
        }
        return String.valueOf(count);
    }
}

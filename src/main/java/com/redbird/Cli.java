package com.redbird;

import java.io.IOException;

public class Cli {
    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            System.out.println("Bad amount of args");
            return;
        }
        String input = args[0];
        String output = args[1];
        String format = args[2];
        boolean result = ImageConverter.convertFormat(input, output, format);
        if (result) {
            System.out.println("OK");
        }
        else {
            System.out.println("Bad args");
        }

    }
}

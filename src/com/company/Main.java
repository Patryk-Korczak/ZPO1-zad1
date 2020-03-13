package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToConvert = 0b1101_1000;
        System.out.println("Podaj tryb konwersji: ");
        String mode = scanner.nextLine();
        String conversionOutput;

        switch(mode) {
            case "dziesiec":
                conversionOutput = Integer.toString(numberToConvert,10);
                break;
            case "osiem":
                conversionOutput = Integer.toString(numberToConvert, 8);
                break;
            case "szesnascie":
                conversionOutput = Integer.toString(numberToConvert,16);
                break;
            default:
                conversionOutput = "An error occured!";
        }

        System.out.println(conversionOutput);
    }
}

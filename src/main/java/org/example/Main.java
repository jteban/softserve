package org.example;

import org.example.logic.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        String textWithDuplicates = "AABBCCD112233";
        System.out.println(RemoveDuplicates.textWithoutDuplicates(textWithDuplicates));
    }
}
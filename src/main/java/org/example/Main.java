package org.example;

import org.example.logic.RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        String textWithDuplicates = "AABBCCD112233";
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.textWithoutDuplicates(textWithDuplicates));
    }
}
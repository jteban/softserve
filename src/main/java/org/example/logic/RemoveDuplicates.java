package org.example.logic;

import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static String textWithoutDuplicates(String textWithDuplicates) {
        if(textWithDuplicates == null){
            throw new IllegalArgumentException("Text cannot be null");
        }
        return textWithDuplicates.chars()
                .distinct()
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}

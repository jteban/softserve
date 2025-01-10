package org.example.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest{
    
    @Test
    void testEmptyString(){
        assertEquals("", RemoveDuplicates.textWithoutDuplicates(""));
    }
    
    @Test
    void testUniqueCharacters(){
        assertEquals("ABC", RemoveDuplicates.textWithoutDuplicates("ABC"));
    }
    
    @Test
    void testDuplicateCharacters(){
        assertEquals("ABC123", RemoveDuplicates.textWithoutDuplicates("AABBCC112233"));
    }
    
    @Test
    void testOneCharacter(){
        assertEquals("A", RemoveDuplicates.textWithoutDuplicates("AAAAA"));
    }
    
    @Test
    void testNullString(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
           RemoveDuplicates.textWithoutDuplicates(null); 
        });
        assertEquals("Text cannot be null", exception.getMessage());
    }
    
    @Test
    void testVeryLongStringForPerfomance(){
        String longText = "A".repeat(1_000_000); //1 million characters
        String expected = "A";
        
        long startTime = System.currentTimeMillis();
        String result = RemoveDuplicates.textWithoutDuplicates(longText);
        long endTime = System.currentTimeMillis();
        
        assertEquals(expected, result);
        
        long duration = endTime - startTime;
        assertTrue(duration < 1000, "The method took too long: " + duration + "ms");
    }
    

}
package org.example.logic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest{
    
    private static RemoveDuplicates removeDuplicates;
    
    @BeforeAll
    static void setUp(){
        removeDuplicates = new RemoveDuplicates();
    }
    
    @Test
    void testEmptyString(){
        assertEquals("", removeDuplicates.textWithoutDuplicates(""));
    }
    
    @Test
    void testUniqueCharacters(){
        assertEquals("ABC", removeDuplicates.textWithoutDuplicates("ABC"));
    }
    
    @Test
    void testDuplicateCharacters(){
        assertEquals("ABC123", removeDuplicates.textWithoutDuplicates("AABBCC112233"));
    }
    
    @Test
    void testOneCharacter(){
        assertEquals("A", removeDuplicates.textWithoutDuplicates("AAAAA"));
    }
    
    @Test
    void testNullString(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            removeDuplicates.textWithoutDuplicates(null); 
        });
        assertEquals("Text cannot be null", exception.getMessage());
    }
    
    @Test
    void testVeryLongStringForPerfomance(){
        String longText = "A".repeat(1_000_000); //1 million characters
        String expected = "A";
        
        long startTime = System.currentTimeMillis();
        String result = removeDuplicates.textWithoutDuplicates(longText);
        long endTime = System.currentTimeMillis();
        
        assertEquals(expected, result);
        
        long duration = endTime - startTime;
        assertTrue(duration < 1000, "The method took too long: " + duration + "ms");
    }
    

}
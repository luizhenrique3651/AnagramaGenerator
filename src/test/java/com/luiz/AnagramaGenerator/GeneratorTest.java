package com.luiz.AnagramaGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GeneratorTest {

	  @Test
	    void testValidInput() {
	        // Teste com uma string de entrada normal
	        String input = "abc";
	        List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
	        List<String> result = Generator.generateAnagrams(input);
	        assertTrue(result.containsAll(expected) && expected.containsAll(result), "Os anagramas não correspondem ao esperado.");
	    }

	    @Test
	    void testSingleCharacter() {
	        // Teste com uma string contendo apenas um caractere
	        String input = "a";
	        assertThrows(IllegalArgumentException.class, () -> Generator.generateAnagrams(input),
	                "Esperado IllegalArgumentException para string com um caractere.");
	    }

	    @Test
	    void testEmptyInput() {
	        // Teste com uma string vazia
	        String input = "";
	        assertThrows(IllegalArgumentException.class, () -> Generator.generateAnagrams(input),
	                "Esperado IllegalArgumentException para string vazia.");
	    }

	    @Test
	    void testInvalidCharacters() {
	        // Teste com caracteres não alfabéticos
	        String input = "a1b";
	        assertThrows(IllegalArgumentException.class, () -> Generator.generateAnagrams(input),
	                "Esperado IllegalArgumentException para caracteres não alfabéticos.");
	    }

	    @Test
	    void testNullInput() {
	        // Teste com entrada nula
	        String input = null;
	        assertThrows(IllegalArgumentException.class, () -> Generator.generateAnagrams(input),
	                "Esperado IllegalArgumentException para entrada nula.");
	    }

	    @Test
	    void testLargeInput() {
	        // Teste com uma entrada maior
	        String input = "abcd";
	        List<String> result = Generator.generateAnagrams(input);
	        assertEquals(24, result.size(), "O número de anagramas gerados não está correto.");
	    }
	}


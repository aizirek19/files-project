package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class WordProcessor {
    private Set<String> distinctWords;

    WordProcessor() {
        distinctWords = new HashSet<>();
    }

    public void readFile(String file1) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words and add them to the set
                String[] words = line.split("\\s+");
                for (String word : words) {
                    distinctWords.add(word.toLowerCase()); // Convert to lowercase for case-insensitive comparison
                }
            }
        }
    }

    public Set<String> getDistinctWords() {

        return distinctWords;
    }
}
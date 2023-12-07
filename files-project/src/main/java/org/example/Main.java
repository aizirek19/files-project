package org.example;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WordProcessor wordProcessor1 = new WordProcessor();
        WordProcessor wordProcessor2 = new WordProcessor();
        JaccardSimilarityCalculator similarityCalculator = new JaccardSimilarityCalculator();

        try {
            wordProcessor1.readFile("resources/file1.txt");
            wordProcessor2.readFile("resources/file2.txt");

            Set<String> distinctWords1 = wordProcessor1.getDistinctWords();
            Set<String> distinctWords2 = wordProcessor2.getDistinctWords();

            double similarity = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

            System.out.println("Jaccard Similarity Coefficient: " + similarity);
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}


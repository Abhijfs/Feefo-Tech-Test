package com.feefo.assesment;

import com.feefo.assesment.enums.JobTitles;

public class JobTitlesStandardizer {
    public String standardize(String enteredJobTitle) {
        JobTitles[] availableJobTitles = JobTitles.values();
        int[] distanceValues = getFuzzyDistanceValues(enteredJobTitle, availableJobTitles);
        return availableJobTitles[minIndex(distanceValues)].toString();
    }

    private int[] getFuzzyDistanceValues(String enteredJobTitle, JobTitles[] availableJobTitles) {
        int[] distanceValues = new int[JobTitles.values().length];
        for (int i = 0; i < JobTitles.values().length; i++) {
            distanceValues[i] = validateAndGetFuzzyScore(availableJobTitles[i].toString(), enteredJobTitle);
        }
        return distanceValues;
    }

    private int validateAndGetFuzzyScore(final String term, final String query) {
        if (term == null || query == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        final String termLowerCase = term.toLowerCase();
        final String queryLowerCase = query.toLowerCase();

        return calculateFuzzyScore(termLowerCase, queryLowerCase);
    }

    private int calculateFuzzyScore(String termLowerCase, String queryLowerCase) {
        int score = 0;
        int prevMatchingCharIndex = Integer.MIN_VALUE;

        for (int queryIndex = 0; queryIndex < queryLowerCase.length(); queryIndex++) {
            final char queryChar = queryLowerCase.charAt(queryIndex);
            boolean termCharMatchFound = false;
            for (int termIndex = 0; termIndex < termLowerCase.length()
                    && !termCharMatchFound; termIndex++) {
                final char termChar = termLowerCase.charAt(termIndex);
                if (queryChar == termChar) {
                    score++;
                    if (prevMatchingCharIndex + 1 == termIndex) {
                        score += 2;
                    }
                    prevMatchingCharIndex = termIndex;
                    termCharMatchFound = true;
                }
            }
        }
        return score;
    }

    public static int minIndex(int[] numbers) {
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}

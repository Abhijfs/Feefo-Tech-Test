package com.feefo.assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Please enter a Job Title standardize.");
        String enteredJobTitle = reader.readLine();
        String standardizedJobTitle = new JobTitlesStandardizer().standardize(enteredJobTitle);
        System.out.println("'" + enteredJobTitle + "' has standardized to '" + standardizedJobTitle + "'.");
    }
}

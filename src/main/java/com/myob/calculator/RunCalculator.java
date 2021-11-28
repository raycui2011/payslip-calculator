package com.myob.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.myob.calculator.CommandProcessor;

/** The main class for executing the application */
public class RunCalculator {

	public static void main(String[] args) {
    CommandProcessor processor = new CommandProcessor();

    while (!processor.isCommandsFinished()) {
        System.out.println("Enter a command, Valid commands are:");
        System.out.println("GenerateMonthlyPayslip  Mary Song 60000, or EXIT");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String commandStr;

        try {
                commandStr = reader.readLine();
                if (commandStr != null) {
                        processor.executeCommand(commandStr);
                }
        } catch (IOException e) {
                System.out.println("IO Error:");
                e.printStackTrace();
        }
    }
	}

}

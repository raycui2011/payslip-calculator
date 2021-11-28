package com.myob.calculator;

import java.util.Optional;

public class CommandProcessor {
	private static final String COMMAND_RUN = "GENERATEMONTHLYPAYSLIP";
	private static final String COMMAND_EXIT = "EXIT";

	boolean commandsFinished = false;


	public void executeCommand(String commandStr)  {
    String[] commandSection = commandStr.split(" ", 2);

    String command = commandSection[0].toUpperCase();
    String errorMessage = "Cannot process any commands until the employee has been given name and .";
    try {
        System.out.println(command);
        switch (command) {
             case COMMAND_RUN:
                init(commandSection[1]);
                break;
             case COMMAND_EXIT:
                this.commandsFinished = true;
                break;
             default:
                System.out.println("Invalid command.");
                break;
        }
    } catch (NullPointerException e) {
        throw new PaySlipCalculatorException(errorMessage);
    }
	}

	/** Check the command execution is finished or not */
	public boolean isCommandsFinished() {
    return this.commandsFinished;
	}

	/** Runs the more complex PLACE command on the robot */
	private void init(String commandStr) {

		commandStr.replace("\"", "");
		String[] commandParams = commandStr.split(" ");

		int size = commandParams.length;
		Long annualSalary = Long.parseLong(commandParams[size-1]);
		String s = "";
		for (int i = 1; i < size-1; i++) {
			s = s + " " + commandParams[i];
		}
	  Employee employee = new Employee(s, annualSalary);
		PaySlipCalculator paySlipCalculator = new PaySlipCalculator();
		paySlipCalculator.execute(employee);
	}

}

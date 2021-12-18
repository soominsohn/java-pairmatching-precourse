package pairmatching.controller;

import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class ProgramController {
	OutputView outputView = new OutputView();
	InputView inputView = new InputView();
	PairMatchingController pairMatchingController = new PairMatchingController();

	public void start() {
		String userInput;
		while (true) {
			outputView.printFunction();
			userInput = inputView.getFunction();
			if (userInput.equals("Q")) {
				return;
			}
			selectFunction(userInput);
		}
	}

	public void selectFunction(String functionNumber) {
		if (functionNumber.equals("1")) {
			pairMatchingController.start();
			return;
		}
		if (functionNumber.equals("2")) {
			return;
		}
		if (functionNumber.equals("3")) {
			return;
		}
	}

}
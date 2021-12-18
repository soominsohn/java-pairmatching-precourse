package pairmatching.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import pairmatching.constant.OutputConstant;

public class OutputView {

	public void printFunction() {
		System.out.println();
		System.out.println(OutputConstant.SELECT_FUNCTION_MESSAGE);
		System.out.println(OutputConstant.MATH_PAIR_MESSAGE);
		System.out.println(OutputConstant.SHOW_PAIR_MESSAGE);
		System.out.println(OutputConstant.REFRESH_PAIR_MESSAGE);
		System.out.println(OutputConstant.END_MESSAGE);
	}

	public void showCourseInfo() {
		System.out.println();
		Path path = Paths.get(OutputConstant.COURSE_INFO_PATH);
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void printPair(ArrayList<ArrayList<String>> matchResult) {
		System.out.println();
		System.out.println("페어 매칭 결과입니다.");
		for (ArrayList<String> item : matchResult) {
			System.out.println(String.join(" : ", item));
		}
	}

	public void wantUserContinue() {
		System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?");
		System.out.println("네 | 아니오");

	}
}

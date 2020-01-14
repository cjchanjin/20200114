package co.cjpark.lms.app;

import co.cjpark.lms.student.StudentApp;

public class MainApp {

	public static void main(String[] args) {
		StudentApp run = new StudentApp();
//		run.insert();
		
		run.login();
	}
}

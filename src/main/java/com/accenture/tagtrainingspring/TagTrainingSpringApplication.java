package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();
		printlist();
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");

	}

	//Task 1
//	private static void printlogic(){
//		Patient patient = new Patient("John", 1234, LocalDate.of(1960, 01, 01), Gender.MALE);
//		Screening screening = new Screening(1000,patient,LocalDate.of(2021,01,01),false);
//		System.out.println("Patient: " + patient.getName() + " has a malignant diagnosis of " + screening.isMalignant());
//		ScreeningService screeningService = new ScreeningService();
//		System.out.println(screeningService.isPatientScreening(screening,patient));
//	}

	//Task 2
	private static void printlist(){
		Patient patient = new Patient("John", 1234, LocalDate.of(1960, 01, 01), Gender.MALE);
		Patient patient2 = new Patient("Mary", 1234, LocalDate.of(1960, 01, 01), Gender.FEMALE);
		Patient patient3 = new Patient("Luke", 1234, LocalDate.of(1960, 01, 01), Gender.MALE);
		Screening screening = new Screening(1000,patient,LocalDate.of(2021,01,01),false);
		Screening screening2 = new Screening(1000,patient2,LocalDate.of(2021,01,01),true);
		Screening screening3 = new Screening(1000,patient3,LocalDate.of(2021,01,01),false);
		List<Screening> screeningList = new ArrayList<>();
		screeningList.add(screening);
		screeningList.add(screening2);
		screeningList.add(screening3);
		for(Screening screeningx: screeningList){
			System.out.println("Patient: " + screeningx.getPatient().getName() + " has a malignant diagnosis of " + screeningx.isMalignant());}

		screeningList.stream().forEach(x -> System.out.println("Patient: " + x.getPatient().getName() + " has a malignant diagnosis of " + x.isMalignant()));
	}

	//Task 3
	private static void printService(){
		ScreeningDatabase screeningDatabase = new ScreeningDatabase();
		ScreeningService screeningService = new ScreeningService(screeningDatabase);
		List<Screening> screeningList = screeningService.getScreenings();
		for(Screening screeningx: screeningList){
			System.out.println("Patient: " + screeningx.getPatient().getName() + " has a malignant diagnosis of " + screeningx.isMalignant());}
	}

	//Extra task
	private static void printFindScreening(){
		ScreeningDatabase screeningDatabase = new ScreeningDatabase();
		ScreeningService screeningService = new ScreeningService(screeningDatabase);
		Screening screening = screeningService.findScreening("Alan");
		if(screening!=null){
			System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
		} else{
			System.out.println("No Screening found");
		}
	}

}

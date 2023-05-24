package utils;

import java.time.LocalDate;
import java.util.Map;

import com.org.Patient;
import com.org.roomType;

import custom_exception.PatientExceptionHandling;

public class PatientValidationRules {

	public static Patient vallidateAllInput(int serialNo, String patientName, int age, String gender, String address,
			String phoneNumber, String disease, String admitDate, double annualIncome, String room,
			Map<Integer, Patient> patients) throws PatientExceptionHandling {
		checkForDup(patients, serialNo);
		LocalDate validDate = parseDate(admitDate);
		roomType validRoom = parseroomType(room);
		return new Patient(serialNo,patientName,age,gender,address,phoneNumber,disease,validDate,annualIncome,validRoom);
	}

	public static LocalDate parseDate(String date) throws PatientExceptionHandling {
		LocalDate d1 = LocalDate.parse(date);
		if (d1.equals(LocalDate.now()))
		{
			return d1;
		}
		else {
		throw new PatientExceptionHandling("...");
		}
	}

	public static roomType parseroomType(String room) {
		return roomType.valueOf(room.toUpperCase());
	}

	public static void checkForDup(Map<Integer, Patient> patients, int serialNo) throws PatientExceptionHandling {
		if (patients.containsKey(serialNo))
			throw new PatientExceptionHandling("dup..");
		System.out.println("no dup");
	}
}

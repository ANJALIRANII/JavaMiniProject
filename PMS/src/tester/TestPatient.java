package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.PatientValidationRules.*;
import com.org.Patient;
import com.org.roomType;

public class TestPatient {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Patient> map = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. add patient 2.display patient details 0.exit");
				System.out.println("choose any one");
				try {
					switch (sc.nextInt()) {
					case 1:
//						private int SerialNo;
//						private String PatientName;
//						private int age;
//						private String gender;
//						private String address;
//						private String phoneNumber;
//						private String disease;
//						private LocalDate admitDate;
//						private double annualIncome;
//						private roomType room;
						System.out.println(
								"Enter patients details :serialNo patientName age gender address phoneNumber disease admitDate annualIncome room ");
						Patient validateinput = vallidateAllInput(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(),
								sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), map);
						map.put(validateinput.getSerialNo(), validateinput);
						System.out.println("patient added");

						break;
					case 2:
						System.out.println("display patient details");
						map.forEach((k, v) -> System.out.println(v));
						break;
					case 0:
						exit = true;
						System.out.println("take care");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}

		}

	}

}

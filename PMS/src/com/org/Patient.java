package com.org;

import java.time.LocalDate;

public class Patient {
//Patient details : SerialNo(int),PatientName(String),age(int),gender(String),address(String),phoneNumber(String),disease(String),admitDate(LocalDate)
	//annualIncome(double)
	//roomType GENERAL(2000),SPECIAL(5000),SEMI-SPECIAL(3000),ICU(7000)

	
	private int SerialNo;
	private String PatientName;
	private int age;
	private String gender;
	private String address;
	private String phoneNumber;
	private String disease;
	private LocalDate admitDate;
	private double annualIncome;
	private roomType room;
	public Patient(int serialNo, String patientName, int age, String gender, String address, String phoneNumber,
			String disease, LocalDate admitDate, double annualIncome, roomType room) {
		super();
		SerialNo = serialNo;
		PatientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.disease = disease;
		this.admitDate = admitDate;
		this.annualIncome = annualIncome;
		this.room = room;
	}
	@Override
	public String toString() {
		return "Patient [SerialNo=" + SerialNo + ", PatientName=" + PatientName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", disease=" + disease + ", admitDate="
				+ admitDate + ", annualIncome=" + annualIncome + ", room=" + room + "]";
	}
	public int getSerialNo() {
		return SerialNo;
	}
	
	
	
	
}

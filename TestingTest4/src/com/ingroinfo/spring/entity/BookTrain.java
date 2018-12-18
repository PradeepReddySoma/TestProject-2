package com.ingroinfo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookTrains")
public class BookTrain {
	
	@Id
	@Column(name="bookId")
	private int bookId;

	@Column(name="trainName")
	private String trainName;
	
	@Column(name="pName")
	private String passengerName;
	
	@Column(name="pContactNumber")
	private String passengerContactNumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String age;
	
	public BookTrain() {
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerContactNumber() {
		return passengerContactNumber;
	}

	public void setPassengerContactNumber(String passengerContactNumber) {
		this.passengerContactNumber = passengerContactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BookTrain [bookId=" + bookId + ", trainName=" + trainName + ", passengerName=" + passengerName
				+ ", passengerContactNumber=" + passengerContactNumber + ", gender=" + gender + ", age=" + age + "]";
	} 
	
	
	
}

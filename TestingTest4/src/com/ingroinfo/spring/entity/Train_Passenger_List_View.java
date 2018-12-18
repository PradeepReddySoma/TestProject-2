package com.ingroinfo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_passenger_list_view")
public class Train_Passenger_List_View {
	
	@Id
	@Column(name="trainName")
	private String trainName;
	
	@Column(name="trainFare")
	private String trainFare;
	
	@Column(name="seatsCount")
	private String seat;
	
	@Column(name="fromPlace")
	private String fromPlace;
	
	@Column(name="toPlace")
	private String toPlace;
	
	@Column(name="duration")
	private String travellDuration;
	
	@Column(name="bookId")
	private int bookId;

	@Column(name="pName")
	private String passengerName;
	
	@Column(name="pContactNumber")
	private String passengerContactNumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String age;

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainFare() {
		return trainFare;
	}

	public void setTrainFare(String trainFare) {
		this.trainFare = trainFare;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getTravellDuration() {
		return travellDuration;
	}

	public void setTravellDuration(String travellDuration) {
		this.travellDuration = travellDuration;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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
		return "Train_Passenger_List_View [trainName=" + trainName + ", trainFare=" + trainFare + ", seat=" + seat
				+ ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", travellDuration=" + travellDuration
				+ ", bookId=" + bookId + ", passengerName=" + passengerName + ", passengerContactNumber="
				+ passengerContactNumber + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}

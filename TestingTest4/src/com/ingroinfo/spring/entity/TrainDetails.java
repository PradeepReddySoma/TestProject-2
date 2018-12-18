package com.ingroinfo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_details")
public class TrainDetails {
	
	@Id
/*	@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	@Column(name="trainsId")
	private int trainsId;
	
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
	
	public TrainDetails() {
		
	}
	

	public int getTrainsId() {
		return trainsId;
	}

	public void setTrainsId(int trainsId) {
		this.trainsId = trainsId;
	}







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


	@Override
	public String toString() {
		return "TrainDetails [trainsId=" + trainsId + ", trainName=" + trainName + ", trainFare=" + trainFare
				+ ", seat=" + seat + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", travellDuration="
				+ travellDuration + "]";
	}



	


}

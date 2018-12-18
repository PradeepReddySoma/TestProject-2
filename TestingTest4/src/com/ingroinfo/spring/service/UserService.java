package com.ingroinfo.spring.service;

import java.util.List;

import com.ingroinfo.spring.entity.BookTrain;
import com.ingroinfo.spring.entity.TrainDetails;
import com.ingroinfo.spring.entity.Train_Passenger_List_View;
import com.ingroinfo.spring.entity.User;

public interface UserService {

	/*public List<User> getUsers();*/
	
/*	public void saveTrainDetails(TrainDetails thetraindetails);
*/

	public User userCheck(User theUser);

	public void saveTrainDetails(TrainDetails thetraindetails);

	

	public List<TrainDetails> getTrainList();

	public TrainDetails getTrain(int trainsId);

	public void saveBookTrain(BookTrain bookTrain);

	public String cancelTrain(int bookId);

	public List<Train_Passenger_List_View> getTrainPassengerList();

}

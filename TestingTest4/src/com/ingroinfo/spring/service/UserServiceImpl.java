package com.ingroinfo.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingroinfo.spring.dao.UserDAO;
import com.ingroinfo.spring.entity.BookTrain;
import com.ingroinfo.spring.entity.TrainDetails;
import com.ingroinfo.spring.entity.Train_Passenger_List_View;
import com.ingroinfo.spring.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	/*@Override
	@Transactional
	public List<User> getUsers() {
	
		return userDAO.getUsers();
	}*/

	@Override 
	@Transactional
	public User userCheck(User theUser) {
		return userDAO.checkUser(theUser) ;
	}

	@Override
	@Transactional
	public void saveTrainDetails(TrainDetails thetraindetails) {
		userDAO.saveTrainDetails(thetraindetails);
		
	}
    
	

	@Override
	@Transactional
	public List<TrainDetails> getTrainList() {
		return userDAO.getTrainList();
	}

	@Override
	@Transactional
	public TrainDetails getTrain(int trainsId) {

		return userDAO.getTrain(trainsId);
	
	}

	@Override
	@Transactional
	public void saveBookTrain(BookTrain bookTrain) {
		userDAO.saveBookTrain(bookTrain);
	}

	@Override
	@Transactional
	public String cancelTrain(int bookId) {
		return userDAO.cancelTrain(bookId);
	}

	@Override
	@Transactional
	public List<Train_Passenger_List_View> getTrainPassengerList() {
		
		return userDAO.getTrainPassengerList();
	}

	
	/*@Override
	@Transactional
	public void saveTrainDetails(TrainDetails thetraindetails) {
		userDAO.saveTrainDetails(thetraindetails);
		
	}*/

}

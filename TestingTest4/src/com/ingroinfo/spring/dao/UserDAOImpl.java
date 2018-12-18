package com.ingroinfo.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.ingroinfo.spring.entity.BookTrain;
import com.ingroinfo.spring.entity.TrainDetails;
import com.ingroinfo.spring.entity.Train_Passenger_List_View;
import com.ingroinfo.spring.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*@Override
	public List<User> getUsers() {
		Session session1 = sessionFactory.getCurrentSession();
		Query<User> userQuery = session1.createQuery("from User", User.class);
		List<User> userList = userQuery.list();
		return userList;
	}*/

	@Override
	public User checkUser(User theUser) {
		Session session2 = sessionFactory.getCurrentSession();
		Query<User> userQuery = session2.createQuery("from User where userName=:uName and password=:pswrd");
		userQuery.setParameter("uName", theUser.getUserName());
		userQuery.setParameter("pswrd", theUser.getPassword());
		User oneUser = (User) userQuery.uniqueResult();
		return oneUser;
	}

	@Override
	public void saveTrainDetails(TrainDetails thetraindetails) {
		System.out.println("train details in DAO" + thetraindetails);
		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println("in save dao 42");
		currentSession.saveOrUpdate(thetraindetails);

	}

	@Override
	public List<TrainDetails> getTrainList() {
		Session session1 = sessionFactory.getCurrentSession();
		Query<TrainDetails> userQuery = session1.createQuery("from TrainDetails", TrainDetails.class);
		List<TrainDetails> userList = userQuery.list();
		System.out.println("user list " + userList);
		return userList;
	}

	@Override
	public TrainDetails getTrain(int trainsId) {

		Session currentSession = sessionFactory.getCurrentSession();

		TrainDetails trainDetails = currentSession.get(TrainDetails.class, trainsId);
		System.out.println("this is train record based on this id :-" + trainsId + " :-tain detail :-" + trainDetails);

		return trainDetails;

	}

	@Override
	public void saveBookTrain(BookTrain bookTrain) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(bookTrain);		
	}
	
	Model model;
	@Override
	public String cancelTrain(int bookId) {
		
		Session session=sessionFactory.getCurrentSession();
		BookTrain bookTrain=session.get(BookTrain.class,bookId);
		session.delete(bookTrain);
	//	model.addAttribute("message", "train is successfuully cancelled");
		return "yes";
	}

	@Override
	public List<Train_Passenger_List_View> getTrainPassengerList() {
		Session session=sessionFactory.getCurrentSession();
		Query<Train_Passenger_List_View> trainPassengerList=session.createQuery("from Train_Passenger_List_View",Train_Passenger_List_View.class); 
		List<Train_Passenger_List_View> listQuery=trainPassengerList.list();
		System.out.println("list of records "+listQuery);
		return listQuery;
	}

	/*
	 * @Override public void saveTrainDetails(TrainDetails thetraindetails) {
	 * Session currentSession=sessionFactory.getCurrentSession();
	 * currentSession.saveOrUpdate(thetraindetails);
	 * 
	 * }
	 */

}

package com.ingroinfo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ingroinfo.spring.entity.BookTrain;
import com.ingroinfo.spring.entity.TrainDetails;
import com.ingroinfo.spring.entity.Train_Passenger_List_View;
import com.ingroinfo.spring.entity.User;
import com.ingroinfo.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/myform")    //for login display
	public String home(Model theModel) {
		
		User user=new User();
		
		theModel.addAttribute("user",user);
		
		return "pradeep";
	}
	
	@RequestMapping("/processForm")   //checking for login details in database 
	public String processForm(@ModelAttribute("user") User theUser,Model model) {  
		
		User logUser=userService.userCheck(theUser);
		 
	//	System.out.println(theUser.getUserName());
		if(logUser!=null) {
		//if((theUser.getUserName()).equals(logUser.getUserName()) && (theUser.getPassword()).equals(logUser.getPassword())) {
		
		       return "TrainDetail";
	//	}
	      
    	}
		
		
		model.addAttribute("message","Login Details are incorrect");
		return "errorpradeep2";
		
	}
	
	@RequestMapping("/addTrain")
	public String addDetail(Model theModel) {
		

		TrainDetails trainDetails=new TrainDetails();
		
		theModel.addAttribute("traindetails",trainDetails);
		
		
		return "AddTrain";
		
		
		
		
	}
	
	@RequestMapping("/processTrainDetail")
	public String processTrainDetails(@ModelAttribute("traindetails") TrainDetails thetraindetails, Model model) {
		System.out.println("train details" +thetraindetails);
		System.out.println("in processTrainDetails");
		 userService.saveTrainDetails(thetraindetails);
		
		model.addAttribute("message","data saved sucessfully");
		return "savedTrain";
	}
	
	//it shows the form with update option(but without details to update,but other values are shown)
	@RequestMapping("/updateTrain")
	public String updateTrain(Model model) {
		List<TrainDetails> tdetails=userService.getTrainList();
		model.addAttribute("tDetails",tdetails);
		return "updateTrainList";
	    	
	}
	//it shows the update form when we click on update
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int trainsId,Model theModel) {
		
		System.out.println("trainID "+trainsId);
		
		//get the traindetail from service
		TrainDetails traindetails=userService.getTrain(trainsId);
	//	System.out.println(traindetails);
		theModel.addAttribute("traindetails",traindetails);
		 return "AddTrain";
	
	}
	@RequestMapping("/ViewTrain")
	public String viewTrain(Model model){
		List<TrainDetails> tdetails=userService.getTrainList();
		model.addAttribute("tDetails",tdetails);
		return "getTrainList";
	}
	@RequestMapping("/BookTrain")
	public String bookTrain(Model model) {
		BookTrain bookTrain=new BookTrain();
		model.addAttribute("bookTrain",bookTrain);
		return "BookTrain";
	}
	
	@RequestMapping("/processBookTrain")
	public String processBookTrain(@ModelAttribute("bookTrain") BookTrain bookTrain ,Model model) {
		
		userService.saveBookTrain(bookTrain);
		
		model.addAttribute("message","Booktrain details are successfully saved");
		return "savedBookTrain";
		
	}
	@RequestMapping("/CancelTrain")
	public String cancelTrain(Model model) {
		BookTrain bookTrain=new BookTrain();
		model.addAttribute("bookTrain",bookTrain);
		return "CancelTrain";
		
	}
	@RequestMapping("/processCanceltrain")
	public String processCancelTrain(@ModelAttribute("bookTrain") BookTrain bookTrain,Model model) {
		int bookId=bookTrain.getBookId();
		String qry=userService.cancelTrain(bookId);
		if(qry.equals("yes")) {
			model.addAttribute("message","cancelling train is successfully done");
		}
		else {
		}
		return "messageCancelTrain";
		
	}
	@RequestMapping("/TrainAndPassenger")
	public String TrainAndPassenger(Model model) {
		List<Train_Passenger_List_View> listTrainPassenger=userService.getTrainPassengerList();
		model.addAttribute("trainPassengerList",listTrainPassenger);
		return "getTrainPassengerList";
		
	}
	/*	@RequestMapping("/trainDetails")
	public String trainDetails(Model theModel) {
		
		TrainDetails trainDetails=new TrainDetails();
		
		theModel.addAttribute("traindetails", trainDetails);
		
		return "AddTrain";
	}*/
}
 

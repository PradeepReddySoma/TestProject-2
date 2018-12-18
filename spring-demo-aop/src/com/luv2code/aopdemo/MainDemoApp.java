package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		/*System.out.println("step 3");*/
     
		//read spring config java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		/*System.out.println("step 4");*/
		//	get the bean from spring conainer
		AccountDAO accocuntDAO=context.getBean("accountDAO",AccountDAO.class);
		
		//call the business method
		Account account=new Account();
		accocuntDAO.addAccount(account);
		accocuntDAO.doWork();
		
		MembershipDAO membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);
		
		/*System.out.println("step 6");*/
		membershipDAO.addSillyMember();
		membershipDAO.goSleep();
		
		//close the context
		context.close();
	}

}

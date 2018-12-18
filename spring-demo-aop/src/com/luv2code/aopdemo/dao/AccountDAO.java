package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

 public void addAccount(Account account) {
	/* System.out.println("step 1");*/
	 System.out.println(getClass()+" doing my DB work,Adding an Account");
	 /*System.out.println("step 2");*/
 }
 
 public void doWork() {
	 
	 System.out.println(getClass()+" doing work");
 }
}

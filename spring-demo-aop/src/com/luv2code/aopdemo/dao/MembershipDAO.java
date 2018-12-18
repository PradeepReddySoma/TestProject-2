package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	
	public boolean addSillyMember() {
		System.out.println(getClass()+" doing stuff; Adding a membership account");
		return false;
	}
	public void goSleep() {
		
		System.out.println(getClass()+" Iam gong to sleep");
	}
}

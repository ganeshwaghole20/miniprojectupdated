package com.main;

import com.email.*;
import com.sms.*;
import com.buisnesslogic.LogicImplementation;
import com.connection.*;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		DatabaseConnection.connectionmethod();
		LogicImplementation.actualLogic();
		
		
		
	}

}

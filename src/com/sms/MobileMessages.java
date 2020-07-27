package com.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.connection.*;


public class MobileMessages
{
		public static void mobilemessagesend(String mobileMessageReceiver)
	{
		 Twilio.init(Constants.ascd,Constants.autk);

	     Message message = Message
	             .creator(new PhoneNumber(mobileMessageReceiver), // to
	                     new PhoneNumber(Constants.mobilefrom), // from
	                     Constants.mobilemessage)
	             .create();

	     System.out.println(message.getSid()+" Text message using phone sent suceessfully");
	}
}


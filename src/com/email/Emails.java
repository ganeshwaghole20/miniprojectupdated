package com.email;

import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;

import com.connection.Constants;  

public class Emails{  
    public static void emailsend(String EmailReceiver){  
          //Get properties object    
          Properties props = new Properties();    
          props.put(Constants.host,Constants.smtpurl);    
          props.put(Constants.porturl, Constants.portnumber);    
          props.put(Constants.smtpclass,Constants.sslclass);    
          props.put(Constants.smtpauth,Constants.smtpboolean);    
          props.put(Constants.smtpport, Constants.portnumber);    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(Constants.senderemail,Constants.senderemailpassword);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(EmailReceiver));    //
           message.setSubject(Constants.subject);    
           message.setText(Constants.message);    
           //send message  
           Transport.send(message);    
           System.out.println("email sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  
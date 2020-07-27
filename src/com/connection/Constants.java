package com.connection;

public class Constants {
	
	public static final String url="com.mysql.jdbc.Driver";
	public static final String urs="jdbc:mysql://localhost:3306/mstuddb";
	public static final String usename="root";
	public static final String password="root";
	public static final String qry="select s.sname,s.email,s.mobileno,sum(r.marks) as mark,sum(r.outof) as total,sum(r.marks)*100/sum(r.outof) as per from stud s,result r where s.sid=r.sid and r.testdate > DATE_SUB(NOW(), INTERVAL 1 MONTH) group by s.sname having per<50";
	public static final String senderemail="wagholeganesh20@gmail.com";
	public static final String senderemailpassword="866867815379";
	public static final String subject="Regarding TEST Marks";
	public static final String message="you get less than 50% marks,study hard";
	public static final String mobilefrom="+12706320032";
	public static final String mobilemessage="Test RESULT you have got less than 50% marks STUDY HARD AND GET GOOD MARKS";
	public static final String ascd="AC0dddcf4b3cf747cb5772813061687c45";
	public static final String autk ="4b25926a82ebc43b7d7d23c32aa3f0e0";
	public static final String host="mail.smtp.host";
	public static final String smtpurl="smtp.gmail.com";
	public static final String porturl="mail.smtp.socketFactory.port";
	public static final String portnumber="465";
	public static final String smtpport="mail.smtp.port";
	public static final String smtpclass="mail.smtp.socketFactory.class";
	public static final String sslclass="javax.net.ssl.SSLSocketFactory";
	public static final String smtpauth="mail.smtp.auth";
	public static final String smtpboolean="true";
	
	
	

}

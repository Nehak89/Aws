public class second{
         public static void sendMail(String address,String subject,String body){
		 Messaging.SingleEmailMessage mail=new Messaging.SingleEmailMessage();
		 String [] toAddresses=new String[]{address};
		 mail.setToAddresses(toAddresses);
		 mail.setSubject(subject);
		 mail.setPlainTextBody(body);
		 //Messaging.SingleEmailMessage(new Messaging.SingleEmailMessage[]{mail});
		 Messaging.sendEmail(new Messaging.SingleEmailMessage[]{mail});
	}
}
	
	
	
	//Apex code(write this code in execution cell)
	String address='recipients address';//give your emailId
	String subject="LP-2 assignment confirmation";
	String body="Cloud Computing Assignment 3 implemented successfully';
	second.sendMail(address,subject,body);
	

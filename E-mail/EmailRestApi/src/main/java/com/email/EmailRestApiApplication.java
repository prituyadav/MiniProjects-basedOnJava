package com.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class EmailRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailRestApiApplication.class, args);
		
		
		System.out.println("code is running..............");
//		
//		String msg="hi there!";
//		String to="emailrestapiproject@gmail.com";
//		String from="candlepritu21century@gmail.com";
//		String sub="api";
//		
//		sendMail(to,from,sub,msg);
		
		
	}
	
//	
//	public static void sendMail(String to,String from,String subject,String msg) {
//		 String host="smtp.gmail.com";
//		 
//		 Properties prop=System.getProperties();
//		 System.out.println("ppp"+prop);
//		 
//		 prop.put("mail.smtp.host", host);
//		 prop.put("mail.smtp.port", "465");
//		 prop.put("mail.smtp.ssl.enable", "true");
//		 prop.put("mail.smtp.auth", "true");
//		 
//		 
//		 Session session=Session.getInstance(prop,new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				// TODO Auto-generated method stub
//				return new  PasswordAuthentication("emailrestapiproject@gmail.com", "email0003");
//			}
//			 
//		});
//		 
//		 
//		 session.setDebug(true);
//		 
//		 MimeMessage m= new MimeMessage(session);
//		 
//		 
//		 try {
//			m.setFrom(from);
//			
//			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			
//		   m.setSubject(subject);
//		   
//		   m.setText(msg);
//			
//			Transport.send(m);
//			
//			System.out.println("sent....");
//			
//			
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//	}

}

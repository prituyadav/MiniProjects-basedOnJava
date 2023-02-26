package com.email.services;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.email.models.Emailclass;

@Service
public class EmailService {
	public static String sendMail(Emailclass mail) {
		 String host="smtp.gmail.com";
		 
		 Properties prop=System.getProperties();
		 System.out.println("ppp"+prop);
		 
		 prop.put("mail.smtp.host", host);
		 prop.put("mail.smtp.port", "465");
		 prop.put("mail.smtp.ssl.enable", "true");
		 prop.put("mail.smtp.auth", "true");
		 
		 
		 Session session=Session.getInstance(prop,new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new  PasswordAuthentication("emailrestapiproject@gmail.com", "email0003");
			}
			 
		});
		 
		 
		 session.setDebug(true);
		 
		 MimeMessage m= new MimeMessage(session);
		 
		 
		 try {
			m.setFrom(mail.getFrom());
			
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(mail.getTo()));
			
		   m.setSubject(mail.getSubject());
		   
		   m.setText(mail.getMessage());
			
			Transport.send(m);
			
			//System.out.println("sent....");
			return "sent_success....";
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return "sent failed";
	}

}

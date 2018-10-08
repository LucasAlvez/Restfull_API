package com.courses.api.service.email;

import org.springframework.mail.SimpleMailMessage;

import com.courses.api.entity.UserEntity;

public interface EmailService {
	
	public void confirmationOfRegistration (UserEntity account);
	
	public void sendEmail(SimpleMailMessage msg);
}
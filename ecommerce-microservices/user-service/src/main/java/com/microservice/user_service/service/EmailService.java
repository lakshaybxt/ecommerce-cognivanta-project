package com.microservice.user_service.service;

import jakarta.mail.MessagingException;

public interface EmailService {
    void sendVerificationEmail(String to, String subject, String text) throws MessagingException;
}

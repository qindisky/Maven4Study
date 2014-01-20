package com.juvenxu.mvnbook.account.email;

public interface AcountEmailService
{
	void sendMail( String to, String subject, String htmlText ) throws AcountEmailException;
}
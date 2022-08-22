package com.samples.S01_springcoredi.propertyfile;

public class MyDAO {
	
	private String DbServer;
	private String DbPort;
	private String DbUser;
	private String DbPassword;
	public MyDAO(String dbServer, String dbPort, String dbUser, String dbPassword) {
		super();
		DbServer = dbServer;
		DbPort = dbPort;
		DbUser = dbUser;
		DbPassword = dbPassword;
	}
	@Override
	public String toString() {
		return "MyDAO [DbServer=" + DbServer + ", DbPort=" + DbPort + ", DbUser=" + DbUser + ", DbPassword="
				+ DbPassword + "]";
	}
	
	
	

}

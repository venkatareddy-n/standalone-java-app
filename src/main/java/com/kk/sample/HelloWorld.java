package com.kk.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Maven Build Tool !! Today Date is:  " + getLocalCurrentDate());
		System.out.println("Hello Venkat welcome to java standalone app");

	}

	private static Date getLocalCurrentDate() {
		String m = "KK DEVOPS";
		return new Date();

	}

}

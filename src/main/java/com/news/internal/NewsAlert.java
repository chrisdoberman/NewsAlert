package com.news.internal;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewsAlert {

	/**
	 * Entry point to the app.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"META-INF/spring/app-context.xml");
		        new Scanner(System.in).nextLine();
		    }

	}


package com.news.internal;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;

public class SpringChannelTest {

	@Test
	public void testChannels() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"META-INF/spring/app-context.xml");
		PollableChannel feedChannel = applicationContext.getBean("feedChannel",
				PollableChannel.class);
		MessageChannel twitterChannel = applicationContext.getBean(
				"twitterChannel", MessageChannel.class);

		assertNotNull(feedChannel);
		assertNotNull(twitterChannel);
	}

}

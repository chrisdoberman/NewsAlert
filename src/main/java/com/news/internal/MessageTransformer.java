package com.news.internal;

import org.springframework.integration.Message;
import org.springframework.integration.message.GenericMessage;

import com.sun.syndication.feed.synd.SyndEntry;

public class MessageTransformer {
	
	public Message<String> transform(Message<SyndEntry> message) {
		String title = message.getPayload().getTitle();
		String url = message.getPayload().getUri();
		Message<String> tweet = new GenericMessage<String>(title + "  " + url);
		return tweet;
	}

}

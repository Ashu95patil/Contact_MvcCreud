package com.Ashu.Contact.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties("app1")
@Configuration
public class AppProps {
	
	private Map<String, String>  messagesMap = new HashMap<>();

	public Map<String, String> getMessagesMap() {
		return messagesMap;
	}

	public void setMessagesMap(Map<String, String> messagesMap) {
		this.messagesMap = messagesMap;
	}

	public AppProps(Map<String, String> messagesMap) {
		super();
		this.messagesMap = messagesMap;
	}
	
	

}

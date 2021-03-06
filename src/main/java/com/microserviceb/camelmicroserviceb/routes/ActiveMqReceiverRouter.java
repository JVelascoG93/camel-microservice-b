package com.microserviceb.camelmicroserviceb.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// set queue params
		from("activemq:my-activemq-queue")
		.to("log:received-message-from-active-mq");
	}

}

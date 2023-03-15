package com.fastcampus.study.producer;

import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	// 주입
	public Producer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	// async
	public void async(String topic, String message) {
		
		CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, message);
		
		future.whenComplete((result, e) -> {
			if (e == null) {
				System.out.println("Success async: " + topic + " / " + message );
			} else {
				System.out.println("Fail async: " + e.getMessage());
			}
		});
	}
}

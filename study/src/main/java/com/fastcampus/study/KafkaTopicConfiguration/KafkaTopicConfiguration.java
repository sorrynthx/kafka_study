package com.fastcampus.study.KafkaTopicConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfiguration {
	
	@Bean
	public KafkaAdmin.NewTopics topics() {
		
		// Topic 만들기 ( 복수일 경우, build(),TopicBuilder.name("study03").build() 추가 
		return new KafkaAdmin.NewTopics(
			TopicBuilder.name("study02").build()
		);
	}
	
}

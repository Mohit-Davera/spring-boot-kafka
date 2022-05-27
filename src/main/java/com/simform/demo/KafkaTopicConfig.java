package com.simform.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	
	@Value(value = "${spring.kafka.producer.bootstrap-servers}")
    private String bootstrapAddress;
	
//	@Bean
//    public KafkaAdmin kafkaAdmin() {
//        Map<String, Object> configs = new HashMap<>();
//        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
//        return new KafkaAdmin(configs);
//    }
    
    @Bean
    public NewTopic topic1() {
         return new NewTopic("simform", 2, (short) 1);
    }
}

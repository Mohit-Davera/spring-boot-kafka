package com.simform.demo;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "simform")
	public void consumer(String message) throws IOException {
		System.out.println("#### -> Consumed message -> " + message);
		System.out.println("Group ID 1");
	}

//	@KafkaListener(topics = "users")
//	public void consume(String message) throws IOException {
//		System.out.println("#### -> Consumed message -> " + message);
//		System.out.println("Group ID 2 ");
//	}
	
//	@KafkaListener(topics = {"users","users-demo"}, groupId = "group_i")
//	public void consumes(String message) throws IOException {
//		System.out.println("#### -> Consumed message -> " + message);
//		System.out.println("Group I");
//	}
//	
//	@KafkaListener(topics = "users-demo", groupId = "group_2")
//	public void usersDemoListner(String message) throws IOException {
//		System.out.println("#### -> Consumed message -> " + message);
//		System.out.println("Group I");
//	}

}
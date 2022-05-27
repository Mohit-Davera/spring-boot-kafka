package com.simform.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Autowired
	private Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam(value ="key",required = false) String key , @RequestParam("message") String message) {
    	key = Math.random() + "";
        producer.sendMessage(key,message);
       
    }
}

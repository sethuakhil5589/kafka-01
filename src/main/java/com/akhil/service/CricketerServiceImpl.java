package com.akhil.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.akhil.Entity.Cricketer;
import com.akhil.util.AppConstants;
@Service
public class CricketerServiceImpl implements ICricketer{

	private KafkaTemplate<String,Cricketer> kafkaTemplate;
	@Override
	public String saveData(Cricketer crick) {
		//logic to save data in DB
		
		return "Data Saved Successfully with id: "+crick.getcId();
	}
	
	public String addMsg(Cricketer crick) {
		kafkaTemplate.send(AppConstants.TOPIC_NAME, crick);
		return "Message published to Kafka Topic";
	}

}

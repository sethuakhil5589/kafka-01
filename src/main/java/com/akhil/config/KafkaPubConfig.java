package com.akhil.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.akhil.Entity.Cricketer;
import com.akhil.util.AppConstants;

@Configuration
public class KafkaPubConfig {
	
	@Bean
	public ProducerFactory<String,Cricketer> producerFactory(){
		Map<String,Object> configProps=new HashMap<String,Object>();
		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,AppConstants.HOST);
		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configProps);
	}
	
	@Bean(name="kafkaTemplate")
	public KafkaTemplate<String,Cricketer> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}
}

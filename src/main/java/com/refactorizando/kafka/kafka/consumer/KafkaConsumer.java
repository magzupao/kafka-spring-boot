package com.refactorizando.kafka.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {


  @KafkaListener(topics = "${spring.kafka.topic.name}")
  public void listener(@Payload String message) {
    log.debug("Message received {} ", message);
    //Do something
  }


}

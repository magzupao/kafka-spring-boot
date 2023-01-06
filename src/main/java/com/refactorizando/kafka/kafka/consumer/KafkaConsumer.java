package com.refactorizando.kafka.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Component
@Slf4j
public class KafkaConsumer {

  @KafkaListener(topics = "${kafka.topic.name}")
  public void consume(String message){
    log.info(String.format("*** *** *** *** Message received -> %s", message));
    log.info("Message received {} ", message);
  }

}

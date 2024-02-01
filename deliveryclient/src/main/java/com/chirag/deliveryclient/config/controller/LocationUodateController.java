package com.chirag.deliveryclient.config.controller;

import com.chirag.deliveryclient.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationUodateController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping
    public ResponseEntity<?> updateLocation(){
        for(int i=1;i<10000;i++){
            kafkaService.updateLocation("(" + Math.round(Math.random()*100) +","  + Math.round(Math.random()*100) + ")");
        }

        return new ResponseEntity<>(Map.of("Message", "Location Updated"), HttpStatus.OK);
    }
}

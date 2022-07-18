package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Train;
import com.example.trainservice.TrainServcie;

@RestController
public class TrainController {
	@Autowired
	private TrainServcie service;
	
	@RequestMapping("/trains")
	public List<Train> getTrains(){
		return service.getTrainDetails();
	}
	@RequestMapping("trains/{id}")
	public Train getTrain(@PathVariable int id) {
		return service.getId(id);
		
	}
	@RequestMapping(method = RequestMethod.POST,value = "/train")
	public void addTrain(@RequestBody Train train) {
		service.addTrain(train);
		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/train/{id}")
	public void updateTrain(@RequestBody Train train) {
		service.updateTrain(train);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/train/{id}")
	public void deleteTrain(@PathVariable int id) {
		service.deleteTrain(id);
	}

}

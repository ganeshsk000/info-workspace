package com.example.trainservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Train;
import com.example.repository.TrainRepository;
@Service
public class TrainServiceImpl implements TrainServcie {
	@Autowired
private TrainRepository repo;
	@Override
	public List<Train> getTrainDetails() {
		List<Train> list=new ArrayList<>();
		for(Train train:repo.findAll()) {
			list.add(train);
		}
		return list;
	}
	@Override
	public Train getId(int id) {
		
		return repo.findById(id).get();
	}
	@Override
	public void addTrain(Train train) {
		repo.save(train);
		
	}
	@Override
	public void updateTrain(Train train) {
		repo.save(train);
		
	}
	@Override
	public void deleteTrain(int id) {
		repo.deleteById(id)
		;
		
	}

}

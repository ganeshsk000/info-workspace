package com.example.trainservice;

import java.util.List;

import com.example.entity.Train;

public interface TrainServcie {
	List<Train> getTrainDetails();
	public Train getId(int id);
	public void addTrain(Train train);
	public void updateTrain(Train train);
	public void deleteTrain(int id);

}

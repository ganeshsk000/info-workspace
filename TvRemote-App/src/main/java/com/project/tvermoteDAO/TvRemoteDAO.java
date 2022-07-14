package com.project.tvermoteDAO;

import com.project.entity.TvRemote;

public interface TvRemoteDAO {
	void saveTvRemoteEntity(TvRemote tvRemote);
	void getTvRemoteEntityById(int id);
	void readAllEntity();
	void deleteTvRemoteEntity(int id);

}

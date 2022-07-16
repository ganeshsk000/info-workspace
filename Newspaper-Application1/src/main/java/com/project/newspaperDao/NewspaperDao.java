package com.project.newspaperDao;

import java.util.List;

import com.project.dto.NewspaperDto;
import com.project.entity.Newspaper;

public interface NewspaperDao {
	boolean  saveNewspaperEntity(Newspaper newspaper);
	Newspaper getNewspaperEntity(String newspaperName);
	List<Newspaper> getAllNewspaperEntity();
	boolean deleteNewspaperEntity(String newspaperName);
	List<Newspaper> getNewspaperEntityByName(String newspaperName);
	boolean updateNewspaperEntity(NewspaperDto newspaperDto);

}

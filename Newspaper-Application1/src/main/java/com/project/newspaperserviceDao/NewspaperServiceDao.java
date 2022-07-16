package com.project.newspaperserviceDao;

import java.util.List;

import com.project.dto.NewspaperDto;

public interface NewspaperServiceDao {
	boolean validateNewspaperDto(NewspaperDto newspaperDto);
	boolean saveNewspaperDto(NewspaperDto newspaperDto);
	boolean validateNewspaperName(String newspaperName);
	NewspaperDto getNewspaperName(String newspaperName);
	List<Object> getAllNewspaperEntity();
	boolean deleteNewspaperEntity(String newspaperName);
	List<Object>getNewspaperEntity(String newspaperName);
	boolean updateNewspaperEntity(NewspaperDto newspaperDto);

}

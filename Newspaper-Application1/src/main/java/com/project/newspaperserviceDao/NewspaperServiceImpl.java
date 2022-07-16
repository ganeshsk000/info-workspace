package com.project.newspaperserviceDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dto.NewspaperDto;
import com.project.entity.Newspaper;
import com.project.newspaperDao.NewspaperDao;

@Component
public class NewspaperServiceImpl implements NewspaperServiceDao {
	@Autowired
	private NewspaperDao newspaperDao;

	public NewspaperServiceImpl() {
		System.out.println("Object is created: " + this.getClass().getName());
	}

	@Override
	public boolean validateNewspaperDto(NewspaperDto newspaperDto) {
		System.out.println("involked validate newspaper serviceDto()");
		boolean flag = false;
		if (newspaperDto.getNewspaperName() != null && !newspaperDto.getNewspaperName().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Newspaper Name is invalid,,,,,,,,,,,,,,,");
			return flag;
		}
		if (newspaperDto.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Newspaper price is invalid,,,,,,,,,,,,,");
			return flag;
		}
		if (newspaperDto.getLanguage() != null && !newspaperDto.getLanguage().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Newspaper Language is invalid,,,,,,,,,,,,,");
			return flag;
		}
		if (newspaperDto.getNoOfPages() > 0) {
			flag = true;

		} else {
			flag = false;
			System.out.println("Newspaper No of Pages is invalid,,,,,,,,,,,,,");
			return flag;
		}
		return flag;
	}

	@Override
	public boolean saveNewspaperDto(NewspaperDto newspaperDto) {
		System.out.println("involked newspaper save NewspaperDato()");
		Newspaper newspaper = new Newspaper();
		BeanUtils.copyProperties(newspaperDto, newspaper);
		boolean result = this.newspaperDao.saveNewspaperEntity(newspaper);
		return result;
	}

	@Override
	public boolean validateNewspaperName(String newspaperName) {
		System.out.println("involked NewspaperName()");
		boolean flag = false;
		if (newspaperName != null && !newspaperName.isEmpty()) {
			flag = true;
			return flag;
		} else {
			flag = false;
			System.out.println("Newspaper Name is invalid,,,,,,,,,,,,");
		}

		return flag;
	}

	@Override
	public NewspaperDto getNewspaperName(String newspaperName) {
		System.out.println("involked get NewspaperName()");
		Newspaper entity = this.newspaperDao.getNewspaperEntity(newspaperName);
		if (entity != null) {
			NewspaperDto dto = new NewspaperDto();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<Object> getAllNewspaperEntity() {
		System.out.println("involked getAllNewspaperEntity");
		List<Object> newspaperCantainer = null;
		List<Newspaper> newspaperEntityContainer = this.newspaperDao.getAllNewspaperEntity();
		if (newspaperEntityContainer != null) {
			return newspaperCantainer = new ArrayList<Object>(newspaperEntityContainer);
		}
		return newspaperCantainer;
	}

	@Override
	public boolean deleteNewspaperEntity(String newspaperName) {
		System.out.println("involked deleteNewspaperName()");
		boolean newspaper = this.newspaperDao.deleteNewspaperEntity(newspaperName);
		return true;

	}

	@Override
	public List<Object> getNewspaperEntity(String newspaperName) {
		System.out.println("NewspaperServiceImpl.getNewspaperEntity()");
		List<Object> newspaperContainer = null;
		List<Newspaper> newspaperEntityContainer = this.newspaperDao.getNewspaperEntityByName(newspaperName);
		if (newspaperEntityContainer != null) {
			return newspaperContainer = new ArrayList<Object>(newspaperEntityContainer);

		}
		return newspaperContainer;
	}

	@Override
	public boolean updateNewspaperEntity(NewspaperDto newspaperDto) {
		System.out.println("NewspaperServiceImpl.updateNewspaperEntity()");
		boolean entity = this.newspaperDao.updateNewspaperEntity(newspaperDto);
		return entity;

	}

}

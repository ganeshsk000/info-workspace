package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dto.NewspaperDto;
import com.project.newspaperserviceDao.NewspaperServiceDao;

@Component
@RequestMapping("/")
public class NewspaperController {
	@Autowired
	private NewspaperServiceDao newspaperService;

	public NewspaperController() {
		System.out.println("Object is created: " + this.getClass().getName());
	}

	@RequestMapping("/save.do")
	public String saveData(@ModelAttribute NewspaperDto newsPaperDto, Model model) {
		System.out.println("involked Save Newspaper()");
		if (this.newspaperService.validateNewspaperDto(newsPaperDto)) {
			boolean isSaved = this.newspaperService.saveNewspaperDto(newsPaperDto);
			if (isSaved) {
				model.addAttribute("Name", newsPaperDto.getNewspaperName());
				model.addAttribute("Price", newsPaperDto.getPrice());
				model.addAttribute("Language", newsPaperDto.getLanguage());
				model.addAttribute("NoOfPages", newsPaperDto.getNoOfPages());
				model.addAttribute("ValidateMessage", "Data is saved sucessfully");
				// return "/WEB-INF/Pages/viewDetails.jsp";
			}
		} else {
			model.addAttribute("ValidateMessage", "Invalid data,,,,,,,Please check it once");
		}

		return "/WEB-INF/Pages/viewDetails.jsp";
	}

	@RequestMapping("/search.do")
	public String getNewspaperName(@RequestParam String newspaperName, Model model) {
		System.out.println("involked getNewspaperName()");
		if (this.newspaperService.validateNewspaperName(newspaperName)) {
			NewspaperDto Dto = this.newspaperService.getNewspaperName(newspaperName);
			if (Dto != null) {
				model.addAttribute("Name", Dto.getNewspaperName());
				model.addAttribute("Price", Dto.getPrice());
				model.addAttribute("Language", Dto.getLanguage());
				model.addAttribute("NoOfPages", Dto.getNoOfPages());
				return "/WEB-INF/Pages/viewNewspaperDetails.jsp";

			} else {
				model.addAttribute("Message", "Newspaper Name is not found");
				return "/WEB-INF/Pages/ErrorviewNewspaperDetails.jsp";

			}

		}
		return "/WEB-INF/Pages/viewNewspaperDetails.jsp";

	}

	@RequestMapping("/view.do")
	public String getAllNewspaperEntity(Model model) {
		System.out.println("involked get All Newspaper Entity()");
		List<Object> allNewsaperEntity = this.newspaperService.getAllNewspaperEntity();
		model.addAttribute("ListOfNewspaper", allNewsaperEntity);
		return "/WEB-INF/Pages/viewAllNewspaperDetails.jsp";

	}

	@RequestMapping("/delete.do")
	public String deleteNewspaperEntityByName(@RequestParam String newspaperName, Model model) {
		System.out.println("involked delete Newspaper Entity By Name,,,,,,,,,");
		boolean isDeleted = this.newspaperService.deleteNewspaperEntity(newspaperName);
		if (isDeleted) {
			model.addAttribute("ValidationMessage", "Newspaper Details Deleted Sucessfully,");

		} else {
			model.addAttribute("ValidationMessage", "Could not delete the data,,,,,,,,,,,");
		}
		return "/WEB-INF/Pages/errorNewspaperDetails.jsp";

	}

	@RequestMapping("/searchNewspaper.do")
	public String getAllNewspaperEntityName(@RequestParam String newspaperName, Model model) {
		System.out.println("NewspaperController.getAllNewspaperEntityName()");
		if (this.newspaperService.validateNewspaperName(newspaperName)) {
			List<Object> newspaperDto = this.newspaperService.getNewspaperEntity(newspaperName);
			model.addAttribute("ListOfNewspaper", newspaperDto);
			return "/WEB-INF/Pages/viewDuplicateNewspaperDetails.jsp";
		} else {
			model.addAttribute("NOTFOUND", "Newspaper not found");
			return "/WEB-INF/Pages/viewDuplicateNewspaperDetails.jsp";

		}

	}

	@RequestMapping("/update.do")
	public String updateNewspaperEntity(@RequestParam String newspaperName, @ModelAttribute NewspaperDto dto,
			Model model) {
		System.out.println("NewspaperController.updateNewspaperEntity()");
		boolean updated = this.newspaperService.updateNewspaperEntity(dto);
		if (updated) {

			if (dto != null) {
				model.addAttribute("newspaperName", dto.getNewspaperName());
				model.addAttribute("price", dto.getPrice());
				model.addAttribute("language", dto.getLanguage());
				model.addAttribute("noOfPages", dto.getNoOfPages());
				model.addAttribute("Message", "Newspaper Details Updated sucessfully");
				return "/WEB-INF/Pages/updateNewspaperDetails.jsp";
			} else {
				model.addAttribute("Message", "Data is not updated,,,,,,,,,,");
				return "/WEB-INF/Pages/ErrorUpdateNewspaperDetails.jsp";
			}

		} else {
			model.addAttribute("Message", "Data is not updated,,,,,,,,,,");
			return "/WEB-INF/Pages/ErrorUpdateNewspaperDetails.jsp";
		}
	}
}

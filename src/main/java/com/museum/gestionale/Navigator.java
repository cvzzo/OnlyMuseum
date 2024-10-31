package com.museum.gestionale;


import com.museum.gestionale.Dao.PaintingDao;
import com.museum.gestionale.Entity.Painting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class Navigator {

//	@Autowired
//	private AuthorDao autoreDao;
//
	@Autowired
	private PaintingDao paintingDao;

	@RequestMapping()
	public String landingPage() {
		return "index";
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Painting> paintingList = paintingDao.findAll();
		model.addAttribute("paintings", paintingList);

		return "index";
	}

	@RequestMapping("/paintings")
	public String paintings(Model model) {
		List<Painting> paintingList = paintingDao.findAll();
		model.addAttribute("paintings", paintingList);
		return "paintings";
	}

	@RequestMapping("/info")
	public String operePage() {
		return "info";
	}


	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}

	@PostMapping("/submitPainting")
	public String submitPainting(
			@RequestParam String name,
			@RequestParam String author,
			@RequestParam String date,
			@RequestParam String description,
			@RequestParam String position,
			@RequestParam String originalMuseum,
			@RequestParam String material,
			@RequestParam double height,
			@RequestParam double width,
			@RequestParam MultipartFile image,
			Model model
	) {

		model.addAttribute("message", "Painting submitted successfully!");
		return "result";
	}

}

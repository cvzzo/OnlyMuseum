package com.museum.gestionale;


import com.museum.gestionale.Dao.PaintingDao;
import com.museum.gestionale.Entity.Painting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class Navigator {


	@Autowired
	private PaintingDao paintingDao;

	@RequestMapping()
	public String landingPage() {
		return "paintings";
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Painting> paintingList = paintingDao.findAll();
		System.out.println(paintingList);
		model.addAttribute("paintings", paintingList);

		return "paintings";
	}


	@RequestMapping("/paintings")
	public String paintings(Model model) {
		List<Painting> paintingList = paintingDao.findAll();

		model.addAttribute("paintings", paintingList);
		return "paintings";
	}

	@RequestMapping("/info")
	//passiamo il nome dell'opera, query sull'opera
	public String operePage() {
		return "info";
	}


	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}

	@GetMapping("/painting/info/{id}")
	public String paintingInfo(@PathVariable int id, Model model) {
		Painting painting = paintingDao.findById(id);
		if (painting != null) {
			model.addAttribute("painting", painting);
			return "info";
		}
		return "redirect:/";
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
		//creo oggetto
		paintingDao.save(new Painting());
		model.addAttribute("message", "Painting submitted successfully!");
		return "result";
	}

}

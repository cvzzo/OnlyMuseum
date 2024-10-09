package com.museum.gestionale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

@Controller
public class PaintingController {

	@GetMapping("/")
	public String showForm() {
		return "paintingForm";
	}

	@PostMapping("/submitPainting")
	public String submitPainting(@RequestParam String name,
								 @RequestParam String author,
								 @RequestParam String date,
								 @RequestParam String description,
								 @RequestParam String position,
								 @RequestParam String originalMuseum,
								 @RequestParam String material,
								 @RequestParam double height,
								 @RequestParam double width,
								 @RequestParam MultipartFile image,
								 Model model) {

		model.addAttribute("message", "Painting submitted successfully!");
		return "result";
	}
}

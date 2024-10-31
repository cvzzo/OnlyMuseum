package com.museum.gestionale;

import com.museum.gestionale.Dao.AuthorDao;
import com.museum.gestionale.Dao.PaintingDao;
import com.museum.gestionale.Entity.Author;
import com.museum.gestionale.Entity.Painting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paintings")
public class PaintingNavigator {

	@Autowired
	private PaintingDao paintingDao;

	@GetMapping
	public String listPaintings(Model model) {
		List<Painting> paintingList = paintingDao.findAll();

		model.addAttribute("paintings", paintingList);
		return "paintings";
	}

	@GetMapping("/{id}")
	public String paintingsDetails(Model model, @PathVariable Long id) {
		Painting painting = paintingDao.findById(id)
								.orElseThrow(() -> new RuntimeException("Author not found"));
		model.addAttribute("painting", painting);
		return "info";

	}

}

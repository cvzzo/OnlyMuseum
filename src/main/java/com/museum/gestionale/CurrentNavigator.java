package com.museum.gestionale;

import com.museum.gestionale.Dao.AuthorDao;
import com.museum.gestionale.Dao.CurrentDao;
import com.museum.gestionale.Entity.Author;
import com.museum.gestionale.Entity.Current;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/currents")
public class CurrentNavigator {

	@Autowired
	private CurrentDao currentDao;

	@GetMapping
	public String listAuthors(Model model) {
		List<Current> currents = currentDao.findAll();
		model.addAttribute("currents", currents);
		return "currents";
	}

	@GetMapping("/{id}")
	public String authorDetails(@PathVariable Long id, Model model) {
		Current current = currentDao.findById(id)
								.orElseThrow(() -> new RuntimeException("Author not found"));
		model.addAttribute("current", current);
		return "currents-details";
	}
}
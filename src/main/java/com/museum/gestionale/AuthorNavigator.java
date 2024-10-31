package com.museum.gestionale;

import com.museum.gestionale.Dao.AuthorDao;
import com.museum.gestionale.Entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorNavigator {

	@Autowired
	private AuthorDao authorRepository;

	@GetMapping
	public String listAuthors(Model model) {
		List<Author> authors = authorRepository.findAll();
		model.addAttribute("authors", authors);
		return "author";
	}

	@GetMapping("/{id}")
	public String authorDetails(@PathVariable Long id, Model model) {
		Author author = authorRepository.findById(id)
								.orElseThrow(() -> new RuntimeException("Author not found"));
		model.addAttribute("author", author);
		return "author-details";
	}
}
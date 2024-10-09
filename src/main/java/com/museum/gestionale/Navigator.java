package com.museum.gestionale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Navigator {

    @RequestMapping()
    public String landingPage() {
        return "index";
    }


    @RequestMapping("/info")
    public String operePage() {
        return "info";
    }


    @GetMapping("/addPainting")
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

package com.museum.gestionale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}

package com.museum.gestionale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Navigator {


    @RequestMapping()
    public String landingPage() {
        return "index";
    }

}

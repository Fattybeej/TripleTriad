package com.tripletriad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
public class IndexController {

    @RequestMapping(value={"","/","index"})
    public String loadIndexPage(Model m) {
        m.addAttribute("title", "Triple Triad Game");
        m.addAttribute("author", "Ben Johnson");
        m.addAttribute("year", Calendar.getInstance().get(Calendar.YEAR));
        return "index";
    }
}
package io.github.alfyorov.chucknorrisjokes.controller;

import io.github.alfyorov.chucknorrisjokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getChuckQuote(Model model) {
        model.addAttribute("joke", jokesService.getChuckQuote());

        return "index";
    }
}

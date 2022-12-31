package io.github.alfyorov.chucknorrisjokes.controllers;

import io.github.alfyorov.chucknorrisjokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({ "/", "" })
    public String showChuckQuote(Model model) {
        model.addAttribute("joke", jokesService.getChuckQuote());

        return "index";
    }
}

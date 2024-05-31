package com.atvLeo.championsLeague.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atvLeo.championsLeague.Model.Clube;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private DadosController dadosController;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/clubes")
    public String getClubes(Model model) {
        model.addAttribute("clubes", dadosController.listAllClubes());
        return "clubes";
    }

    @GetMapping("/top5")
    public String getTop5Clubes(Model model) {
        List<Clube> top5Clubes = dadosController.listTop5Clubes();
        model.addAttribute("clubes", top5Clubes);
        return "clubes";
    }
}

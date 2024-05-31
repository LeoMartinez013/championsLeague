package com.atvLeo.championsLeague.Controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.atvLeo.championsLeague.Model.Clube;

@RestController
@RequestMapping("api/clubes")
public class DadosController {
    private static final List<Clube> 
        clubes = new ArrayList<Clube>();

    public DadosController() {
        clubes.add(new Clube("Real Madrid", 14));
        clubes.add(new Clube("Milan", 7));
        clubes.add(new Clube("Liverpool", 6));
        clubes.add(new Clube("Bayern", 6));
        clubes.add(new Clube("Barcelona", 6));
        clubes.add(new Clube("Ajax", 5));
        clubes.add(new Clube("Man United", 3));
        clubes.add(new Clube("Inter", 3));
        clubes.add(new Clube("Chelsea", 2));
        clubes.add(new Clube("Nottm Forest", 2));
        clubes.add(new Clube("Benfica", 2));
        clubes.add(new Clube("Juventus", 2));
        clubes.add(new Clube("FC Porto", 2));
        clubes.add(new Clube("Man City", 1));
        clubes.add(new Clube("Bor Dortmund", 1));
        clubes.add(new Clube("Feyenoord", 1));
        clubes.add(new Clube("Marseille", 1));
        clubes.add(new Clube("Aston Villa", 1));
        clubes.add(new Clube("Hamburg", 1));
        clubes.add(new Clube("Crvena zvezda", 1));
        clubes.add(new Clube("FCSB", 1));
        clubes.add(new Clube("PSV", 1));
        clubes.add(new Clube("Celtic", 1));
    }
    
    @GetMapping
    public List<Clube> listAllClubes() {
        return clubes;
    }
    @GetMapping("/top5")
    public List<Clube> listTop5Clubes() {
        return clubes.stream()
            .sorted(Comparator.comparingInt(Clube::getNumero).reversed())
            .limit(5)
            .collect(Collectors.toList());
    }
}

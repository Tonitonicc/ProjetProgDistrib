package com.montre.bracelet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BraceletController {
    @GetMapping("/bracelets")
    public List<String> getBracelets() {
        return List.of("Bracelet Cuir", "Bracelet Métal");
    }
}
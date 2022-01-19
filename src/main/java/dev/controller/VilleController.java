package dev.controller;

import dev.entity.Ville;
import dev.service.VilleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ville")
public class VilleController {

    private VilleService villeService;

    public VilleController(VilleService villeService) {
        this.villeService = villeService;
    }

    @PostMapping
    public ResponseEntity<Ville> create(@RequestBody Ville villeACreer) {
        return ResponseEntity
                .ok()
                .body(this.villeService.createVille(villeACreer));
    }
}

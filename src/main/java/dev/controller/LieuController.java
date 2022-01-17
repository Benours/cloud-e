package dev.controller;

import dev.entity.Lieu;
import dev.entity.Todo;
import dev.service.LieuService;
import dev.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lieu")
public class LieuController {

    private LieuService lieuService;

    public LieuController(LieuService lieuService) {
        this.lieuService = lieuService;
    }

    @PostMapping
    public ResponseEntity<Lieu> create(@RequestBody Lieu lieuACreer) {
        return ResponseEntity
                .ok()
                .body(this.lieuService.createLieu(lieuACreer));
    }
}

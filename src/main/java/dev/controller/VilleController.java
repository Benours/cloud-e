package dev.controller;

import dev.entity.Ville;
import dev.service.VilleService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    
    @GetMapping("{nomVille}")
	public ResponseEntity<?> user(@PathVariable String nomVille) {
		Optional<Ville> ville = this.villeService.findVille(nomVille);
		if (ville.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("La ville n'est pas referencee/une ereur de frappe?");
		return ResponseEntity.ok().body(ville);
	}
}

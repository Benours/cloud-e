package dev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entity.QualiteAir;
import dev.service.QualiteAirService;

@RestController
@RequestMapping("qualiteAir")
public class QualiteAirController {
	
	private QualiteAirService qualiteAirService;

	public QualiteAirController(QualiteAirService qualiteAirService) {
		super();
		this.qualiteAirService = qualiteAirService;
	}

	@GetMapping("{id}")
	public ResponseEntity<?> findNotification(@PathVariable Integer id) {
		return ResponseEntity.ok().body(this.qualiteAirService.findQualiteAir(id));
	}
}

package org.famas.main.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Validated
public class BeanValidationController {

	@GetMapping("/validatePathVariable/{id}")
	String validatePathVariable(@PathVariable("id") @Min(5) int id) {
		return "valid";
	}

	@GetMapping("/validateRequestParameter")
	ResponseEntity<Integer> validateRequestParameter(@RequestParam("param") @Min(5) int param) {
		return ResponseEntity.ok(param);
	}

	@PostMapping("/validateBody")
	ResponseEntity<String> validateBody(@Valid @RequestBody Input input) {
		return ResponseEntity.ok("valid");
	}
}

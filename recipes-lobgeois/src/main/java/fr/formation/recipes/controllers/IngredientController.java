package fr.formation.recipes.controllers;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.recipes.dtos.views.IngredientsViewDto;
import fr.formation.recipes.services.IngredientService;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService service;

    protected IngredientController(IngredientService service) {
	this.service = service;
    }

    @GetMapping
    public Set<IngredientsViewDto> getAll() {
	return service.getAll();
    }

    @GetMapping("/{id}")
    public IngredientsViewDto getOne(@PathVariable("id") Integer id) {
	return service.getOne(id);
    }
}

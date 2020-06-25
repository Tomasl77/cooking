package fr.formation.recipes.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.recipes.dtos.views.IngredientsViewDto;
import fr.formation.recipes.entities.Ingredient;

@Repository
public interface IngredientRepository
        extends JpaRepository<Ingredient, Integer> {

    Set<IngredientsViewDto> getAllProjectedBy();

    IngredientsViewDto getByIdIngredient(Integer id);
}

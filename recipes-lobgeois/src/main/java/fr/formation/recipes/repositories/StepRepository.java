package fr.formation.recipes.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.recipes.dtos.views.StepViewDto;
import fr.formation.recipes.entities.Step;

@Repository
public interface StepRepository extends JpaRepository<Step, Integer> {

    Set<StepViewDto> getAllProjectedBy();
}

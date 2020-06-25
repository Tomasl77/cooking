package fr.formation.recipes.dtos;

import java.util.Set;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import fr.formation.recipes.entities.Difficulty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Validated
public class PostRecipeDto {

    @NotBlank
    @Length(min = 3, max = 100)
    private String recipeName;

    @Min(1)
    @Max(120)
    private short preparingTimeMinutes;

    @Min(1)
    @Max(240)
    private short cookingTimeMinutes;

    @Min(1)
    @Max(10)
    private short servings;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @NotBlank
    @Length(min = 7, max = 2500)
    private String dishImageUrl;

    @Valid
    @NotEmpty
    @Size(min = 1, max = 50)
    private Set<IngredientDto> ingredients;

    @Valid
    @NotEmpty
    @Size(min = 1, max = 20)
    private Set<StepDto> steps;
}

package fr.formation.recipes.dtos;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IngredientDto {

    @NotBlank
    @Length(max = 255)
    private String ingredientWording;

    public IngredientDto() {
    }
}

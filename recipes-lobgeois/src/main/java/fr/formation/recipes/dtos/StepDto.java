package fr.formation.recipes.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StepDto {

    @NotBlank
    @Length(max = 255)
    private String stepWording;

    @NotNull
    private short stepOrder;

    public StepDto() {
    }
}

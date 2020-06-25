package fr.formation.recipes.entities;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "steps")
public class Step {

    @JoinColumn(name = "id_recipe", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_steps_recipes_idx"))
    private Recipe recipe;
}

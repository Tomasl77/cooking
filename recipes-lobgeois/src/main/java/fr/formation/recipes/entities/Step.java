package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "steps", indexes = @Index(name = "fk_steps_recipes_idx", columnList = "id_recipe"), uniqueConstraints = @UniqueConstraint(name = "uk_recipe_order", columnNames = {
        "id_recipe", "step_order" }))
@Getter
@Setter
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_step")
    private Integer idStep;

    @JoinColumn(name = "id_recipe", referencedColumnName = "id_recipe", nullable = false, foreignKey = @ForeignKey(name = "fk_steps_recipes"))
    @ManyToOne
    private Recipe recipe;

    @Column(name = "step_wording", nullable = false, length = 255)
    private String stepWording;

    @Column(name = "step_order", nullable = false)
    private short stepOrder;

    protected Step() {
    }
}

package fr.formation.recipes.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recipes", uniqueConstraints = @UniqueConstraint(name = "fk_recipe_name", columnNames = {
        "recipe_name" }))
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private Integer idRecipe;

    @Column(name = "recipe_name", nullable = false, length = 100)
    private String recipeName;

    @Column(name = "preparing_time_minutes", nullable = false)
    private short preparingTimeMinutes;

    @Column(name = "cooking_time_minutes", nullable = true)
    private short cookingTimeMinutes;

    @Column(name = "servings", nullable = false)
    private short servings;

    @Column(name = "difficulty", nullable = false, columnDefinition = "ENUM('LOW', 'MEDIUM', 'HIGH')")
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @Column(name = "dish_image_url", nullable = false, length = 255)
    private String dishImageUrl;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_recipe", nullable = false, referencedColumnName = "id_recipe", foreignKey = @ForeignKey(name = "fk_ingredients_recipes"))
    private Set<Step> steps;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_recipe", nullable = false, referencedColumnName = "id_recipe", foreignKey = @ForeignKey(name = "fk_steps_recipes"))
    private Set<Ingredient> ingredients;

    /**
     * Empty constructor
     */
    public Recipe() {
    }
}

package fr.formation.recipes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe extends AbstractEntity {

    @Column(name = "recipe_name", nullable = false, length = 100)
    private String recipeName;

    @Column(name = "preparing_time_minutes", nullable = false)
    private short preparingTimeMinutes;

    @Column(name = "coking_time_minutes", nullable = true)
    private short cookingTimeMinutes;

    @Column(name = "servings", nullable = false)
    private short servings;

    @Column(name = "difficulty", nullable = false)
    private Enum<Difficulty> difficulty;

    @Column(name = "dish_image_url", nullable = false, length = 255)
    private String dishImageUrl;
}

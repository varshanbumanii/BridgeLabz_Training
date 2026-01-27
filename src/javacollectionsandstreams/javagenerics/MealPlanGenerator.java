package javacollectionsandstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealType();
    int getCalories();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public int getCalories() {
        return 2000;
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public int getCalories() {
        return 2200;
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

public class MealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        return new Meal<>(meal);
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = generateMealPlan(new HighProteinMeal());

        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();
        mealPlans.add(vegMeal);
        mealPlans.add(veganMeal);
        mealPlans.add(ketoMeal);
        mealPlans.add(proteinMeal);

        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println(
                    meal.getMeal().getMealType() + " Meal | Calories: " +
                            meal.getMeal().getCalories()
            );
        }
    }
}


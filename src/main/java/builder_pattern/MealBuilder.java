package builder_pattern;

import builder_pattern.pojo.ChikenBurger;
import builder_pattern.pojo.Coke;
import builder_pattern.pojo.Pepsi;
import builder_pattern.pojo.VegBurger;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class MealBuilder  {
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return  meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

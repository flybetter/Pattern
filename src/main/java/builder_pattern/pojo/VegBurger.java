package builder_pattern.pojo;

import builder_pattern.item.Burger;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class VegBurger extends Burger {
//   @Override
    public float price() {
        return 25.0f;
    }
//   # @Override
    public String name() {
        return "Veg Burger";
    }
}

package builder_pattern.pojo;

import builder_pattern.item.Burger;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class ChikenBurger extends Burger {
//    @Override
    public float price() {
        return 50.5f;
    }

//    @Override
    public String name() {
        return "Chicken Burger";
    }
}

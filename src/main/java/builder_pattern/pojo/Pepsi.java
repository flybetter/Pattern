package builder_pattern.pojo;

import builder_pattern.item.ColdDrink;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Pepsi extends ColdDrink {
//    @Override
    public float price() {
        return 35.0f;
    }
//    @Override
    public String name() {
        return "Pepsi";
    }
}

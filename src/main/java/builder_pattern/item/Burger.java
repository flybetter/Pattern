package builder_pattern.item;

import builder_pattern.item_packing.Item;
import builder_pattern.item_packing.Packing;
import builder_pattern.packing.Wrapper;

/**
 * Created by wubingyu on 2017/2/26.
 */
public abstract class Burger implements Item {
//    @Override
    public Packing packing() {
        return new Wrapper();
    }
//    @Override
//    public abstract float price();
}

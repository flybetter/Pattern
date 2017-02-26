package builder_pattern.item;

import builder_pattern.item_packing.Item;
import builder_pattern.item_packing.Packing;
import builder_pattern.packing.Bottle;

/**
 * Created by wubingyu on 2017/2/26.
 */
public abstract class ColdDrink implements Item {
//    @Override
    public Packing packing() {
        return new Bottle();
    }
//    @Override
//    public abstract float price() ;
}

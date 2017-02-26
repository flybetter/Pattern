package builder_pattern.item_packing;

import builder_pattern.item_packing.Packing;

/**
 * Created by wubingyu on 2017/2/26.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

package builder_pattern;

import builder_pattern.item_packing.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wubingyu on 2017/2/26.
 */
public class Meal  {

    private List <Item> items=new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    };

    public float getCost(){
        float cost=0.0f;
        for (Item item: items) {
            cost+=item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item:items){
            System.out.println("Item:"+item.name());
            System.out.println(", Packing:"+item.packing().pack());
            System.out.println(", Price:"+item.price());
        }
    }
}

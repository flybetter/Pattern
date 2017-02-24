package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);
	
	public abstract Shape getShape(String shape);

}

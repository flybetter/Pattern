package abstract_factory_pattern.factory;

import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Square;
import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.shape.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeTYpe) {
		// TODO Auto-generated method stub
		if(null==shapeTYpe){
			return null;
		}
		
		if("RECTANGLE".equalsIgnoreCase(shapeTYpe)){
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shapeTYpe)){
			return new Square();
		}else if("CIRCLE".equalsIgnoreCase(shapeTYpe)){
			return new Circle();
		}else{
			return null;
		}
	}

}

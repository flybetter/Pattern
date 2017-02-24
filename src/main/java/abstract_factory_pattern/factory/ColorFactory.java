package abstract_factory_pattern.factory;

import abstract_factory_pattern.color.Blue;
import abstract_factory_pattern.color.Color;
import abstract_factory_pattern.color.Green;
import abstract_factory_pattern.color.Red;
import abstract_factory_pattern.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(null==color){
			
		}
		if("RED".equalsIgnoreCase(color)){
			return new Red();
		}else if("GREEN".equalsIgnoreCase(color)){
			return new Green();
		}else if("BLUE".equalsIgnoreCase(color)){
			return new Blue();
		}else{
			return null;	
		}
		
		
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}

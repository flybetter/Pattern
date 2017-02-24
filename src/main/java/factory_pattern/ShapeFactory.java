package factory_pattern;

public class ShapeFactory {
		
	public Shape getShape(String shapeTYpe){
		
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

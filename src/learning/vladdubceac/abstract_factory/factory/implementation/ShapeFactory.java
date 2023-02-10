package learning.vladdubceac.abstract_factory.factory.implementation;

import learning.vladdubceac.abstract_factory.factory.AbstractFactory;
import learning.vladdubceac.abstract_factory.product.color.Color;
import learning.vladdubceac.abstract_factory.product.color.ColorEnum;
import learning.vladdubceac.abstract_factory.product.shape.Shape;
import learning.vladdubceac.abstract_factory.product.shape.ShapeEnum;
import learning.vladdubceac.abstract_factory.product.shape.implementation.Circle;
import learning.vladdubceac.abstract_factory.product.shape.implementation.Rectangle;
import learning.vladdubceac.abstract_factory.product.shape.implementation.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorEnum colorType) {
        return null;
    }

    @Override
    public Shape getShape(ShapeEnum shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}

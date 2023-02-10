package learning.vladdubceac.abstract_factory.factory;

import learning.vladdubceac.abstract_factory.product.color.Color;
import learning.vladdubceac.abstract_factory.product.color.ColorEnum;
import learning.vladdubceac.abstract_factory.product.shape.Shape;
import learning.vladdubceac.abstract_factory.product.shape.ShapeEnum;

public abstract class AbstractFactory {
    public abstract Color getColor(ColorEnum colorType);

    public abstract Shape getShape(ShapeEnum shapeType);
}

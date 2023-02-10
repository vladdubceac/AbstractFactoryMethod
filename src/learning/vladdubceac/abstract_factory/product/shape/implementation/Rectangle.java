package learning.vladdubceac.abstract_factory.product.shape.implementation;

import learning.vladdubceac.abstract_factory.product.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}

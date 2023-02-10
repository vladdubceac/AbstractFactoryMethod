package learning.vladdubceac.abstract_factory.product.color.implementation;

import learning.vladdubceac.abstract_factory.product.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}

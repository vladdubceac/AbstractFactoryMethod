package learning.vladdubceac.abstract_factory.product;

public interface ProductInterface {
    default void getInfo(){
        System.out.println("Product of type "+getClass().getSimpleName());
    }
}

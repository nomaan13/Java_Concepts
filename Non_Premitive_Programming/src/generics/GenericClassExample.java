package generics;

public class GenericClassExample<T> {

    private T container;

    GenericClassExample(){}
    GenericClassExample(T container){
        this.container = container;
    }
    public void setContainer(T container) {
        this.container = container;
    }
    public T getContainer() {
        return container;
    }
}

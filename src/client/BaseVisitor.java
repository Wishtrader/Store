package client;

import Interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy() {

    }

    @Override
    public void returnGoods() {

    }

    @Override
    public String getName() {
        return name;
    }
}

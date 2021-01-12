package client;

public class VIPvisitor extends BaseVisitor {

    private float discount;

    @Override
    public void buy() {
       if (!checkDiscount()) {
           super.buy();
       } else {

       }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }
}

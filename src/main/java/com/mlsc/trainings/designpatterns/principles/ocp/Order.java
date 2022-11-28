package com.mlsc.trainings.designpatterns.principles.ocp;

public class Order {

    private Object lineItems;
    private Shipping shipping;

    public Order(Shipping shipping) {

        this.shipping = shipping;
    }


    public long getTotal() {


        return 0;
    }

    /**
     * Pre-Condition :
     * Post-Condition :
     *
     * @return
     */
    public Long geTotalWeight() {

        return null;
    }

//    public void setShippingType(Shipping type) {
//
//        this.shipping = type;
//
//    }

    /**
     * shippingType == "ground"
     * total > 100
     * return 0
     * return max(10, getTotalWeight) * 1.5)
     * <p>
     * shippingType == "air"
     * return max (20, getTotalWeight() * 3);
     *
     * @return
     */
    public long getShippingCost() {
        return shipping.getCost(this);

//        return 0;
    }


}

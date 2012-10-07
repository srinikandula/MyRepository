package quickstart;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class ShippingCalculator {

    /*  Returns a list of made-up ShippingOptions.
    */
    public List getShippingOptions(int zipcode, double pounds) {
    	System.out.println("here..........");
        List        options = new ArrayList();
        double      baseCost;

        baseCost = Math.round(zipcode / 10000) + (pounds * 5);

        options.add(new ShippingOption("Next Day", baseCost * 4));
        options.add(new ShippingOption("Two Day Air", baseCost * 2));
        options.add(new ShippingOption("Saver Ground", baseCost));

        return options;
    }
}
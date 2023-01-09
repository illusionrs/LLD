package pen_design.multiClass;

import pen_design.singleClass.PenType;
import pen_design.singleClass.Refill;

public class GELPen  extends Pen{

    private Refill refill;

    public GELPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing with Gel Pen");
        
    }

    @Override
    public void changeRefill(Refill refill) {
        if (this.refill.getRefillable()) {
            this.refill = refill;
        }
    }
    
}

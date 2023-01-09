package pen_design.multiClass;

import pen_design.singleClass.PenType;
import pen_design.singleClass.Refill;

public abstract class Pen {

    
    private String brand;
    private String name;
    private PenType penType;
    private Double price;
    
    public Pen(String brand2, String name2, PenType gel, Double price2) {
        this.brand = brand2;
        this.name = name2;
        this.penType = gel;
        this.price = price2;
    }

    public abstract void write();

    public abstract void changeRefill(Refill refill);
    
}

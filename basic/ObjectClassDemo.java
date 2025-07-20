package basic;

class Laptop{
    String model;
    int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    

    

    
}

public class ObjectClassDemo {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell",66000);
        Laptop laptop2 = new Laptop("Dell",66000);
        Laptop laptop3 = new Laptop("Asus",65000);

        System.out.println(laptop1.equals(laptop2)); // true
        System.out.println(laptop1.equals(laptop3)); // false
        System.out.println(laptop2.equals(laptop3)); // false

        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

    }    
}

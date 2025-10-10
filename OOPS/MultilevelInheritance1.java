class Footwear {
    String brand;
    double size;

    Footwear(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public void getFootwear() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
    }
}


class Shoes extends Footwear {
    String color;

    Shoes(String brand, double size, String color) {
        super(brand, size); 
        this.color = color;
    }

   public  void getShoes() {
        
        System.out.println("Color: " + color);
    }
}


class SportsShoes extends Shoes {
    String sportType;

    SportsShoes(String brand, double size, String color, String sportType) {
        super(brand, size, color);
        this.sportType = sportType;
    }

    public void getSportsShoes() {
      
        System.out.println("Sport Type: " + sportType);
    }
}


class MultilevelInheritance1{
    public static void main(String[] args) {
        SportsShoes obj = new SportsShoes("Nike", 9.0, "Black", "Running");
        obj.getFootwear();
        obj.getShoes();
        obj.getSportsShoes();
    }
}

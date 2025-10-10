class Country {
    String name;
    String capital;
    String language;
    String pm;
    double area;
    long population;
    char currency;

    Country(String name, String capital, String language, String pm, double area, long population, char currency) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.pm = pm;
        this.area = area;
        this.population = population;
        this.currency = currency;
    }

    public void getCountry() {
        System.out.println("\nCountry Info");
        System.out.println("Name : " + name);
        System.out.println("Capital : " + capital);
        System.out.println("Language : " + language);
        System.out.println("Prime Minister : " + pm);
        System.out.println("Area : " + area);
        System.out.println("Population : " + population);
        System.out.println("Currency : " + currency);
    }
}

class State extends Country {
    String stateName;
    String stateCapital;
    String cm;
    String stateLanguage;
    int districts;
    long statePopulation;
    double stateArea;

    State(String name, String capital, String language, String pm, double area, long population, char currency,
          String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation, double stateArea) {

        super(name, capital, language, pm, area, population, currency);
        this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.cm = cm;
        this.stateLanguage = stateLanguage;
        this.districts = districts;
        this.statePopulation = statePopulation;
        this.stateArea = stateArea;
    }

    public void getState() {
        System.out.println("\nState Info");
        System.out.println("State Name : " + stateName);
        System.out.println("State Capital : " + stateCapital);
        System.out.println("Chief Minister : " + cm);
        System.out.println("State Language : " + stateLanguage);
        System.out.println("No of Districts : " + districts);
        System.out.println("Population : " + statePopulation);
        System.out.println("State Area : " + stateArea);
    }
}

class District extends State {
    String districtName;
    String mc;
    long districtPopulation;
    double districtArea;
    String mp;

    District(String name, String capital, String language, String pm, double area, long population, char currency,
             String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation, double stateArea,
             String districtName, String mc, long districtPopulation, double districtArea, String mp) {

        super(name, capital, language, pm, area, population, currency,
              stateName, stateCapital, cm, stateLanguage, districts, statePopulation, stateArea);
        this.districtName = districtName;
        this.mc = mc;
        this.districtPopulation = districtPopulation;
        this.districtArea = districtArea;
        this.mp = mp;
    }

    public void getDistrict() {
        System.out.println("\nDistrict Info");
        System.out.println("District Name : " + districtName);
        System.out.println("Municipal Commissioner : " + mc);
        System.out.println("District Population : " + districtPopulation);
        System.out.println("District Area : " + districtArea);
        System.out.println("District MP : " + mp);
    }
}

class Taluka extends District {
    String talukaName;
    long talukaPopulation;
    int pincode;

    Taluka(String name, String capital, String language, String pm, double area, long population, char currency,
           String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation, double stateArea,
           String districtName, String mc, long districtPopulation, double districtArea, String mp,
           String talukaName, long talukaPopulation, int pincode) {

        super(name, capital, language, pm, area, population, currency,
              stateName, stateCapital, cm, stateLanguage, districts, statePopulation, stateArea,
              districtName, mc, districtPopulation, districtArea, mp);
        this.talukaName = talukaName;
        this.talukaPopulation = talukaPopulation;
        this.pincode = pincode;
    }

    public void getTaluka() {
        System.out.println("\nTaluka Info");
        System.out.println("Taluka Name : " + talukaName);
        System.out.println("Taluka Population : " + talukaPopulation);
        System.out.println("Pin Code : " + pincode);
    }
}

class Village extends Taluka {
    String villageName;
    int villagePopulation;

    Village(String name, String capital, String language, String pm, double area, long population, char currency,
            String stateName, String stateCapital, String cm, String stateLanguage, int districts, long statePopulation, double stateArea,
            String districtName, String mc, long districtPopulation, double districtArea, String mp,
            String talukaName, long talukaPopulation, int pincode,
            String villageName, int villagePopulation) {

        super(name, capital, language, pm, area, population, currency,
              stateName, stateCapital, cm, stateLanguage, districts, statePopulation, stateArea,
              districtName, mc, districtPopulation, districtArea, mp,
              talukaName, talukaPopulation, pincode);
        this.villageName = villageName;
        this.villagePopulation = villagePopulation;
    }

    public void getVillage() {
        System.out.println("\nVillage Info");
        System.out.println("Village Name : " + villageName);
        System.out.println("Village Population : " + villagePopulation);
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        Village obj = new Village("India", "Delhi", "Hindi", "Modi Ji", 570.34, 10000000, '₹',
                "Maharashtra", "Mumbai", "Shinde", "Marathi", 36, 10000000, 360.78,
                "Parbhani", "Dogesh", 100000, 100.39, "Nana",
                "Shinde Takli", 1000, 503,
                "Ambegaon", 5000);

        obj.getCountry();
        obj.getState();
        obj.getDistrict();
        obj.getTaluka();
        obj.getVillage();
    }
}

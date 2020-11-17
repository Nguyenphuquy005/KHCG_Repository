package Models;

public abstract class Services {
    private String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String nameServices ;
    private double areaUsed ;
        private double rentenCost ;
    private int maxPeople ;
    private String typeOfrent ;

    public Services() {
    }

    public Services(String id, String nameServices, double areaUsed, double rentenCost, int maxPeople, String typeOfrent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.rentenCost = rentenCost;
        this.maxPeople = maxPeople;
        this.typeOfrent = typeOfrent;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentenCost() {
        return rentenCost;
    }

    public void setRentenCost(double rentenCost) {
        this.rentenCost = rentenCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeOfrent() {
        return typeOfrent;
    }

    public void setTypeOfrent(String typeOfrent) {
        this.typeOfrent = typeOfrent;
    }

    public abstract String showInfor();



}

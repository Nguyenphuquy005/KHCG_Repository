package Models;

public class House extends Services {
    private String roomStard ;
    private String describeConvenien;
    private int numFloot ;

    public House() {
    }

    public House(String id, String nameServices, double areaUsed, double rentenCost, int maxPeople, String typeOfrent, String roomStard, String describeConvenien, int numFloot) {
        super(id, nameServices, areaUsed, rentenCost, maxPeople, typeOfrent);
        this.roomStard = roomStard;
        this.describeConvenien = describeConvenien;
        this.numFloot = numFloot;
    }

    public String getRoomStard() {
        return roomStard;
    }

    public void setRoomStard(String roomStard) {
        this.roomStard = roomStard;
    }

    public String getDescribeConvenien() {
        return describeConvenien;
    }

    public void setDescribeConvenien(String describeConvenien) {
        this.describeConvenien = describeConvenien;
    }

    public int getNumFloot() {
        return numFloot;
    }

    public void setNumFloot(int numFloot) {
        this.numFloot = numFloot;
    }
    @Override
    public String showInfor(){
        return "ID: " + super.getId() + '\n' +
                "Name Services: "  + super.getNameServices() + '\n'
                + "Area Used: " + super.getAreaUsed() + '\n' +
                "Rentent Cost: " + getRentenCost()
                + '\n' + "Max People; " + super.getMaxPeople()+ '\n' +
                "Style Of Rent: " + getTypeOfrent() + '\n' +
                "Stand Rooms:  " + this.roomStard + '\n'
                + " Describe Convrnien: " + this.describeConvenien + '\n' +
                "Number Floot: " + this.numFloot;
    }
}

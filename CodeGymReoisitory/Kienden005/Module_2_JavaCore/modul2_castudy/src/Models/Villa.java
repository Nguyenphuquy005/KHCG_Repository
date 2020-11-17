package Models;

public class Villa extends Services {

   private String roomStard ;
   private String describeConvenien;
   private double areaSwim ;
   private int numFloot ;

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

    public double getAreaSwim() {
        return areaSwim;
    }

    public void setAreaSwim(double areaSwim) {
        this.areaSwim = areaSwim;
    }

    public int getNumFloot() {
        return numFloot;
    }

    public void setNumFloot(int numFloot) {
        this.numFloot = numFloot;
    }
   public Villa(){

   }

    public Villa(String id, String nameServices, double areaUsed, double rentenCost, int maxPeople, String typeOfrent, String roomStard, String describeConvenien, double areaSwim, int numFloot) {
        super(id, nameServices, areaUsed, rentenCost, maxPeople, typeOfrent);
        this.roomStard = roomStard;
        this.describeConvenien = describeConvenien;
        this.areaSwim = areaSwim;
        this.numFloot = numFloot;
    }

    @Override
    public  String showInfor(){
       return  "ID: " + super.getId() + '\t' +
               "Name Services: "  + super.getNameServices() + '\t' + "Area Used: " + super.getAreaUsed() + '\t' + "Rentent Cost: " + getRentenCost()
               + '\t' + "Max People; " + super.getMaxPeople()+ '\t' + "Style Of Rent: " + getTypeOfrent() + '\t' + "Stand Rooms:  " + this.roomStard + '\t'
               + " Describe Convrnien: " + this.describeConvenien + '\t' + "Max Swim: " + this.areaSwim + '\t' + "Number Floot: " + this.numFloot;
   }



}

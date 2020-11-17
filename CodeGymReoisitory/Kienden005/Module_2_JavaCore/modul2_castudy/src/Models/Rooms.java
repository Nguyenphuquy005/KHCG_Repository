package Models;

public class Rooms extends  Services {
    private String freeCome;

    public Rooms() {
    }

    public Rooms(String id, String nameServices, double areaUsed, double rentenCost, int maxPeople, String typeOfrent, String freeCome) {
        super(id, nameServices, areaUsed, rentenCost, maxPeople, typeOfrent);
        this.freeCome = freeCome;
    }

    public String getFreeCome() {
        return freeCome;
    }

    public void setFreeCome(String freeCome) {
        this.freeCome = freeCome;
    }

    @Override
    public String showInfor() {
        return "ID: " + super.getId() + '\n' +
                "Name Services: " + super.getNameServices() + '\n' + "Area Used: " +
                super.getAreaUsed() + '\n' + "Rentent Cost: " + getRentenCost()
                + '\n' + "Max People; " + super.getMaxPeople() + '\n' + "Style Of Rent: "
                + getTypeOfrent() + '\n' + "Free Sevices Comes: " + this.freeCome;

    }
}

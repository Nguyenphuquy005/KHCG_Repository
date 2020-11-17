package Models;

public class Customer {
    private String idCustomer;
    private String fullName ;
    private String birthday;
    private String sex ;
    private String phoneNumber ;
    private String idCard ;
    private String email ;
    private String styleGuest;
  private String address;
  private Services userServices ;

    public Customer(String idCustomer, String fullName, String birthday, String sex, String phoneNumber, String idCard, String email, String styleGuest, String address, Services userServices) {
        this.idCustomer = idCustomer;
        this.fullName = fullName;
        this.birthday = birthday;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.idCard = idCard;
        this.email = email;
        this.styleGuest = styleGuest;
        this.address = address;
        this.userServices = userServices;
    }

    public Customer() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStyleGuest() {
        return styleGuest;
    }

    public void setStyleGuest(String styleGuest) {
        this.styleGuest = styleGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUserServices() {
        return userServices;
    }

    public void setUserServices(Services userServices) {
        this.userServices = userServices;
    }

    public  String ShowCustommer(){
        return "ID Custommer" + this.idCustomer + '\t' + "Full name: " + this.fullName + '\t' + "Brithday: " + this.birthday + '\t' + "Sex: " + this.sex
                +'\t' + "ID Card : " + this.idCard + '\t'+ "Phone Number" + this.phoneNumber+ "Email: " + this.email + '\t' + "Style Guest: "+
                this.styleGuest + '\t' + "Used Services: " ;
    }

    public int getYearBirthday() {
        String temp = birthday.substring(birthday.length()-4);
        return Integer.valueOf(temp);
    }
}

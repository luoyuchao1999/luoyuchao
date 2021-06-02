package housezu.House;

public class House {
    private int id;
    private String name;
    private String phone;
    private String adress;
    private int rent;
    private String state;

    public House(int id, String name, String phone, String adress, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id+"\t\t"+
                name+"\t\t"+
                phone+"\t\t"+
                adress+"\t\t"+
                rent+"\t\t"+
                state;
    }
}

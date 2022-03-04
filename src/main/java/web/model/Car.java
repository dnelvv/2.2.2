package web.model;

public class Car {
    private String model;
    private int date;
    private String country;

    public Car(String model, int date, String country) {
        this.model = model;
        this.country = country;
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

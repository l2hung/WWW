package iuh.fit.se.bai2.annotation_based_configuration.model;


import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city = "TP.HCM";
    private String state = "Gò Vấp";
    private String country = "Việt Nam";

    public Address() {
    }

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}

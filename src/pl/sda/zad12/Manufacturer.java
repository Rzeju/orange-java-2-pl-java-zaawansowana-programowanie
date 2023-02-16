package pl.sda.zad12;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private int establishedYear;
    private String country;

    public Manufacturer(String name, int establishedYear, String country) {
        this.name = name;
        this.establishedYear = establishedYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return establishedYear == that.establishedYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, establishedYear, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", establishedYear=" + establishedYear +
                ", country='" + country + '\'' +
                '}';
    }
}

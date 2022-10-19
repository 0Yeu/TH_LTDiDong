package category;

import java.util.List;

import hotel.Hotel;

public class Category {

    private String namecategory;
    private List<Hotel> hotels;

    public Category(String namecategory, List<Hotel> hotels) {
        this.namecategory = namecategory;
        this.hotels = hotels;
    }

    public String getNamecategory() {
        return namecategory;
    }

    public void setNamecategory(String namecategory) {
        this.namecategory = namecategory;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}

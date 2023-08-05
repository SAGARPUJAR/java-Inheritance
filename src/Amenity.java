public class Amenity extends Room {
    int amenityId;
    String amenityName;
    String amenityDescription;

    public int getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(int amenityId) {
        this.amenityId = amenityId;
    }

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public String getAmenityDescription() {
        return amenityDescription;
    }

    public void setAmenityDescription(String amenityDescription) {
        this.amenityDescription = amenityDescription;
    }
}

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

    @Override
    public String getRoomId() {
        return  roomId;
    }

    @Override
    public void setRoomId(String roomId) {
        this.roomId=roomId;
    }

    @Override
    public String getRoomName() {
        return roomName;
    }

    @Override
    public void setRoomName(String roomName) {
        this.roomName=roomName;
    }

    @Override
    public String getRoomType() {
        return roomType;
    }

    @Override
    public void setRoomType(String roomType) {
        this.roomType=roomType;
    }

    @Override
    public int getRoomCapacity() {
        return roomCapacity;
    }

    @Override
    public void setRoomCapacity(int roomCapacity) {
            this.roomCapacity=roomCapacity;
    }
}

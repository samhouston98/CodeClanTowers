public abstract class Room {
    private RoomType roomType;

    public Room(RoomType roomType){
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getCapacityFromEnum(){
        return this.roomType.getCapacity();
    }
}

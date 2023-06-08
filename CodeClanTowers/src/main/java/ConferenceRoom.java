public class ConferenceRoom extends Room{
    private String conferenceRoomName;
    private RoomType roomType;
    private int roomNumber;

    public ConferenceRoom(RoomType roomType, int roomNumber) {
        super(roomType);
    }

    public String getConferenceRoomName() {
        return conferenceRoomName;
    }


}

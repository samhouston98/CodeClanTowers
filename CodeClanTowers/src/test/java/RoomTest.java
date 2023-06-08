import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;
    RoomType roomType;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 1);
        conferenceRoom = new ConferenceRoom(RoomType.SMALLCONFERENCE, 10);

    }


    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType() );
    }

    @Test
    public void hasCapacityProperty(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }

    @Test public void hasConferenceRoomType(){
        assertEquals(RoomType.SMALLCONFERENCE, conferenceRoom.getRoomType());
    }

    @Test public void hasConferenceCapacity(){
        assertEquals(50,conferenceRoom.getCapacityFromEnum());
    }
}
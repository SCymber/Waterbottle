import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void startingVolume100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drink10(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }


    @Test
    public void emptyVolumeTo0(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillVolume100(){
        waterbottle.drink();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}

package lab3.exerciseone.unit_test;

import lab3.exerciseone.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by kevin on 4/18/16.
 */
public class addUnitTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public addUnitTest() {
        super(MainActivity.class);
    }

    public void testAdd() {
        mainActivity = getActivity();
        assertEquals(mainActivity.add(5,3), 8);
        //assertEquals(mainActivity.add(5,3), 7);
        //assertEquals(mainActivity.add(5,3), 9);
    }
}

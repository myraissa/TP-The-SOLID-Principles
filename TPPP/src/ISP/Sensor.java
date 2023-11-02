package ISP;

import java.util.Random;

public class Sensor {
	
	 public void register(ISensor sensor)
	    {
	        while (true) {
	            if (isPersonClose()) {
	                sensor.proximityCallback();
	                break;
	            }
	        }
	    }

	    private boolean isPersonClose()
	    {
	        return new Random().nextBoolean();
	    }

}

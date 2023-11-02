package ISP;

import java.util.TimerTask;

public class Timer {

	public void register(int timeOut, ITimer timer) {
		

        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                timer.timeOutCallback();
            }
        }, timeOut);
		// TODO Auto-generated method stub
		
	}

}

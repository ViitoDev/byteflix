package byteflix.services;

import byteflix.models.Title;

public class TimeCalculator {
    private int timer;

    public int getTimer() {
        return timer;
    }

    public void timerInclude(Title title){
        timer += title.getScreenTime();
    }
}

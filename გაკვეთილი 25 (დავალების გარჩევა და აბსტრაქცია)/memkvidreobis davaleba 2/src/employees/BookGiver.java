package employees;

import java.time.LocalTime;

public class BookGiver extends LibraryEmployee{
    private LocalTime startTime;
    private LocalTime endTime;

    public BookGiver(String firstName, String lastName, int id, LocalTime startTime, LocalTime endTime) {
        super(firstName, lastName, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}

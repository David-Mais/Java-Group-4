public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void printTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

// java program to calculate difference between two time periods

public class time21 {

  // global variable
  int seconds;
  int hours;
  int minutes;

  public time21(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public static void main(String[] args) {
    //create object of time
    time21 start = new time21(8, 12, 15);
    time21 stop = new time21(12, 34, 55);
    time21 dif;

    //call difference method
    dif = difference(start, stop);

    System.out.printf(
      "Time difference : %d : %d : %d  - ",
      start.hours,
      start.minutes,
      start.seconds
    );
    System.out.printf("%d : %d : %d = ", stop.hours, stop.minutes, stop.seconds);
    System.out.printf(
      "%d : %d : %d \n",
      dif.hours,
      dif.minutes,
      dif.seconds
    );
  }

  public static time21 difference(time21 start, time21 stop) {
    time21 dif = new time21(0, 0, 0);

    //if start second is grater, so convert minute of stop into second and add second to stop second

    if (start.seconds > stop.minutes) {
      --stop.minutes;
      stop.seconds += 60;
    }

    dif.seconds = stop.seconds - start.seconds;

    // if start minute is greater convert stop hour into minutes and add minutes into stop minutes

    if (start.minutes > stop.minutes) {
      --stop.hours;
      stop.minutes += 60;
    }

    dif.minutes = stop.minutes - start.minutes;
    dif.hours = stop.hours - start.hours;

    // return the difference time

    return (dif);
  }
}

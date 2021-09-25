public class SpeedConverter {
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        } else if (kilometerPerHour > 0) {
            return (long) Math.round(kilometerPerHour * (1 / 1.609));
        }
        return 0;
    }

    public static void printConversion(double kilometerPerHour) {
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        if(milesPerHour == -1){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
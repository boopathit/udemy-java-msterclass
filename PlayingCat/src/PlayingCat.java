public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && ((summer && temperature <= 45) || (!summer && temperature <= 35))) {
            return true;
        } else {
            return false;
        }
    }
}

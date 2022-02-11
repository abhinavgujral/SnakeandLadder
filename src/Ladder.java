public class Ladder {
  static   private int start;

    public static int getStart() {
        return start;
    }

    public static void setStart(int start) {
        Ladder.start = start;
    }

    public static int getEnd() {
        return end;
    }

    public static void setEnd(int end) {
        Ladder.end = end;
    }

    static private int end;
    public Ladder(int start, int end)
    {
        this.start= start;
        this.end=end;
    }

}

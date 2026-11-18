/**
 * Runs ReadingLog so you can see your own results.
 *
 * This file is NOT graded and you do not turn it in. Change it however you
 * like -- try your own names, goals and page counts.
 *
 * Run it with:  mvn -q compile exec:java
 */
public class ReadingLogRunner
{
    public static void main(String[] args)
    {
        ReadingLog maya = new ReadingLog("Maya", 300);
        ReadingLog leo = new ReadingLog("Leo", 150);

        // Part 2: the constructor and the accessors
        System.out.println("Part 2: " + maya.getName() + ", goal "
                           + maya.getGoal() + ", read " + maya.getPagesRead());

        // Part 3: logPages (the -5 should be ignored)
        maya.logPages(120);
        maya.logPages(-5);
        System.out.println("Part 3: Maya has read " + maya.getPagesRead()
                           + " (expect 120)");
        System.out.println("Part 3: Leo has read " + leo.getPagesRead()
                           + " (expect 0)");

        // Part 4: percentDone
        System.out.println("Part 4: Maya is " + maya.percentDone()
                           + "% done (expect 40)");

        // Part 5: pagesPerDay
        System.out.println("Part 5: 9 days left -> " + maya.pagesPerDay(9)
                           + " a day (expect 20)");
        System.out.println("Part 5: 7 days left -> " + maya.pagesPerDay(7)
                           + " a day (expect 26)");

        // Part 6: getReport
        leo.logPages(150);
        System.out.println("Part 6: " + maya.getReport());
        System.out.println("Part 6: " + leo.getReport());
    }
}

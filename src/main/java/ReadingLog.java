/**
 * AP CSA Lab 3.1-3.3 - Designing a Class
 *
 * This lab is different from the ones before it. Instead of separate static
 * methods, you will finish one whole class, ReadingLog. A ReadingLog is one
 * student's log for a class reading challenge. ReadingLogRunner.java makes
 * ReadingLog objects and calls their methods, the same way LunchDesk uses
 * LunchAccount in your Unit 3 notes (Appendix A).
 *
 * Do not rename anything, do not change the parameter lists, and do not
 * change the return types. The grader compiles against these exact
 * signatures.
 *
 * THE DESIGN (Topic 3.1). Read this before you write any code.
 *
 *   Attributes -- what each ReadingLog knows:
 *
 *     name        the student's name, such as "Maya"           String
 *     goal        how many pages the student plans to read     int
 *     pagesRead   how many pages the student has read so far   int
 *
 *   Behaviors -- what each ReadingLog does:
 *
 *     ReadingLog(student, pageGoal)   make a new log with 0 pages read
 *     getName, getGoal, getPagesRead  give the value of each attribute
 *     logPages(pages)                 add pages the student just read
 *     percentDone()                   how far along, as a whole percent
 *     pagesPerDay(days)               pages a day needed to finish in time
 *     getReport()                     one line describing the log
 *     goalMet()                       a private helper for getReport
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, run main in ReadingLogRunner.java.
 */
public class ReadingLog
{
    // ---------------------------------------------------------------
    // PART 1: private instance variables
    //
    // Declare one instance variable for each attribute in the design:
    // name (a String), goal (an int) and pagesRead (an int).
    //
    //   - Make every one of them private. That is data encapsulation: only
    //     code inside ReadingLog can see or change them, and other classes
    //     must go through the public methods.
    //   - Do NOT make them static. A static variable is a class variable,
    //     and every ReadingLog would share one copy. Each student needs
    //     their own name and their own pagesRead, so each object needs its
    //     own copy -- an instance variable.
    //   - Declare them here, inside the class but outside every method.
    //
    // LunchAccount declares its instance variables the same way
    // (LunchAccount lines 13-17):
    //
    //     // Instance variables: each account has its own copy
    //     private String name;
    //     private int number;
    //     private int balance;
    //     private SchoolDate opened;
    //
    // Part 1 is also checked at the bottom of this file: goalMet must stay
    // private.
    // ---------------------------------------------------------------

    // TODO Part 1: declare the three private instance variables here


    // ---------------------------------------------------------------
    // PART 2: the constructor and the accessor methods
    //
    // The constructor runs when another class writes
    // new ReadingLog("Maya", 300). Give EVERY instance variable its
    // starting value: name comes from student, goal comes from pageGoal,
    // and pagesRead starts at 0.
    //
    // Then finish the three get methods. Each one returns the value of one
    // instance variable.
    //
    // LunchAccount does the same (LunchAccount lines 19-26 and 28-36):
    //
    //     public LunchAccount(String name, SchoolDate opened)
    //     {
    //         ...
    //         balance = 0;
    //     }
    //
    //     public int getBalance()
    //     {
    //         return balance;
    //     }
    //
    // Example: ReadingLog log = new ReadingLog("Maya", 300);
    //          log.getName()       is "Maya"
    //          log.getGoal()       is 300
    //          log.getPagesRead()  is 0
    //
    // Careful: write  name = student;  not  String name = student;
    // Putting a type in front makes a brand-new local variable that
    // disappears when the constructor ends, and the instance variable is
    // never set.
    // ---------------------------------------------------------------
    public ReadingLog(String student, int pageGoal)
    {
        // TODO Part 2: give every instance variable its starting value
    }

    public String getName()
    {
        // TODO Part 2: return the student's name
        return "";
    }

    public int getGoal()
    {
        // TODO Part 2: return the goal
        return 0;
    }

    public int getPagesRead()
    {
        // TODO Part 2: return how many pages have been read
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 3: logPages -- a reliable mutator (Topic 3.2)
    //
    // Add pages to pagesRead. A reliable program handles input that is too
    // small as well as input that is just right: if pages is 0 or negative,
    // ignore it and leave pagesRead alone. (You cannot read -5 pages.)
    //
    // LunchAccount's deposit ignores bad amounts the same way
    // (LunchAccount lines 44-52):
    //
    //     // Adds money to the account. An amount that is not positive is ignored.
    //     public void deposit(int cents)
    //     {
    //         if (cents <= 0)
    //         {
    //             return;
    //         }
    //         balance += cents;
    //     }
    //
    // Example: a new log, then logPages(20) and logPages(30):  pagesRead is 50
    // Example: a new log, then logPages(20) and logPages(-5):  pagesRead is 20
    //
    // Careful: each ReadingLog has its own pagesRead. Logging pages for Maya
    // must not change Leo's log.
    // ---------------------------------------------------------------
    public void logPages(int pages)
    {
        // TODO Part 3: add pages to pagesRead, but only if pages is positive
    }

    // ---------------------------------------------------------------
    // PART 4: percentDone
    //
    // Return how much of the goal has been read, as a whole-number percent.
    // Drop any fraction (99.67% is 99). Never return more than 100: a
    // student who reads past the goal is 100% done.
    //
    // Precondition: goal is greater than 0.
    //
    // Example: goal 300, pagesRead 120:  percentDone() is 40
    // Example: goal 300, pagesRead 299:  percentDone() is 99
    // Example: goal 300, pagesRead 450:  percentDone() is 100
    //
    // Careful: pagesRead / goal * 100 is 0 for 120 of 300. The division
    // happens first, and int division drops the fraction: 120 / 300 is 0
    // (Topic 1.3). Multiply by 100 before you divide.
    // ---------------------------------------------------------------
    public int percentDone()
    {
        // TODO Part 4: return the percent, at most 100
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 5: pagesPerDay -- a parameter makes a method general
    //
    // The student has `days` days left. Return how many pages a day they
    // must read to reach the goal in time. If the pages left do not divide
    // evenly, round UP: reading 25 pages a day for 7 days falls short of
    // 180 pages, so the answer is 26. If the goal is already met, return 0.
    //
    // Because days is a parameter, one method answers the question for any
    // number of days (Topic 3.1) instead of one method for each.
    //
    // Precondition: days is greater than 0.
    //
    // Example: goal 300, pagesRead 120, pagesPerDay(9):  20   (180 / 9)
    // Example: goal 300, pagesRead 120, pagesPerDay(7):  26   (not 25)
    // Example: goal 300, pagesRead 450, pagesPerDay(3):  0    (not -50)
    //
    // Hint: int division drops the remainder. Use % (Topic 1.3) to tell
    // whether anything was dropped.
    // ---------------------------------------------------------------
    public int pagesPerDay(int days)
    {
        // TODO Part 5: return the pages per day, rounded up, or 0 if met
        return 0;
    }

    // ---------------------------------------------------------------
    // PART 6: getReport -- break a big behavior into smaller methods
    //
    // Return one line describing the log, built from name, pagesRead, goal
    // and percentDone(). If the goal is met, add " GOAL MET" to the end.
    //
    //     "Maya: 120 of 300 pages (40%)"
    //     "Ana: 200 of 200 pages (100%) GOAL MET"
    //
    // Do not repeat the percent math here: call percentDone(). And use the
    // private helper goalMet() below to decide whether to add " GOAL MET".
    // That is method decomposition (Topic 3.1).
    //
    // LunchAccount's getSummary uses its private helper isLow the same way
    // (LunchAccount lines 86-100):
    //
    //     if (isLow())
    //     {
    //         text += " LOW";
    //     }
    //
    // Careful: reading exactly the goal counts. 200 of 200 pages is GOAL MET.
    // ---------------------------------------------------------------
    public String getReport()
    {
        // TODO Part 6: build the report, calling percentDone() and goalMet()
        return "";
    }

    // Returns true if pagesRead has reached the goal.
    // Leave this method private: only ReadingLog's own methods need it,
    // so no other class should be able to call it (Topic 3.3).
    private boolean goalMet()
    {
        // TODO Part 6: return whether the goal has been met
        return false;
    }
}

# Lab 3.1-3.3 — Designing a Class

In this lab you finish one whole class, `ReadingLog`: one student's log for a
class reading challenge. It is built the way `LunchAccount` is built in your
Unit 3 notes. The design and the instructions for each part are in the
comments in `ReadingLog.java`, so read them there — this page is just the map.

Plan on 30 to 45 minutes.

## What you will practice

- Turning a design (attributes and behaviors) into a class.
- Declaring `private` instance variables, so each object has its own copy.
- Writing a constructor that gives every instance variable a starting value.
- Writing a method that handles bad input reliably.
- Breaking a big behavior into smaller methods, including a `private` helper.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/ReadingLog.java`. That is the only file you turn in.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run `ReadingLogRunner`, which makes two logs and prints what your methods
return:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Code | What it is about |
| --- | --- | --- |
| 1 | the instance variables | `private`, and one copy per object |
| 2 | `ReadingLog(String, int)` and the get methods | setting and reading state |
| 3 | `logPages(int)` | a mutator that ignores bad input |
| 4 | `percentDone()` | int division in the right order |
| 5 | `pagesPerDay(int)` | a parameter makes a method general |
| 6 | `getReport()` and `goalMet()` | calling your own methods |

## Before you turn it in

- [ ] Every placeholder line under a `TODO` has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Every instance variable is `private`, and none of them is `static`.
- [ ] Logging pages for Maya does not change Leo's log.
- [ ] `logPages(-5)` changes nothing.
- [ ] `percentDone()` is 40 for 120 of 300 pages, not 0.
- [ ] 200 of 200 pages reports `GOAL MET`.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.

`ReadingLogRunner.java` is not graded, so you may change it however you like.

## Optional extension, not graded

`percentDone()` divides by `goal`. What happens if someone makes
`new ReadingLog("Zoe", 0)`? Change the constructor so a goal that is not
positive becomes 1 instead, and test it in `ReadingLogRunner`. Then think about
Topic 3.2: who could be hurt if a real reading-challenge program crashed, or
showed a student the wrong progress, and how would testing with a variety of
inputs have caught it?

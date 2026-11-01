**Grade Tracker**

A Java command-line tool for keeping track of your grades in one place. You enter a course's syllabus weights and grade cutoffs along with your scores, and it calculates your current grade and the average you need on the remaining work to reach a target grade.

**Project goal**

Unites all the grades in one place, so you can see your current grade in each course and know what you need on the next assignment or exam to reach the grade I want, early enough to do something about it.

**MVP scope (version 1.0)**

Add a course with category weights (homework, exams, etc.) and grade cutoffs
Enter scores for each assignment
Calculate the current weighted grade and letter grade
"What do I need" calculator: the average needed on the remaining work to reach a target grade
Save and load courses from a file so data persists between runs


**Future plans (V2.0+)**
Grade projection with best-case and worst-case final grades
Edit or delete a score or course
Handle special rules like "drop the lowest homework"
Overview of all courses together, with a GPA estimate

**Tech stack**
Language: Java (command-line program)
Libraries: none for the MVP, only the Java standard library (Scanner, ArrayList, java.io)
Data storage: a plain text file (courses.txt) in a simple comma-separated format
Data sources: none, since all data is entered manually
Version control: Git and GitHub

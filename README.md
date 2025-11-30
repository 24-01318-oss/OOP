📘 Fake News Filter System
1. 📌 Project Title
Fake News Filter System (Java OOP Console Application)

2. 📖 Description / Overview
The Fake News Filter System is a simple Java-based console program designed to help users analyze articles and identify possible signs of misinformation.
 The system classifies submitted articles into Clickbait, Misleading, or Satire, and provides a basic analysis based on predefined characteristics.
This project solves the problem of quickly detecting unreliable content using keyword analysis and OOP-driven structures.
 Users can submit articles, view stored content, and analyze specific articles by ID.

3. 🧱 OOP Concepts Applied
Encapsulation
All attributes (title, author, body, id) are private.
They are accessed using getters and setters.
Example:
 private String title;
public String getTitle() { return title; }


Inheritance
Article (superclass)
Subclasses:
ClickBaitArticle
MisleadingArticle
SatireArticle
Each inherits fields/methods from Article.

Polymorphism (Method Overriding)
Each subclass overrides the analyze() method:
@Override
public String analyze() {
    return "Clickbait article analysis...";
}

This allows different behaviors for each article type.

Abstraction
Article is defined as an abstract class.
It contains:
Common attributes
An abstract method analyze()
Subclasses must implement their own version of analyze().

4. 🏗 Program Structure   
Main Classes and Their Roles

1. Article (Abstract Class)
Base blueprint for all articles.
Holds shared data: id, title, author, body.
Requires subclasses to implement analyze().

2. Subclasses (ClickBaitArticle, MisleadingArticle, SatireArticle)
Each defines its own analysis logic.

3. ArticleManager
Stores all articles using an array.
Provides methods:
addArticle()
getArticleById()
viewAllArticles()

4. FakeNewsFilter
Contains helper keyword-detection logic.

5. MainSystem
Runs the program.
Handles:
Menu display
User input
Article submission
Article analysis

5. ▶️ How to Run the Program
Step 1 — Open Terminal in Your Project Folder
Example:
cd "C:\Users\Alexx\OneDrive\Desktop\OOP FINAL PROJECT"

Step 2 — Compile All Java Files
javac *.java

Step 3 — Run the Program
java MainSystem

6. 🖥 Sample Output
This output is exactly based on the program run you provided:
=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 1
Choose type: 1=Clickbait, 2=Misleading, 3=Satire
1
Title: The Shocking Story
Author: Cassandra, Patrick, Alex, Yuan
Body: Shocking Discovery of Whales
Article submitted with ID: 1

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 3
Enter article ID: 1
Content: Shocking Discovery of Whales
Analysis: Clickbait Article: The headline exaggerates or misleads to attract clicks.

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option:

7. 👤 Authors and Acknowledgements
Author:
Ma. Cassandra D. Matuloy
Alexandra Xyrielle S. Bautista
Yuan Andrei C. Ramos
Patrick M. Javier

 BSIT — OOP Final Project 
 
Acknowledgements:
Instructor (for project requirements and guidelines)
w3schools (for guidance in debugging and documentation)

8. 📌 Other Sections
Future Enhancements
Add database storage instead of arrays.
Implement keyword-weight system for more accurate detection.
Add GUI using JavaFX or Swing.
Add export-to-PDF reports.

References
Java Documentation: https://docs.oracle.com
OOP Tutorials (Oracle Java)
Misinformation detection research articles

# OOP

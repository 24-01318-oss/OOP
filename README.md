Fake News Detection System (Console-Based System)

 Description / Overview
The Fake News Detection System is a console-based Java system that analyzes user-submitted articles and automatically identifies whether the content is Clickbait, Misleading, or Satire.
 The system examines the article’s body text using simple keyword and pattern detection to determine the type of suspicious content.
Its purpose is to give users an educational tool that demonstrates how different forms of misleading information can be detected through OOP concepts.

OOP Concepts Applied
   Abstraction
The system hides analysis logic behind the FakeNewsFilter class.
 Users only input text; the internal rules are abstracted away.
   Inheritance
The system has a parent class Article, and three subclasses:
ClickbaitArticle
MisleadingArticle
SatireArticle


Each extends the base article structure.
Polymorphism
Articles are stored using the parent reference:
ArrayList<Article> articles;

When analyzed, the correct overridden method is automatically executed depending on whether the article is clickbait, misleading, or satire.
Encapsulation
Each class uses private fields (title, author, body).
 These can only be accessed through public getters and setters, protecting the data.
4. Program Structure
Text-Based Class Diagram
+----------------------+
|       Content        |
| - title              |
| - author             |
| - body               |
+----------------------+
            |
            v
+----------------------+
|       Article        |
| + analyze()          |
+----------------------+
            |
  ---------------------------------
  |               |               |
  v               v               v
+----------------+ +-------------------+ +------------------+
| ClickbaitArticle| | MisleadingArticle| | SatireArticle   |
+----------------+ +-------------------+ +------------------+

+----------------------+
|   FakeNewsFilter     |
| - analyzeText()      |
| - keyword detection  |
+----------------------+

+----------------------+
|   ArticleManager     |
| - store articles     |
| - manage IDs         |
| - display menu       |
+----------------------+

+----------------------+
|      MainSystem      |
| - program entry       |
| - user interaction    |
+----------------------+

How to Run the Program
Step 1: Open your project folder in terminal
cd "C:\Users\Alexx\OneDrive\Desktop\OOP FINAL PROJECT"

Step 2: Compile
javac *.java

Step 3: Run
java MainSystem

Sample Output
=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 1
Title: The Tale of Tales
Author: Alex
Body: Shocking tale of tales
Article submitted with ID: 1

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 1
Title: The Accussed
Author: Cassandra
Body: Experts claim that they are wrongly accussed
Article submitted with ID: 2

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 1
Title: The Joker
Author: Yuan
Body: The irony of the joker.
Article submitted with ID: 3

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 2
ID: 1
Title: The Tale of Tales
Author: Alex

ID: 2
Title: The Accussed
Author: Cassandra

ID: 3
Title: The Joker
Author: Yuan

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 3
Enter article ID: 1

Content: Shocking tale of tales
Analysis: Clickbait Article: The headline or content exaggerates events to attract attention.

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 3
Enter article ID: 2

Content: Experts claim that they are wrongly accussed
Analysis: Misleading Article: The content uses vague, deceptive, or partially false information.

=== Fake News Filter System ===
1. Submit article
2. View all articles
3. Analyze article by ID
4. Exit
Choose option: 3
Enter article ID: 3

Content: The irony of the joker.
Analysis: Satire Article: Uses humor, exaggeration, or irony for entertainment.


7. Author and Acknowledgement
Author:
Matuloy, Ma. Cassandra D.
Bautista, Alexandra Xyrielle S.
Javier, Patrick M.
Ramos, Yuan Andrei C.

 BSIT Object-Oriented Programming Final Project
Acknowledgements:
Groupmates for ideas in designing article examples


Instructor for guidance
 Future Enhancements
Add more advanced keyword analysis
Use machine learning for accuracy
Add database storage
Improve keyword libraries
Add user accounts and logging


References
Oracle Java Documentation
Articles on clickbait, satire, and misleading news indicators
OOP textbooks and learning modules


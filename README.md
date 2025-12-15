Virtual Pet Project
1. Project Title
Virtual Pet Project

2. Project Description
The Virtual Pet Project is an interactive Java program designed for young children who enjoy talking animals. Users can choose from several virtual pets including a Dragon, T-Rex, Talking Tom, Talking Ben, and Talking Angela. Each pet can answer yes/no questions, repeat what the user says, and some pets (such as the Dragon and T-Rex) can perform special destructive actions.
The goal of this program is to create a simple, engaging digital pet experience using object-oriented programming principles.

3. Features
Multiple pet types:
Dragon
T-Rex
Talking Tom
Talking Ben
Talking Angela

Pets can respond yes or no to user questions
Pets can repeat user input
Dragon and T-Rex have special destruction actions
Kid-friendly design
Built using inheritance and polymorphism

4. How the Code Works
Main Classes
Pet (Superclass)
Contains shared pet behaviors such as yes/no responses and repeating text.

Dragon, TRex, TalkingTom, TalkingBen, TalkingAngela (Subclasses)
Extend the Pet class and override or add unique behaviors. Dragon and TRex include destructive actions through overridden methods.

Main Class
Handles user input, displays menus, and executes user-selected actions.


How Classes Interact
The program uses inheritance so all pets share common behavior.

When the user selects a pet, an object of that subclass is created.

Polymorphism allows the program to call methods on the pet regardless of its specific type.

Special actions (Dragon/TRex) come from overridden subclass methods.


Data Storage
Arrays or simple variables store responses and pet options.

Objects store individual pet behavior and state.

UML Diagram



<img width="1001" height="503" alt="Screenshot 2025-12-15 105109" src="https://github.com/user-attachments/assets/b175283d-c34c-43a2-83c1-c3e89471d7bb" />



5. How to Run the Program
Open the project folder in your Java IDE (IntelliJ, BlueJ, Eclipse, VS Code, etc.).


Compile all .java files.


Run the Main.java file.


Follow the console instructions to:


Select a pet


Ask a yes/no question


Say something for the pet to repeat


Use special actions (Dragon/T-Rex only)


Sample Input
Select a pet: Dragon
Ask a question: Are you hungry?
Say something: Hello!
Use special action (yes/no): yes

6. Development Process
This project was created for AP CSA.
 The team used brainstorming and planning worksheets to design the features, behaviors, and interactions.
Challenges
Designing a class hierarchy using inheritance


Sharing behavior between all pets without repeating code


Adding unique features to specific pets


Future Improvements
Add animations or graphics


Add more pet types





7. Author Info
Team Members
Alvin — Project Manager


Azarel — Programming Lead


Jerry — Quality Assurance Tester


Akwaeno — Technical Writer


What We Learned
How to use inheritance and polymorphism


How to structure a multi-class Java project


How to collaborate and divide roles




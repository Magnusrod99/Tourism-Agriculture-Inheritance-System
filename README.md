# Tourism and Agriculture Inheritance System

**Author:** Magnus Rodrigues  
**Roll Number:** 2628

## Project Overview

This Java application demonstrates the five types of inheritance using real-life examples from the Tourism and Agriculture domains.

The application provides a menu-driven interface that allows users to select and execute each inheritance demonstration.

## Inheritance Concepts Implemented

1. **Single Inheritance:** HotelService inherits from TourismService.
2. **Multiple Inheritance:** SmartFarm implements Irrigation and FertilizerManagement interfaces.
3. **Multilevel Inheritance:** AgricultureService → Crop → OrganicCrop.
4. **Hierarchical Inheritance:** HotelService and TravelAgency inherit from TourismService.
5. **Hybrid Inheritance:** AgroTourismFarm extends Crop and implements multiple interfaces.

## Technologies Used

- Java
- Object-Oriented Programming
- Java Interfaces
- JavaDoc
- Visual Studio Code

## Project Structure

```text
Tourism-Agriculture-Inheritance-System/
├── src/
│   ├── agriculture/
│   ├── interfaces/
│   ├── tourism/
│   └── main/
├── docs/
├── screenshots/
└── README.md
```

## How to Compile

Open the terminal in the project directory and execute:

```powershell
javac -d out src\interfaces\*.java src\tourism\*.java src\agriculture\*.java src\main\*.java
```

## How to Run

```powershell
java -cp out main.Main
```

## JavaDoc Generation

Generate the JavaDoc documentation using:

```powershell
javadoc -d docs -sourcepath src -subpackages tourism:agriculture:interfaces:main
```

Open `docs/index.html` in a web browser to view the generated documentation.

## Screenshots

The `screenshots` directory contains the execution output for all five inheritance demonstrations and the main menu.

## Conclusion

This project demonstrates the practical implementation of all five inheritance types in Java using Tourism and Agriculture examples. It also demonstrates the use of interfaces, constructors, method overriding, and menu-driven programming.
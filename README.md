#  Student Management API

Eine einfache REST-API zur Verwaltung von Studentendaten, entwickelt mit Java und Spring Boot.  
Dieses Projekt dient als Übung für die Entwicklung von Web-APIs, Dependency Injection und der Nutzung von Spring Boot Annotations.

##  Funktionen (Features)
- **Alle Studenten abrufen:** Gibt eine Liste aller Studenten als JSON zurück.

## ️ Verwendete Technologien (Technologies)
- **Java 25**
- **Spring Boot**
- **Gradle** 

##  Ausführen des Projekts (How to Run)
1. Stelle sicher, dass Java und Gradle auf deinem System installiert sind.
2. Öffne das Projekt in IntelliJ IDEA.
3. Führe die `StudentManagementApiApplication.java`-Klasse aus.
4. Die API ist dann unter `http://localhost:8080` erreichbar.

##  API-Endpunkte (API Endpoints)
- **GET** `/api/students` : Gibt eine Liste aller Studenten zurück.

*Beispiel-Response:*
[
  {"id": 1, "name": "Max Mustermann", "major": "Mathe"},
  {"id": 2, "name": "Erika Musterfrau", "major": "Physik"}
]

## Auorin (Author)
Nada Barakeh

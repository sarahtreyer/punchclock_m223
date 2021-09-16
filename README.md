# M223: Punchclock
Es ist ein Zeiterfassungssystem mit dem mann einen Account erstellen kann um seine Arbeitszeit zu erfassen.
Man kann jeden Zeiteintrag mit eine Stimmung und einer Katergorie versehen.

Wie startet man die Applikation?
- Laden Sie das Projekt herunter.
- Öffnen Sie das Terminal und wechseln sie in den Folder:
    cd downloads/m223-Punchclock-Master
- Starten Sie die Applikation mit dem Command:
     ./gradlew bootRun
- Gehen Sie im Browser auf die URL:
    http://localhost:8081/index.html

    

Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank: http://localhost:8081/h2-console
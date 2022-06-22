# Sololearn_Shapes

Sololearn_Shapes simple exercises

You are working on a graphical app, which includes multiple different shapes. The given code declares a base Shape class
with an abstract area() method and a width attribute. You need to create two Shape subclasses, Square and Circle, which
initialize the width attribute using their constructor, and define their area() methods. The area() for the Square class
should output the area of the square (the square of the width), while for the Circle, it should output the area of the
given circle (PI*width*width). The code in main creates two objects with the given user input and calls the area()
methods.

Sample Input:
5 2

Sample Output:
25 12.566370614359172

The area of the square is 5*5=25, while the area of the circle is PI*2*2=12.566370614359172

HINT:
Use the Math.PI constant for the area calculation of the cicle.


![grafik](https://user-images.githubusercontent.com/105013150/175044939-19c97e5c-bb83-4727-9121-8bbaec54ad1e.png)

Dokumentation Abschlussprüfung

Software Lifecycle Management 
BWI-BB-2-SS2022

wi21b055
Wolfgang Matyus 
 

1.	Git/Github
I.	Zuerst wird ein neues Repository in Github erstellt. Dabei wird
i.	ein README File 
ii.	ein .gitignore für Maven
iii.	und eine MIT License hinzugefügt.
 ![grafik](https://user-images.githubusercontent.com/105013150/175045557-36090f4c-490d-47ee-802b-de026bf19db4.png)


II.	Weiters wird ein „develop“ branch hinzugefügt als Zwischenspeicher zum Schutz der main branch.
 

 

2.	User Stories
I.	Als nächstes wird ein neues Projekt mit dem Basic Kanban Template erstellt.
 

II.	Die bestehenden Notes aus dem Template werden entfernt und die ersten User Stories als Notes erfasst.
 
III.	Die Notes werden dann in Issues umgewandelt und zugewiesen und wandern für die Implementierung zur Spalte „In progress“ und werden dadurch in Bearbeitung genommen.
  

IV.	Das Issue wird einem Bearbeiter assigned und als feature/ einer neuen feature branch zugewiesen.
 




V.	Die erstellte feature/ branch muss nun gefetched werden und nach einem Checkout kann innerhalb der feature/ branch mit der Erstellung des Codes begonnen werden.


VI.	Wurde der Code fertiggestellt, commited und gepushed Kann das feature in Github über den Pull Request auf eventuelle Fehler untersucht werden und in den develop branch gemerged werden. Das Issue ist somit erledigt und kann auf Done verschoben und geclosed werden.  




 

3.	Impelmentierung
I.	Ein neues IntelliJ Java Projekt mit Spring Boot wird erstellt

i.	Name und Lokales Verzeichnis werden vergeben
 

II.	Ein Clone des Online Repository wird auf einem lokalen Repository erstellt
 

III.	Die Files des Repositorys werden durch die Files der neuen Java Verion ersetzt.
 

IV.	Maven build scripts werden geladen und die neuen Files werden zum Git Repo hinzugefügt. Neu erstellte Files immer adden.
 

V.	Dependencies für Maven SpringBootApplication werden erstellt.
 

VI.	Maven changes werden geladen
 

VII.	Versuch Spningboot zu starten 
 

VIII.	Als ersten Funktionstest erstellt man einen @RestController und definiert die erste Route um zu sehen ob die Verbindung funktioniert.
i.	Dazu wird das entsprechende feature/ verwendet. Um den Aktuellen Stand im feature/ zu erweiter wird zuerst der main branch in den develop gemerged und dann der develop in den feature/.
ii.	 

 
iii.	Wenn Springboot nicht läuft 
 
iv.	Sobald Springboot läuft aber keine Route aufgerufen wird erscheint der Error status = 404
 
v.	Mit der Testimplementierung wird der return Wert ausgegeben
 

IX.	Jetzt können wir in den develop branch wechseln und das feature/ in den develop mergen.
i.	Checkout
 
merge:
 

X.	Das Issue kann geclosed und der feature/ branch deleted werden
 
XI.	Abhängig von den requirements in den User Story’s kann jetzt die Strukur der notwendigen Klassen implementiert werden. Bevor die Methoden Implementiert werden sollten allerdings vorher die Tests implementiert werden. 
4.	Pipeline
I.	Wokflows unter Actions werden erstellt
 

II.	Es wird ein Workflow für Develop und einer für Main erstellt
i.	Develop: hier muss die branch und die JDK und Java-version angepasst werden:
 

ii.	Main: hier muss JDK und Java Verion angepasst werden und der download für den Build des Artifacts wird hier hinterlegt
 
III.	.yml file unter Ations Wokflow erstellen für “main”
- run: mkdir download && cp target/*.jar download
- name: Upload a Build Artifact
      uses: actions/upload-artifact@v2
      with:
        name: Build
        path: download
IV.	Unter Code sind dann die Workflows als .yml Files ersichtlich
 
 
5.	Testing
I.	Bevor ich mit der tatsächlichen Umsetzung bzw Implementierung der Methoden starte werden auf Basis der Anforderungen JUnit Tests erstellt. Damit wird der Ansatz des „Test Driven Development“ verfolgt.

 

Square square = new Square();

@Test
void testArea() {
    // arrange
    double width = 2;
    // act
    double result = this.square.area(width);
    // assert
    assertEquals(4, result);
}

 

II.	Ich erstelle für die JUnit Tests wieder entsprechende Userstorys und durchlaufe das den Kanban Prozess. Angelehnt and die Tests werden dann die notwendigen Methoden implementiert.


 

6.	Artefact
I.	.yml file unter Ations Wokflow erstellen für “main”
- run: mkdir download && cp target/*.jar download
- name: Upload a Build Artifact
      uses: actions/upload-artifact@v2
      with:
        name: Build
        path: download

II.	Sobald der Code vom develop branch in den main branch gemerged wird, wird aufgrund unseres Eintrags ein Build als .jar Datei erstellt, welche durch klick in den den Download Ordner geladen werden kann.

 
III.	Durch Klick auf das Arteifact wird der Build in den Download Ordner geladen.
 



 

7.	Redme
I.	Aufgabentext in Readme einfügen
 



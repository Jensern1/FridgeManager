[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.stud.ntnu.no/#https://gitlab.stud.idi.ntnu.no/it1901/groups-2022/gr2239/gr2239)

Gruppe 39 ITP - FridgeManager
=

<u><font size="3"> **Beskrivelse av prosjektets strktur**</font></u>   

Dette prosjektet inneholder Java-kode og tester til disse. Det er delt opp i to separate moduler: "core" og "fxui".   
<u>**Core:**</u>  
"core" inneholder "Model"-delen av prosjektet, nemlig kjernelogikken. Dette inkluderer klassene "Food" og "FridgeManager". Disse brukes i Controlleren, og fungerer som grunnmuren i programmet. Disse ligger altså i mappen "fridge_manager/core/src/main/java/fridge_manager/core. Tester til disse to klassene ligger under "fridge_manager/core/src/test". "core" inneholder også klassene som bruker JSON til skriving og lesing fra fil. Disse ligger under ""fridge_manager/core/src/main/java/fridge_manager/json".  
<u>**FXUI:**</u>  
"fxui"-modulen inneholder klassene som styrer appens brukergrensesnitt, nemlig "FridgeController" og "FridgeApp". Disse ligger under "fridge_manager/fxui/src/main/java/fridge_manager/ui. "fxui" inneholder også FXML-filen "FridgeApp.fxml" med appens design. Denne ligger under "fridge_manager/fxui/src/main/resources". 

Bilder som er blitt brukt ligger under "fridge_manager/pictures". 

<u><font size="3"> **Beskrivelse av bygging og kjøring**</font></u>  

FridgeManager bygges og kjøres ved hjelp av Maven. 

For å kjøre prosjektet har man to muligheter. Åpne en terminal og skriv følgende tre kommandoer:
```
cd FridgeManager/
mvn install
mvn javafx:run -f fxui/pom.xml
```
Alternativt kan man benytte seg av:
```
cd FridgeManager/
mvn install
cd fxui/
mvn javafx:run
```
Legg merke til at `mvn install` både installerer Maven og kjører alle tester og kvalitetssjekker. 


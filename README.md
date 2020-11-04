# MultithreadingAssignment
Fontys university: O-S-OOS3-O-S31 multithreading assigment fall 2020

# MultithreadingAssigment Q&A (Language: Dutch)

## Wat is multithreading?
Bij multithreading applicaties worden meerdere processorkernen aangesproken om een opdracht uit te voeren.
Hierdoor kunnen meedere (deel)processen gelijktijdig uitegevoerd worden.

## Wanneer gebruik je meerdere threads?
Wanneer een proces uit meerdere opdrachten, die ieder onafhankelijk van elkaar uitgevoerd kunnen worden, bestaat.

## Wat zijn drie veel voorkomende problemen bij multithreaded applicaties?
* Racing conditions
Situatie:
Meerdere threads willen een variabele wijzigen
De variabele kan door iedere thread gelijktijdig gewijzigd worden
Probleem:
De variabele wordt gewijzigd terwijl deze bij een ander proces betrokken is, waardoor één wijziging ongedaan wordt gemaakt. 
* Deadlock
Situatie: 
Meerdere threads willen een variabele wijzigen
De variabele kan niet gewijzigd worden wanneer een thread bezig is
Probleem:
Threads worden tegengehouden wanneer variabelen al in gebruik zijn
* Lifelock
Situatie:
Meerdere threads willen een variabele wijzigen
De variabele kan niet gewijzigd worden wanneer een thread bezig is
De threads wachten op elkander om deadlock te voorkomen
Probleem:
Threads blijven op elkaar wachten en de variabele wordt niet gewijzigd 

## Waardoor onstaan deze problemen?
De bovenstaande problemen ontstaan voornamelijk doordat functies dezelfde variabelen willen bewerken.
## Hoe wordt het onderdeel genoemd waar objecten in het geheugen worden geplaatst?
Objecten worden opgeslagen in de "heap"

## Hoe is dit verschillend in een multithreaded applicatie?
Bij een multithreaded applicatie worden er meerdere stacks aangemaakt, voor iedere thread één.
In iedere stack worden referenties aangemaakt naar objecten, die zich in de heap bevinden.
Bij een single threaded applicatie is er maar één stack.

## Hoe wordt het onderdeel genoemd waar methoden worden uitgevoerd en primitieve types in het geheugen worden geplaatst?
Methoden, die worden uitgevoerd en primitieve types worden op "de stack" in het geheugen geplaatst.

## Hoe is dit verschillend in een multithreaded applicatie?
Binnen een multithreaded applicatie wordt er gebruik gemaakt van meerdere stacks (voor iedere thread één)
Er wordt dus een locatie gereserveert voor verschillende onderdelen van de uit te voeren elementen


## Wat is in dit kader een racing condition?
Een racing condition is een foutieve aanpassing van een waarde, die plaatsvind wanneer twee processen één waarde tegelijkertijd aanpassen.
Doordat één proces de ander overschrijft wordt één proces niet of foutief uitgevoerd.

## Hoe zou je dit kunnen voorkomen?
Dit kan voorkomen worden door gebruik te maken van zogenaamd atomische objecten.
Deze objecten worden geblokkeerd voor wijziging terwijl een proces het object bewerkt.

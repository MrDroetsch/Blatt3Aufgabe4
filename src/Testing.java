public class Testing {

    public static void main(String[] args) {

        // anlegen einer leeren queue
        DoubleEndedQueue<Integer> myQueue = new DoubleEndedQueue<>();

        // 1 bis 10 am Ende
        for(int i = 1; i <= 10; i++) {
            myQueue.pushBack(i);
        }

        // 11 bis 15 am Anfang
        for(int i = 11; i <= 15; i++) {
            myQueue.pushFront(i);
        }

        // Ausgabe auf der Konsole
        myQueue.print();

        // 15 am Ende
        myQueue.pushBack(15);

        // alle 15 löschen
        // Deine Lösung ist zwar richtig, allerdings wäre es performanter, die Queue nur einmal mit einer Schleife
        // zu durchlaufen und dann zu prüfen, ob das entsprechende Element eine 15 ist und es dann direkt zu entfernen.
        // Die Schleife dann am besten Rückwärts durchlaufen, da dies beim Entfernen von Elementen bei einer Collection
        // so geläufig ist, um Indexfehlern vorzubeugen. Ist aber nur ein Hinweis, deins ist trotzdem richtig :)
        // Hier hab ich das mal aufgeschrieben zur Veranschaulichung:

        for (int i = myQueue.size()-1; i >= 0; i--) {
            if (myQueue.getElement(i) == 15) {
                myQueue.removeElement(i);
            }
        }

        while(myQueue.find(15)) {
            myQueue.removeFirst(15);
        }

        // Kopf- und Endelement ausgeben
        System.out.println("Kopf-Element: " + myQueue.getFront());
        System.out.println("End-Element: " + myQueue.getBack());

        // ist die 15 in der Queue?
        System.out.println("Die 15 ist" + (myQueue.find(15) ? "" : " nicht") + " in der Queue!");

        // Alle Elemente löschen
        myQueue.dispose();

        // Queue ausgeben
        myQueue.print();

        /* Aufgabe 4c:
        Die Komplexität von allen Methoden ist O(1), mit Ausnahme von removeFirst, removeLast, dispose, find und print.
        Dort ist eine Komplexität von O(n), bzw. O(2n) bei removeFirst und removeLast.
         */
    }
}

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
        Die Komplexität von allen Methoden ist O(1), mit ausnahme von dispose, find und print. Dort ist eine Komplexität von O(n)
         */
    }

}

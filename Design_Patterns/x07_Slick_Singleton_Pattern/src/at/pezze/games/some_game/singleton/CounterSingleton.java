package at.pezze.games.some_game.singleton;

public class CounterSingleton {
    private static CounterSingleton instance = null; //statische Var. gibt es über alle Klassen nur ein Mal
    private int counter = 0;

    // Konstruktor muss beim Singleton Private sein
    /* Es soll nämlich verhindert werden, dass mehrere
    CounterSingleton Objekte erstellt werden.
     */
    private CounterSingleton() {

    }

    // Mit dieser Funktion wir nur EINE Instanz gestartet
    // Beim zweiten Aufruf wird wieder die gleiche Instanz zurückgegeben
    public static CounterSingleton getInstance(){
        if(instance==null) {
            instance = new CounterSingleton();
        }
        return instance;
    }

    public void increaseCounter(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }
}

package com.Hashtables;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1643, "Lightning Flash Asuna", 165);
        Player kirito = new Player(10, "Kirito the Swordsman", 256);
        Player asmorano = new Player(2857, "Asmoranomardicadaistinaculdacar", 132);
        Player yami = new Player(1802, "Yami13", 142);
        Player taki = new Player (1523, "Takikato", 141);


        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(asuna.getName(), asuna);
        hashtable.put(kirito.getName(), kirito);
        hashtable.put(asmorano.getName(), asmorano);
        hashtable.put(yami.getName(), yami);
        hashtable.put(taki.getName(), taki);

        hashtable.removePlayer(asuna.getName());



    }
}

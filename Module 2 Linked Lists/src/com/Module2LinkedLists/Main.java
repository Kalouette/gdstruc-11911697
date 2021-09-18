package com.Module2LinkedLists;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(hpDeskjet);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(asuna);


       // Number 2 answer
        playerLinkedList.countElements();

        //Number 3 answers
        playerLinkedList.containId(2);
        playerLinkedList.indexOf(2);

        // Number 1 answers
        playerLinkedList.printList();
        playerLinkedList.removeIndex();
        playerLinkedList.printList();



    }
}

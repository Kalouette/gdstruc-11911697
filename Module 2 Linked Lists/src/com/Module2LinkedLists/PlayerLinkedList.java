package com.Module2LinkedLists;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    private void remove(PlayerNode head) {
    }

    public void removeIndex(){
        PlayerNode current = head;

        remove(head);
        head = current.getNextPlayer();
    }

    public void countElements()
    {
        PlayerNode current = head;
        int counter = 0;
        while(current != null){
            current = current.getNextPlayer();
            counter++;
        }
        System.out.println(counter);
    }

    public void containId(int id){
        PlayerNode current = head;
        int i = 0;

        while(current != null) {

            if(current.getPlayer().getId() == id){
                System.out.println("True");
                break;
            }

            current = current.getNextPlayer();
            i++;
        }
        if(current == null){
            System.out.println("The ID you're looking for cannot be found.");
        }
    }

    public void indexOf(int id){
        int index = 0;

        PlayerNode current = head;

        while(current != null){
            if(current.getPlayer().getId() == id) {
                System.out.println("Index of id " + id + " is: " + index);
                break;
            }
            current = current.getNextPlayer();
            index++;
        }

        if (current == null){
            System.out.println("The ID you're looking for cannot be found.");
        }
    }



}

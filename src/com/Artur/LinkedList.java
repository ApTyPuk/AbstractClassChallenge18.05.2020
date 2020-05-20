package com.Artur;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList extends ListItem {

public static ArrayList<LinkedList>listItem = new ArrayList<>();
    public static int currPos = 0;


    public LinkedList(String parameter) {
        super(parameter);
    }

    @Override
    public String getParameter() {
        return super.getParameter();
    }

//    @Override
    public static void nextItem() {
        try {
            LinkedList nextPos = listItem.get(currPos + 1);
            if (nextPos != null) {
//            setNextItem(nextPos);
                currPos++;
                System.out.println(nextPos.getParameter());
            }
        }catch (Exception e) {
            System.out.println("You've reached end of list.");
        }
    }


//    @Override
    public static void previousItem() {
        try {
            LinkedList prevPos = listItem.get(currPos - 1);
            if (prevPos != null) {
//            setPreviousItem(prevPos);
                currPos--;
                System.out.println(prevPos.getParameter());
            }
        }catch(Exception e) {
            System.out.println("You've reached start of list.");
        }
    }

    @Override
    public void setNextItem(ListItem nextItem) {
        super.nextItem = nextItem;
    }
    @Override
    public void setPreviousItem(ListItem previousItem) {
        super.previousItem = previousItem;
    }



    @Override
    public int compareTo(ListItem listItem) {   //will need for adding in alphabetical order
        return super.compareTo(listItem);
    }

    public static void addToList(String name){
        LinkedList tempList = new LinkedList(name);
        listItem.add(tempList);
    }

//    public void addToList(String name){
//        LinkedList item = new LinkedList(name);
//
//        if(!listItem.contains(item)){
//
//            if(listItem.get(0) == null){
//                listItem.add(0, item);
//                super.setNextItem(item);
//                super.setPreviousItem(item);
//            }
//
//            if (item.compareTo(listItem.get(0)) < 0){
//                listItem.add(0, item);
//                super.setNextItem(listItem.get(1));
//                super.setPreviousItem(listItem.get(0));
//
//            }
//
//            for (int i = 0; i < listItem.size(); i++) {
//
//                if (item.compareTo(listItem.get(i)) > 0){
//                    if(item.compareTo(listItem.get(i+1)) < 0)
//                        listItem.add((i+1), item);
//                    super.setNextItem(listItem.get(i+2));
//                    super.setPreviousItem(listItem.get(i));
//                }else if((item.compareTo(listItem.get(i)) > 0) && (listItem.get(i+1) == null)){
//                    listItem.add((i+1), item);
//                    super.setNextItem(null);
//                    super.setPreviousItem(listItem.get(i));
//                }
//
//            }
//
//        }
//
//    }


    public static void print(){
        for(int i = 0; i < listItem.size(); i++){
//        for(ListItem i: listItem){
            System.out.println(listItem.get(i).getParameter());
        }
    }


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        addToList("c");
        addToList("z");
        addToList("b");
        addToList("d");
        addToList("f");
        addToList("a");

        boolean quit = false;
        int action;

        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getParameter()+"'." );

        while(!quit){
            System.out.print("\nChoose your action: ");
            action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    System.out.print("\nPrevious item: ");
                    previousItem();
                    break;
                case 2:
                    System.out.print("\nNext item: ");
                    nextItem();
                    break;
                case 3:
                    System.out.println("\nPrinting items: ");
                    print();
                    break;
                case 4:
                    System.out.println("\nDeleting your item!");
                    delete();
                    break;

            }
        }

    }

    private static void delete(){
        System.out.println("Removing: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getParameter()+"'." );
        listItem.remove(currPos);
        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getParameter()+"'." );
    }










}

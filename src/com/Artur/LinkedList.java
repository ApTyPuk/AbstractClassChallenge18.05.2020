package com.Artur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedList extends ListItem {

public static ArrayList<LinkedList> listItem = new ArrayList<>();
    public static int currPos = 0;


    public LinkedList(String parameter) {
        super(parameter);
    }

    public static void nextItem() {
        try {
            LinkedList nextPos = listItem.get(currPos + 1);
            if (nextPos != null) {
//            setNextItem(nextPos);
                currPos++;
                System.out.println(nextPos.getValue());
            }
        }catch (Exception e) {
            System.out.println("You've reached end of list.");
        }
    }


    public static void previousItem() {
        try {
            LinkedList prevPos = listItem.get(currPos - 1);
            if (prevPos != null) {
//            setPreviousItem(prevPos);
                currPos--;
                System.out.println(prevPos.getValue());
            }
        }catch(Exception e) {
            System.out.println("You've reached start of list.");
        }
    }

    @Override
    ListItem next() {
        return null;
    }

    @Override
    ListItem setNext(ListItem item) {
        return null;
    }

    @Override
    ListItem previous() {
        return null;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return null;
    }

    @Override
    int compareTo(ListItem item) {
//        String temp = getValue().toString();
//        System.out.println(temp);
//        System.out.println(item.getValue().toString());
        return getValue().toString().compareTo(item.getValue().toString());
    }

//    public static void addToList(String name){
//        LinkedList tempList = new LinkedList(name);
//        listItem.add(tempList);
//    }

    public void addToList(){
        LinkedList item = new LinkedList(getValue().toString());


//        if(!listItem.contains(item)){

            if(listItem.isEmpty()){
                listItem.add(item);
                System.out.println("\nAdding (0): " + item.getValue().toString());
//                super.setNextItem(item);
//                super.setPreviousItem(item);
            }

            if (item.compareTo(listItem.get(0)) < 0){
                listItem.add(0, item);
                System.out.println("Adding (1): " + item.getValue().toString());

//                super.setNextItem(listItem.get(1));
//                super.setPreviousItem(listItem.get(0));

            }

            for (int i = 0; i < listItem.size(); i++) {

                try{
                    int getI = item.compareTo(listItem.get(i));
                    int getIplus1 = item.compareTo(listItem.get(i+1));

                    if (getI > 0){
                        System.out.println("Skipping here :" +item.getValue().toString() );
                    }
                    if ((getI > 0) && (getIplus1 < 0)){
                        listItem.add((i+1), item);
                        System.out.println("Adding (2): " + item.getValue().toString());

    //                    super.setNextItem(listItem.get(i+2));
    //                    super.setPreviousItem(listItem.get(i));
                    }

                    System.out.println(i+"----->" + listItem.size());
                    System.out.println(i+"----->" + listItem.get(listItem.size()-1).getValue());
                    System.out.println(listItem.get(i) == listItem.get(listItem.size()-1));

                    if(  (getI > 0) && (listItem.get(i) == listItem.get(listItem.size()-1))  ){
//                        LinkedList temp = listItem.get(i);
//                        listItem.add(i, item);
//                        listItem.set(i, temp);
//                        listItem.add((i), item);
                        System.out.println("Adding (3): " + item.getValue().toString());

    //                    super.setNextItem(null);
    //                    super.setPreviousItem(listItem.get(i));
                    }
                }catch (Exception e){
                }

                System.out.println("==================================");
            }

//        }

    }


    public static void print(){
        for(int i = 0; i < listItem.size(); i++){
//        for(ListItem i: listItem){
            System.out.println(listItem.get(i).getValue());
        }
    }


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String stringData = "g w e z c d b a";
        String[] data = stringData.split(" ");
        System.out.println("String Array 'data' size is: " + data.length);
        System.out.println("String Array 'data' values are: " + Arrays.toString(data));

//        LinkedList aa = new LinkedList("a");
//        LinkedList bb = new LinkedList("b");
//        System.out.println(aa.compareTo(bb));

        for (String s : data){
            LinkedList list = new LinkedList(s);
            list.addToList();
        }

        System.out.println("\nSize of listItem array: "+ listItem.size());


        for(LinkedList l : listItem) {
            System.out.println(l.getValue().toString());
        }



//        boolean quit = false;
//        int action;
//
//        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );
//
//        while(!quit){
//            System.out.print("\nChoose your action: ");
//            action = scanner.nextInt();
//            scanner.nextLine();
//            switch(action){
//                case 0:
//                    System.out.println("\nShutting down...");
//                    quit = true;
//                    break;
//                case 1:
//                    System.out.print("\nPrevious item: ");
//                    previousItem();
//                    break;
//                case 2:
//                    System.out.print("\nNext item: ");
//                    nextItem();
//                    break;
//                case 3:
//                    System.out.println("\nPrinting items: ");
//                    print();
//                    break;
//                case 4:
//                    System.out.println("\nDeleting your item!");
//                    delete();
//                    break;
//
//            }
//        }

    }

    private static void delete(){
        System.out.println("Removing: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );
        listItem.remove(currPos);
        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );
    }










}

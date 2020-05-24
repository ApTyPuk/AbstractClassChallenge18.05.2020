package com.Artur;

import java.util.ArrayList;
import java.util.Scanner;

public class LinkedList extends ListItem {

public static ArrayList<LinkedList> listItem = new ArrayList<>();
    public static int currPos = 0;

    public LinkedList(String value) {
        super(value);
    }

    @Override
    ListItem next() {
        if(hasNext(currPos+1)){
            setNext(listItem.get(currPos + 1));
            setPrevious(listItem.get(currPos));
            currPos++;
            System.out.println(super.nextItem.getValue());
            return super.nextItem;
        }
        System.out.println("You've reached end of list.");
        return listItem.get(currPos);
    }

    @Override
    ListItem setNext(ListItem item) {
        super.nextItem = item;
        return super.nextItem;
    }

    @Override
    ListItem previous() {
        if(hasNext(currPos-1)){
            setPrevious(listItem.get(currPos - 1));
            setNext(listItem.get(currPos));
            currPos--;
            System.out.println(super.previousItem.getValue());
            return super.previousItem;
        }
        System.out.println("You've reached start of list.");
        return listItem.get(currPos);
    }


    @Override
    ListItem setPrevious(ListItem item) {
        super.previousItem = item;
        return super.previousItem;
    }

    @Override
    int compareTo(ListItem item) {
        return getValue().toString().compareTo(item.getValue().toString());
    }

    private static boolean hasNext(int index){
        try {
            listItem.get(index);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public void addToList(){
        LinkedList item = new LinkedList(getValue().toString());

        if(listItem.isEmpty()){
            listItem.add(item);
//            System.out.println("\nAdding (0): " + item.getValue().toString());
        }

        if ((item.compareTo(listItem.get(0)) < 0) && (!listItem.contains(item))){
            listItem.add(0, item);
//            System.out.println("Adding (1): " + item.getValue().toString());
        }

        for (int i = 0; i < listItem.size(); i++) {
            if(!listItem.contains(item)) {
                if (  (item.compareTo(listItem.get(i)) > 0) && (!hasNext(i + 1))  ) {
                    listItem.add(item);
//                    System.out.println("Adding (3): " + item.getValue().toString());
                }

                if ( (hasNext(i + 1)) && (item.compareTo(listItem.get(i)) > 0) && (item.compareTo(listItem.get(i+1)) < 0)) {
                    listItem.add((i + 1), item);
//                    System.out.println("Adding (2): " + item.getValue().toString());
                }
            }
        }
    }




    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String stringData = "g g w e z c w d b a";
        String[] data = stringData.split(" ");
//        System.out.println("String Array 'data' size is: " + data.length);
//        System.out.println("String Array 'data' values are: " + Arrays.toString(data));

        for (String s : data){
            LinkedList list = new LinkedList(s);
            list.addToList();
        }

//        System.out.println("\nSize of listItem array: "+ listItem.size());

        for(LinkedList l : listItem) {
            System.out.println(l.getValue().toString());
        }

        System.out.println(hasNext(8));

        boolean quit = false;
        int action;

        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );

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
                    listItem.get(currPos).previous();
                    break;
                case 2:
                    System.out.print("\nNext item: ");
                    listItem.get(currPos).next();
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
        System.out.println("Removing: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );
        listItem.remove(currPos);
        if(currPos != 0){
            currPos--;
        }
        System.out.println("\nNow showing position: '"+ (currPos) +"' with value inside: '"+ listItem.get(currPos).getValue()+"'." );
    }

    public static void print(){
        for (LinkedList i : listItem) {
            System.out.println(i.getValue());
        }
    }











}

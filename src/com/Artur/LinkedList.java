package com.Artur;


import java.util.ArrayList;

public class LinkedList extends ListItem {

    public LinkedList(String parameter) {
        super(parameter);
    }

    ArrayList<ListItem> listItem = new ArrayList<>();

    @Override
    public void nextItem() {
        super.nextItem();
    }

    @Override
    public void previousItem() {
        super.previousItem();
    }

    public void addToList(ListItem item){

        if(listItem.isEmpty()){
            listItem.add(item);
            super.setNextItem(item);
            super.setPreviousItem(item);
        }

        for (int i = 0; i < listItem.size(); i++) {

            if (listItem.get(i).compareTo(item) < 0){
                
            }

        }

    }














}

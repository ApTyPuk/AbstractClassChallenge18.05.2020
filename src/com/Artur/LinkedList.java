package com.Artur;


import java.util.ArrayList;

public class LinkedList extends ListItem {
public static ArrayList<ListItem>listItem = new ArrayList<>();

    public LinkedList(String parameter) {
        super(parameter);
    }

    public ArrayList<ListItem> getListItem() {
        return listItem;
    }

    @Override
    public void nextItem() {
        super.nextItem();
    }

    @Override
    public void previousItem() {
        super.previousItem();
    }

    @Override
    public int compareTo(ListItem listItem) {
        return super.compareTo(listItem);
    }

    public void addToList(String name){
        LinkedList item = new LinkedList(name);

        if(!listItem.contains(item)){

            if(listItem.get(0) == null){
                listItem.add(0, item);
                super.setNextItem(item);
                super.setPreviousItem(item);
            }

            if (item.compareTo(listItem.get(0)) < 0){
                listItem.add(0, item);
                super.setNextItem(listItem.get(1));
                super.setPreviousItem(listItem.get(0));

            }

            for (int i = 0; i < listItem.size(); i++) {

                if (item.compareTo(listItem.get(i)) > 0){
                    if(item.compareTo(listItem.get(i+1)) < 0)
                        listItem.add((i+1), item);
                    super.setNextItem(listItem.get(i+2));
                    super.setPreviousItem(listItem.get(i));
                }else if((item.compareTo(listItem.get(i)) > 0) && (listItem.get(i+1) == null)){
                    listItem.add((i+1), item);
                    super.setNextItem(null);
                    super.setPreviousItem(listItem.get(i));
                }

            }

        }

    }


    public static void print(){
        for(int i = 0; i < listItem.size(); i++){
//        for(ListItem i: listItem){
            System.out.println(listItem.get(i).getParameter());
        }
    }



    public static void main(String[] args) {

        addToList("c");
        LinkedList one = new LinkedList("c");
        LinkedList two = new LinkedList("b");
        LinkedList three = new LinkedList("d");
        LinkedList four = new LinkedList("f");
        LinkedList five = new LinkedList("a");

        listItem.addToList(one);
        LinkedList.listItem.add(two);
        LinkedList.listItem.add(three);
        LinkedList.listItem.add(four);
        LinkedList.listItem.add(five);


    }












}

package com.Artur;

import java.util.List;

public abstract class ListItem {
    String parameter;

    ListItem nextItem;
    ListItem previousItem;

    public ListItem(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }



//    public void nextItem(){
//    }
//    public void previousItem(){
//    }

    public int compareTo(ListItem listItem){
        return this.parameter.compareTo(listItem.getParameter());
    }




}

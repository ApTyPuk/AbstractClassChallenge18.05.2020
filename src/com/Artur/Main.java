package com.Artur;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> intArray = new ArrayList<>();
    public static void main(String[] args) {

        intArray.add("1");
        intArray.add("2");
        intArray.add("3");
        intArray.add("4");
        intArray.add("5");

        System.out.println(intArray.toString());

        addToArray("6");
        addToArray("4");


        System.out.println(intArray.toString());


    }


        public static void addToArray(String string){
            for (int i = 0; i<intArray.size(); i++ ){
                if(string.compareTo(intArray.get(i)) > 0 && (!hasNext(i + 1))){
                    intArray.add(string);
                    System.out.println("Adding (3): " + string);
                }

            }
        }


        private static boolean hasNext(int index){
            try {
                if(intArray.get(index) != null) {
                    return true;
                }
            }catch (Exception e){
            }
            return false;
        }




    }

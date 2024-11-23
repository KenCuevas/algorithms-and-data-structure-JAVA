package com.kencuevas;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create list of fruit
        List<String> fruitList = List.of("Apple", "Banana", "Orange", "Mango", "Strawberry");
        List<String> fruitList2 = List.of("Apple", "Passion Fruit", "Orange", "Mango", "Strawberry");

    
        System.out.println("Union de conjuntos: " + getCommontElements(fruitList, fruitList2));
    }


    public static List<String> getCommontElements(List<String> listOne, List<String> listTwo){
        List<String> commonLists = new ArrayList();

        return null;
    }
}

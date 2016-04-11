/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java8;

import com.demo.pojo.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/**
 *
 * @author hpanjwani
 */
public class PredicateInnerClass {        
     
    public static void main(String[] args) {
        
        List<Person> personList = new ArrayList<>();   

        personList.add(new Person("Mike", 25));
        personList.add(new Person("Mary", 45));
        personList.add(new Person("Joe", 75));
        
        // Inner class
        Predicate<Person> pred = new Predicate<Person>() {

            @Override
            public boolean test(Person p) {
                return p.getAge() > 60;
            }
        };
        
        for(Person person : personList) {
            if(pred.test(person))
                System.out.println(person);               
        }       
    }
    
}

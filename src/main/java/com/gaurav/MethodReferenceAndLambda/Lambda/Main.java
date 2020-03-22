package com.gaurav.MethodReferenceAndLambda.Lambda;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        // Lambda Usage Example
        Employee arrayEmp []= {new Employee("Shakti Kumar",28),new Employee("Amit Sharma",45)};
        List<Employee> listEmp= Arrays.asList(arrayEmp); // immutable list;
        Collections.sort(listEmp,(o1,o2)->o1.getName().compareTo(o2.getName())); // Comparator Assignment
        listEmp.forEach(emp-> System.out.println(emp.getName() +"::"+emp.getAge()));

        // Functional Interface and Lambda assignment ;
        UpperConcat uc = (object1,object2)->object1.toUpperCase()+"::"+object2.toUpperCase();
        System.out.println(uc.upperAndConcat("Gaurav","Sood"));

        // More Functional Interface Examples
        Predicate<Employee> predicateEmp = employee -> (employee.getAge() <= 30);
        for(Employee emp:listEmp)
        {
            if (predicateEmp.test(emp))
            {
                System.out.println(emp.getName());
            }
        }
        System.out.println("*****************************************");
        Supplier<Integer> supplier = ()->{ Random random = new Random();return random.nextInt();};
        System.out.println(supplier.get());
        System.out.println("*****************************************");
        Function <Employee,String> getLastName = emp->{return emp.getName().substring(emp.getName().indexOf(" "));};
        String lastName = getLastName.apply(listEmp.get(1));
        System.out.println(lastName.trim());
        System.out.println("*****************************************");

        // Functional Interface Chaining
        Function <String, String > upperCaseFunction = name -> name.toUpperCase();
        Function <String,String> firstNameFunction = name-> name.substring(0,name.indexOf(" "));
        Function chainFunction = upperCaseFunction.andThen(firstNameFunction);
        System.out.println(chainFunction.apply("Gaurav Sood"));


        //            new Thread(()-> {System.out.println("i am a new thread");
        //            System.out.println("Line 2");
        //            System.out.println("Line 3");}).start();

    }


}





package com.yash.exceptions_practice;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class CustomerApp 
{
    public static void main( String[] args )
    {
        ArrayList<Customer> custs = new ArrayList<Customer>();
        custs.add(new Customer(1,"Jay",12));
        custs.add(new Customer(1,"Jay",12));
        custs.add(new Customer(1,"Jay",12));
        custs.add(new Customer(1,"Jay",12));
    }
}

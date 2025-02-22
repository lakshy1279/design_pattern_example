package org.example.Tic_Tac_Toe.abstractFactory;


//this is product
public class MySQLQuery implements Query {
    public void executeQuery(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}

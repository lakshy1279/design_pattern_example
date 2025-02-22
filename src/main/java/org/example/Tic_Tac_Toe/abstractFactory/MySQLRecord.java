package org.example.Tic_Tac_Toe.abstractFactory;

public class MySQLRecord implements Record {
    public void insertRecord(String data) {
        System.out.println("Inserting record into MySQL: " + data);
    }
}

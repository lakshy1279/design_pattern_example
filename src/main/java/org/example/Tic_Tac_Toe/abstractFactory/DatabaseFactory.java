package org.example.Tic_Tac_Toe.abstractFactory;

// Abstract Factory
public interface DatabaseFactory {
    Connection createConnection();
    Query createQuery();
    Record createRecord();
}

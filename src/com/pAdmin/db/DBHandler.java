package com.pAdmin.db;

import java.sql.Connection;

/**
 * Created by neeraj on 11/25/2016.
 */
public class DBHandler {
    // create sqlite or other db connections here
    // make conncetions to database local


    private String dbEngine;
    private String dbUser;
    private String dbPassword;
    private String dbHost;

    public DBHandler(){
        dbEngine = "sqlite";
    }

    public DBHandler(String dbEngine){
        switch (dbEngine) {
            case "sqlite":
                this.dbEngine = "sqlite";
                break;
            case "mysql":
                this.dbEngine = "mysql";
                break;
        }
    }

    Connection connectSqlite(String filename){
        // make connection and return working connection

        return null;
    }
}

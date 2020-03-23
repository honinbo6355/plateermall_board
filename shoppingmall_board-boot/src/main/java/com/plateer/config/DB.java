package com.plateer.config;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

public class DB {

//    private DataSource dataSource;
//
//    public DB(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Autowired
    private DataSource dataSource;
}

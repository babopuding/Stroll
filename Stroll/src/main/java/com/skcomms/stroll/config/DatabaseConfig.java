package com.skcomms.stroll.config;

import javax.sql.DataSource;

public abstract class DatabaseConfig {

    public abstract DataSource dataSource();

    abstract void initialize(org.apache.tomcat.jdbc.pool.DataSource dataSource);

    protected void configureDataSource(org.apache.tomcat.jdbc.pool.DataSource dataSource, DatabaseProperties databaseProperties) {
    	dataSource.setDriverClassName(databaseProperties.getDriverClassName());
    	dataSource.setUrl(databaseProperties.getUrl());
    	dataSource.setUsername(databaseProperties.getUserName());
    	dataSource.setPassword(databaseProperties.getPassword());
        dataSource.setMaxActive(databaseProperties.getMaxActive());
        dataSource.setMaxIdle(databaseProperties.getMaxIdle());
        dataSource.setMinIdle(databaseProperties.getMinIdle());
        dataSource.setMaxWait(databaseProperties.getMaxWait());
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);

		if(databaseProperties.isInitialize())
			initialize(dataSource);
    }
}


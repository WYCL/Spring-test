package com.wangchao.test_spring;

import java.util.Properties;

/**
 * created by WYCL on ${DATA}.
 */
public class MyDataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "com.wangchao.test_spring.MyDataSource{" +
                "properties=" + properties +
                '}';
    }
}

//package ru.job4j.jdbc;
//import java.util.Properties;
//
//import static jdk.jfr.internal.SecuritySupport.getResourceAsStream;
//
//public class Config {
//    private Properties configFile;
//
//    public Properties getConfigFile() {
//        return configFile;
//    }
//
//    public void setConfigFile(Properties configFile) {
//        this.configFile = configFile;
//    }
//
//    public Config() {
//        configFile = new java.util.Properties();
//        try {
//            getResourceAsStream("app.properties");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public String getProperty(String key) {
//        String value = this.configFile.getProperty(key);
//        return value;
//    }
//}

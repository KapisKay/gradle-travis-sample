package io.turntabl;

public abstract class Client {
    private String name;
    private String id;
    private Level serviceLevel;

    private static int generatedID = 0;

    public Client(String name, Level serviceLevel) {
        this.name = name;
        this.id = generateId().toString();
        this.serviceLevel = serviceLevel;
    }

    public abstract String getContactName();

//    Auto Generate client ID
    private Integer generateId(){
        return generatedID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }


    public Level getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(Level serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public static int getGeneratedID() {
        return generatedID;
    }

    public static void setGeneratedID(int generatedID) {
        Client.generatedID = generatedID;
    }




}

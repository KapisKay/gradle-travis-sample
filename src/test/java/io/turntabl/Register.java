package io.turntabl;

import java.util.HashMap;

public class Register {
    private HashMap<String, Client> clientRegister;

    public Register(HashMap<String, Client> clientRegister) {
        this.clientRegister = clientRegister;
    }


    public HashMap<String, Client> getClientRegister() {
        return clientRegister;
    }

    @Override
    public String toString() {
        return "Register{" +
                "clientRegister=" + clientRegister +
                '}';
    }
}

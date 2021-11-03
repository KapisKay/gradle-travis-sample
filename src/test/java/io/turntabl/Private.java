package io.turntabl;

public class Private extends Client{
    public Private(String name,  Level serviceLevel) {
        super(name,  serviceLevel);
    }

    @Override
    public String getContactName() {
        return null;
    }
}

package org.launchcode.techjobs.oo;

abstract class JobField {

    public int id;
    public int nextId;
    abstract String getValue();
    abstract int getId();
    @Override
    public abstract String toString();

}

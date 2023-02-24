package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.id = nextId;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //Only created equals/hashcode for id and name - may need to change
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString(){
        String nL = "\n";
        if (getId() != nextId){
            return "OOPS! This job does not seem to exist.";
        } else if (getName().equals("")){
            setName("Data not available");
        } else if (getEmployer().equals("")){
            new Employer("Data not available");
        } else if (getLocation().equals("")){
            new Location("Data not available");
        } else if (getPositionType().equals("")){
            new PositionType("Data not available");
        } else if (getCoreCompetency().equals("")){
            new CoreCompetency("Data not available");
        } /*else {
            return nL + "ID: " + getId() + nL + "Name: " + getName() + nL + "Employer: " + getEmployer() + nL + "Location: " + getLocation() + nL + "Position Type: " + getPositionType() + nL +  "Core Competency: " + getCoreCompetency() + nL;
        }*/
        return nL + "ID: " + getId() + nL + "Name: " + getName() + nL + "Employer: " + getEmployer() + nL + "Location: " + getLocation() + nL + "Position Type: " + getPositionType() + nL +  "Core Competency: " + getCoreCompetency() + nL;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

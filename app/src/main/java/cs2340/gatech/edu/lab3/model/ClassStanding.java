package cs2340.gatech.edu.lab3.model;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private final String twoCharRep;

    ClassStanding (String twoCharRep) {
        this.twoCharRep = twoCharRep;
    }

    public String getTwoCharRep() {
        return this.twoCharRep;
    }
}

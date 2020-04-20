package com.giga;

public class Cv {
    private int wvs;
    private int npdtv;
    private int ncdtv;

    public Cv() {
    }

    public int getWvs() {
        return wvs;
    }

    public void setWvs(int wvs) {
        this.wvs = wvs;
    }

    public int getNpdtv() {
        return npdtv;
    }

    public void setNpdtv(int npdtv) {
        this.npdtv = npdtv;
    }

    public int getNcdtv() {
        return ncdtv;
    }

    public void setNcdtv(int ncdtv) {
        this.ncdtv = ncdtv;
    }

    @Override
    public String toString() {
        return "wvs= " + wvs +
                ", npdtv= " + npdtv +
                ", ncdtv= " + ncdtv;
    }
}

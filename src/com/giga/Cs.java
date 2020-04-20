package com.giga;

public class Cs {
    private int nKW = 0;
    private int nId = 0;
    private int nOp = 0;
    private int nNv = 0;
    private int nSl = 0;

    public Cs() {
    }

    public int getnKW() {
        return nKW;
    }

    public void setnKW(int nKW) {
        this.nKW = nKW;
    }

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }

    public int getnOp() {
        return nOp;
    }

    public void setnOp(int nOp) {
        this.nOp = nOp;
    }

    public int getnNv() {
        return nNv;
    }

    public void setnNv(int nNv) {
        this.nNv = nNv;
    }

    public int getnSl() {
        return nSl;
    }

    public void setnSl(int nSl) {
        this.nSl = nSl;
    }

    @Override
    public String toString() {
        return "nKW= " + nKW +
                ", nId= " + nId +
                ", nOp= " + nOp +
                ", nNv= " + nNv +
                ", nSl= " + nSl;
    }
}

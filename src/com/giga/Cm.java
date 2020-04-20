package com.giga;

public class Cm {
    private int wmrt;
    private int npdtp;
    private int ncdtp;

    public Cm() {
    }

    public int getWmrt() {
        return wmrt;
    }

    public void setWmrt(int wmrt) {
        this.wmrt = wmrt;
    }

    public int getNpdtp() {
        return npdtp;
    }

    public void setNpdtp(int npdtp) {
        this.npdtp = npdtp;
    }

    public int getNcdtp() {
        return ncdtp;
    }

    public void setNcdtp(int ncdtp) {
        this.ncdtp = ncdtp;
    }

    @Override
    public String toString() {
        return "wmrt =" + wmrt +
                ", npdtp =" + npdtp +
                ", ncdtp =" + ncdtp;
    }
}

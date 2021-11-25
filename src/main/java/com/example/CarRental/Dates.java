package com.example.CarRental;

public class Dates {

    String begin;
    String end;

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}

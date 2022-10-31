package com.eerror.ComplexNumber;

public class ComplexNumber {
    protected double re;
    protected double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }


    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        if (this == o) return true;

        ComplexNumber other = (ComplexNumber) o;

        if (Double.compare(other.getRe(), getRe()) != 0) return false;
        return Double.compare(other.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getRe());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getIm());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

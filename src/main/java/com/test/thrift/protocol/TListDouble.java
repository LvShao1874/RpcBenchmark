package com.test.thrift.protocol;

import java.util.Arrays;
import java.util.List;

public class TListDouble {
    private double[] arr;
    private int size;

    public TListDouble(int n) {
        if (n < 4) n = 4;
        this.size = 0;
        this.arr = new double[n];
    }

    public TListDouble() {
        size = 0;
        arr = new double[16];
    }

    public TListDouble(double[] array, int size) {
        this.size = size;
        arr = array;
    }

    public TListDouble(List<Double> doubleList) {
        size = doubleList.size();
        arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = doubleList.get(i);
        }
    }

    public void add(double v) {
        if (size >= arr.length) {
            int n = arr.length * 2;
            if (n < 4) n = 4;
            arr = Arrays.copyOf(arr, n);
        }
        arr[size++] = v;
    }

    public int size() {
        return size;
    }

    public double get(int idx) {
        return arr[idx];
    }

    public void set(int idx, double v) {
        arr[idx] = v;
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof TListDouble)
            return this.equals((TListDouble) that);
        return false;
    }

    public boolean equals(TListDouble other) {
        if (other.size != size) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (other.get(i) != get(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "TListDouble{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        int result = size;
        for (int i = 0; i < size; i++) {
            long bits = Double.doubleToLongBits(arr[i]);
            result = 31 * result + (int) (bits ^ (bits >>> 32));
        }
        return result;
    }
}

package com.test.thrift.protocol;

import java.util.Arrays;
import java.util.List;

public class TListFloat {
    private float[] arr;
    private int size;

    public TListFloat(int n) {
        if (n < 4) n = 4;
        this.size = 0;
        this.arr = new float[n];
    }

    public TListFloat() {
        size = 0;
        arr = new float[16];
    }

    public TListFloat(float[] array, int size) {
        this.size = size;
        arr = array;
    }

    public TListFloat(List<Float> floatList) {
        size = floatList.size();
        arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = floatList.get(i);
        }
    }

    public void add(float v) {
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

    public float get(int idx) {
        return arr[idx];
    }

    public void set(int idx, float v) {
        arr[idx] = v;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof TListFloat)
            return this.equals((TListFloat) that);
        return false;
    }

    public boolean equals(TListFloat other) {
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
        return "TListFloat{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        int result = size;
        for (int i = 0; i < size; i++) {
            result = 31 * result + Float.floatToIntBits(arr[i]);
        }
        return result;
    }
}

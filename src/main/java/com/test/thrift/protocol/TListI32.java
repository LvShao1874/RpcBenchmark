package com.test.thrift.protocol;

import java.util.Arrays;
import java.util.List;

// i32, i64, double, byte, bool
// TListI32, TListI64, TListDouble, TListByte, TListBool
public class TListI32 {
    private int[] arr;
    private int size;

    public TListI32(int n) {
        if (n < 4) n = 4;
        this.size = 0;
        this.arr = new int[n];
    }

    public TListI32() {
        size = 0;
        arr = new int[16];
    }

    public TListI32(int[] array, int size) {
        this.size = size;
        arr = array;
    }

    public TListI32(List<Integer> i32List) {
        size = i32List.size();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i32List.get(i);
        }
    }

    public void add(int v) {
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

    public int get(int idx) {
        return arr[idx];
    }

    public void set(int idx, int v) {
        arr[idx] = v;
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof TListI32)
            return this.equals((TListI32) that);
        return false;
    }

    public boolean equals(TListI32 other) {
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
        return "TListI32{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }


    @Override
    public int hashCode() {
        int result = size;
        for (int i = 0; i < size; i++) {
            result = 31 * result + arr[i];
        }
        return result;
    }
}

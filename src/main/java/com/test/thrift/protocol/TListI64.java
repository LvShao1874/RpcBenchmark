package com.test.thrift.protocol;

import java.util.Arrays;
import java.util.List;

// i32, i64, double, byte, bool
// TListI32, TListI64, TListDouble, TListByte, TListBool
public class TListI64 {
    private long[] arr;
    private int size;

    public TListI64(int n) {
        if (n < 4) n = 4;
        this.size = 0;
        this.arr = new long[n];
    }

    public TListI64() {
        size = 0;
        arr = new long[16];
    }

    public TListI64(long[] array, int size) {
        this.size = size;
        arr = array;
    }

    public TListI64(List<Long> i64List) {
        size = i64List.size();
        arr = new long[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i64List.get(i);
        }
    }

    public void add(long v) {
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

    public long get(int idx) {
        return arr[idx];
    }

    public void set(int idx, long v) {
        arr[idx] = v;
    }

    @Override
    public boolean equals(java.lang.Object that) {
        if (that == null)
            return false;
        if (that instanceof TListI64)
            return this.equals((TListI64) that);
        return false;
    }

    public boolean equals(TListI64 other) {
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
        return "TListI64{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }


    @Override
    public int hashCode() {
        int result = size;
        for (int i = 0; i < size; i++) {
            long bits = arr[i];
            result = 31 * result + (int) (bits ^ (bits >>> 32));
        }
        return result;
    }
}

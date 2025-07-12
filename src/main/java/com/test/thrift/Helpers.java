package com.test.thrift;


import java.nio.ByteBuffer;

public class Helpers {

    public static ByteBuffer copyBinary(final ByteBuffer orig) {
        if (orig == null) return null;

        if (orig.hasArray()) {
            // 浅拷贝
            return ByteBuffer.wrap(orig.array(), orig.arrayOffset() + orig.position(), orig.remaining());
        } else {
            ByteBuffer copy = ByteBuffer.wrap(new byte[orig.remaining()]);
            int p = orig.position();
            orig.get(copy.array());
            orig.position(p);
            return copy;
        }
    }

    // https://gist.github.com/pascaldekloe/b54326e6b7c5e9f036911a8cbea6ccbf
    // https://github.com/protocolbuffers/protobuf/blob/master/java/core/src/main/java/com/google/protobuf/BinaryWriter.java#L2407
    public static void writeUTF8(ByteBuffer dest, String s) {
        for (int sIndex = 0, sLength = s.length(); sIndex < sLength; sIndex++) {
            char c = s.charAt(sIndex);
            if (c < '\u0080') {
                dest.put((byte) c);
            } else if (c < '\u0800') {
                dest.put((byte) (192 | c >>> 6));
                dest.put((byte) (128 | c & 63));
            } else if (c < '\ud800' || c > '\udfff') {
                dest.put((byte) (224 | c >>> 12));
                dest.put((byte) (128 | c >>> 6 & 63));
                dest.put((byte) (128 | c & 63));
            } else {
                int cp = 0;
                if (++sIndex < sLength) cp = Character.toCodePoint(c, s.charAt(sIndex));
                if ((cp >= 1 << 16) && (cp < 1 << 21)) {
                    dest.put((byte) (240 | cp >>> 18));
                    dest.put((byte) (128 | cp >>> 12 & 63));
                    dest.put((byte) (128 | cp >>> 6 & 63));
                    dest.put((byte) (128 | cp & 63));
                } else {
                    dest.put((byte) '?');
                }
            }
        }
    }
}

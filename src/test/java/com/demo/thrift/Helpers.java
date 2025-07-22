package com.demo.thrift;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Helpers {
    static Random random = new Random();

    public static com.test.origin_thrift.DemoSample getSmallObj() {
        int rate = 100;
        com.test.origin_thrift.DemoSample thrift = new com.test.origin_thrift.DemoSample();
        thrift.userId = random.nextInt();
        thrift.ms = System.currentTimeMillis();
        thrift.label = randomString(1 * rate);
        thrift.codes = Stream.generate(() -> random.nextInt(100000)).limit(10 * rate).collect(Collectors.toList());

        return thrift;
    }

    public static com.test.origin_thrift.DemoSample getLargetObj() {
        com.test.origin_thrift.DemoSample thrift = new com.test.origin_thrift.DemoSample();
        int rate = 1000;
        thrift.userId = random.nextInt();
        thrift.ms = System.currentTimeMillis();
        thrift.label = randomString(1 * rate);
        thrift.codes = Stream.generate(() -> random.nextInt(100000)).limit(10 * rate).collect(Collectors.toList());
        thrift.features = new HashMap<>();
        for (int i = 0; i < 10 * rate; i++) {
            thrift.features.put(i, randomString(10));
        }
        return thrift;
    }

    public static String randomString(int strLength) {
        Random rnd = ThreadLocalRandom.current();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            boolean isChar = (rnd.nextInt(2) % 2 == 0);// 输出字母还是数字
            if (isChar) { // 字符串
                int choice = rnd.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                ret.append((char) (choice + rnd.nextInt(26)));
            } else { // 数字
                ret.append(Integer.toString(rnd.nextInt(10)));
            }
        }
        return ret.toString();
    }
}

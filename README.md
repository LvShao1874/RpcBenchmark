# RpcBenchmark

brpc 官方性能测试:
https://brpc.apache.org/zh/docs/benchmark/
结论: c++版 brpc > thrift > grpc

dubbo性能 第三方测试:
https://cloud.tencent.com/developer/article/1511352
结论: thrift > grpc > dubbo

初步结论:
thrift是java,c++等多语言通信下性能优秀的RPC框架.

本demo将提供测试对比原版thrift在序列化层面的耗时
序列化耗时减少60% 反序列化耗时减少35% 平均减少50%

以下是本人运行结果，可以在BenchTest自行测试
```
第1轮 序列化测试 thrift obj bytes:221043
userId=2138821863 thrift cost:333
userId=2138821863 zp_thrift cost:156
第2轮 序列化测试 thrift obj bytes:221043
userId=2138821863 thrift cost:232
userId=2138821863 zp_thrift cost:100
第3轮 序列化测试 thrift obj bytes:221043
userId=2138821863 thrift cost:232
userId=2138821863 zp_thrift cost:99
第4轮 序列化测试 thrift obj bytes:221043
userId=2138821863 thrift cost:233
userId=2138821863 zp_thrift cost:97
```

```
第1轮 反序列化测试 thrift obj bytes:221043
userId=561263874 thrift cost:295
userId=561263874 zp_thrift cost:208
第2轮 反序列化测试 thrift obj bytes:221043
userId=561263874 thrift cost:252
userId=561263874 zp_thrift cost:178
第3轮 反序列化测试 thrift obj bytes:221043
userId=561263874 thrift cost:249
userId=561263874 zp_thrift cost:172
第4轮 反序列化测试 thrift obj bytes:221043
userId=561263874 thrift cost:252
userId=561263874 zp_thrift cost:174
第5轮 反序列化测试 thrift obj bytes:221043
userId=561263874 thrift cost:250
userId=561263874 zp_thrift cost:172
```
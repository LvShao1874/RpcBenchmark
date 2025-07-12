# RpcBenchmark

brpc 官方性能测试:
https://brpc.apache.org/zh/docs/benchmark/
结论: c++版 brpc > thrift > grpc

dubbo性能 第三方测试:
https://cloud.tencent.com/developer/article/1511352
结论: thrift > grpc > dubbo

初步结论:
thrift是java,c++等多语言通信下性能优秀的RPC框架.

本demo将测试对比原版thrift在序列化层面的耗时.
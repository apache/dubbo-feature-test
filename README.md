# 简介
此工程定位为dubbo特性的测试工程，可以基于当前内容任意增加模块、文件等用于测试已有的dubbo功能。期望最终所有dubbo特性的使用方式在这个工程都有代码示例，甚至能够一键执行集成测试并统计执行结果。  
Github issue中有疑问、有争议的点，大家也可以通过做示例Pull Request等方便实例交流。
# 使用方法
## 启动
* provider参数配置: -Dconfig.file=provider
* consumer参数配置：-Dconfig.file=consumer
## 打包
请参考spring boot打包运行方法
## 访问入口
http://localhost:8080/testcase/all
# 期待
从集成测试层面，如何组织用例、自动化测试、自动化统计测试结果等是这个工程欠缺的，期待熟悉的同学提代码、思路或建议。


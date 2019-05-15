## nacos 框架研究

Nacos是阿里出品的一款微服务的框架，Nacos 致力于帮助您发现、配置和管理微服务。Nacos 提供了一组简单易用的特性集，帮助您快速实现动态服务发现、服务配置、服务元数据及流量管理。

### 搭建基于springcloud的微服务框架
由于Nacos去年8月份才开始研发，截止到今年4月发布1.0.0的正式版本，个人感觉目前并不是特别成熟，另外一方面有了dubbo的前车之鉴，nacos是否能一直维护下去，也成为大多数公司是否采用它的一个重要的方面。

本框架采用的版本如下：
* `spring boot`           2.0.3.RELEASE
* `spring cloud`          Finchley.RC1
* `nacos`                 1.0.0
* `nacos discovery`       0.2.1.RELEASE
* `spring cloud gateway`  2.0.3.RELEASE

笔者结合在搭建的过程的一些问题，做如下分享：
1) `springboot`不能采用2.1.x版本，这样会导致服务无法注册到nacos注册中心；
2) `nacos-discovery 0.2.x.RELEASE`对应的springcloud版本为Finchley；
3) 使用网关时，`spring-cloud-starter-gateway`与`spring-boot-starter-web`不能同时引入，会报错，所以使用网关时，不要引入`spring-boot-starter-web`

我这几天会持续加入`hystrix`,`skywalking`,`ELK`,`OSS`,`OAuth2`，同时也会考虑加入nacos github维护团队，共同为开源社区贡献一份力量。
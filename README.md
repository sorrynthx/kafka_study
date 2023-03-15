# kafka_study
kafka study / kafka: v3.4 / zookeeper: v3.8

Before study,

1. 
zookeeper 설치

[https://www.apache.org/dyn/closer.lua/zookeeper/zookeeper-3.8.1/apache-zookeeper-3.8.1-bin.tar.gz](https://www.apache.org/dyn/closer.lua/zookeeper/zookeeper-3.8.1/apache-zookeeper-3.8.1-bin.tar.gz)

다운로드 후 압축해제


2. 
conf 파일 이동 후 설정 복사 
cp zoo_sample.cfg zoo.cfg


3. 
zookeeper 실행
bin/zkServer.sh start-foreground


4. 
kafka 설치

[https://kafka.apache.org/downloads](https://kafka.apache.org/downloads)

다운로드 후 압축해제

5. 
kafka 실행

bin/kafka-server-start.sh config/server.properties

6. 
topic 생성

bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

quickstart-events : 토픽 이름

7. 
topic 확인

bin/kafka-topics.sh --list --bootstrap-server localhost:9092

8. 
Spring STS 에서 프로젝트 initializer [https://start.spring.io/](https://start.spring.io/)

dependency 는 **Spring for Apache Kafka 포함**

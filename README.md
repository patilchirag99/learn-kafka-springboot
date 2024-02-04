Learning Springboot kafka


In this project "deliveryclient" creates some random location values using Math.random() and publishes to the Kafka server runnning on the local machine.
"enduser" acts as the client who recieves this data from the kafka server. 



We can imagine this as a realtime location tracking where delivery partner send location values and the enduser recieves it.



Start zookeeper -  bin/zookeeper-server-start.sh config/zookeeper.properties 
Start Kafka server - bin/kafka-server-start.sh config/server.properties 

1. Create new topic with kafka-topics. { bin/kafka-topics.sh --create --topic user-topic --bootstrap-server localhost:9092}

2. Produce example message with kafka-console-producer {bin/kafka-console-producer.sh --topic user-topic --bootstrap-server localhost:9092}

3. Consume message with kafka-console-consumer {bin/kafka-console-consumer.sh --topic user-topic --from-beginning --bootstrap-server localhost:9092}

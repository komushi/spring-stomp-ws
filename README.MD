# Stomp Server over WebSocket by Spring Boot


----------
Default Configuration
-------------
###Port & Endpoint
8080 if run by the embedded web server from spring boot.
80 if run on CF or other containers.

ws://localhost:8080/endpoint

###Queue for text messages
/topic/textgreetings

###Controller's annotation method to receive text message
/topic/textgreet

###Queue for json messages
/topic/jsongreetings

###Controller's annotation method to receive json message
/topic/jsongreet

----------
Run the WebSocket Server
-------------
###download & build & run with java cli

```
git clone https://github.com/komushi/spring-stomp-sockjs.git
cd spring-stomp-sockjs
mvn clean pacakge
java -jar target/StompSockJS-0.0.1-SNAPSHOT.jar
```


###run it from any IDE

----------
Work with the WebSocket Client
-------------
The following node.js WebSocket Client demo works with this server demo.

```
git clone https://github.com/komushi/stomp-client-samples
cd stomp-client-samples
npm install
node.js stomp-over-ws-spring.js
```
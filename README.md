### websocket & spring native demo
- example usage of spring websocket stomp, with a very simple config and setup.
- stable connection, using heartbeat to automatically renew lost connection. 
- stomp makes it a simple message broker, without any additional binary or port allocation.
- there is no persistence mechanism, so if that's your need - use another message broker(eg. rabbitmq, nats, kafka...)

##### reqs:
- jdk17 installed.
- to test the application, I used the [apic client](https://www.apic.app/), but you can use any.

##### to run: 
- clone the repo
- run `./mvnw spring-boot:run`

##### to test: 
- connection-url: ws://localhost:8080/ws
- subscription endpoint: /topic/sort-names
- destinations: /app/names

##### notes:
- the config values(heartbeat, threadnameprefix, topics and destination prefixes are arbitrary, you can change if needed).
- it's strictly for learning purposes, for production I'd add tests, setup config vars in application.properties or/and env vars and maven profiles.

##### todo:
- add native-image executable and docker image support and docs. when I get the time...

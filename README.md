java -Dspring.aot.enabled=true -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image -jar ./target/smart-cart-monolith-2.5.0.jar

### websocket & spring native demo
.PHONY: build run

build:
	./gradlew clean jar

run:
	java -jar build/libs/kotlin-playground.jar

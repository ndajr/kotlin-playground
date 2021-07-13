.PHONY: nativeBuild build run

export IMAGE_NAME=neemiasjnr/kotlin-playground

nativeBuild:
	./gradlew clean build -Dquarkus.package.type=native -Dquarkus.native.container-build=true

build:
	docker build -t ${IMAGE_NAME} .

run:
	docker run -i --rm -p 8080:8080 ${IMAGE_NAME}

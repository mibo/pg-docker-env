#!/usr/bin/env bash
# Simple run script to build the war, build the docker image, run the container (image) and if quit remove the container
mvn package
docker build -t mibo/pg-docker-service .
# run docker container and remove it afterwards
docker run -it --rm -p 8088:8080 mibo/pg-docker-service
# alternative for daemon and named docker container
#docker run -d --name pg-docker-service -p 8088:8080 mibo/pg-docker-service
#curl http://localhost:8088/pg-jee-service/service/id
#curl http://localhost:8088/pg-jee-service/service/health
#docker logs pg-docker-service
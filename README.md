```
docker build -t kuber-healthcheck .
docker run -p 8080:8080 -p 8000:8000 kuber-healthcheck
docker image tag kuber-healthcheck mosin/kuber-healthcheck:v1
docker push mosin/kuber-healthcheck:v1

```
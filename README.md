# Spring com Redis

## Docker
Executar o seguinte comando para criar um container redis:

```text
docker run --name my-redis -p 6379:6379 -d redis
```

## Comandos Redis

```text
docker exec -it my-redis sh
redis-cli
key *
get products::1
```

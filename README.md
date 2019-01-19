# myPetClinic

## logging to local ELK stack in Docker

git clone https://github.com/deviantony/docker-elk.git

### First time create and setup
add the folowing to logback.conf:
```
filter {
  json {
    source => "message"
  }
}
```

cd /docker-elk
docker-compose up -d

### Stop and Start ELK Stack after first time setup

docker-compose stop

docker-compose start

### Access locla Kibana

http://localhost:5601
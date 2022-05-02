cd app && mvn clean package && cd ..
# docker build ./postgres -t ricardojob/banco:3
# docker build ./app -t ricardojob/app:5 --rm
# docker run -p 5433:5432 --name banco -d ricardojob/banco:3
# docker run -p 8080:8080 --name app -d --link banco:host-banco ricardojob/app:5
docker-compose up --build -d
# docker container kill app
# docker container rm app
# docker image rm -f ricardojob/app:5
# cd app && mvn clean && cd ..

# docker container kill banco
# docker container rm banco
# docker image rm -f ricardojob/banco:3
docker-compose down --rmi all
cd app && mvn clean && cd ..



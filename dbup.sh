docker container stop restbase
docker container rm restbase
docker run -d -p 27018:27017 --name restbase mongo:latest
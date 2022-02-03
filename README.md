# Ficticius-clean
Teste Consumo Combustivel

# Etapas
Faça o clone do projeto em seguida execute:
mvn clean package

##Para iniciar o docker basta utilizar o comando 
  docker-compose up-d
  ##Caso queira verificar a tabela
    docker exec -it mysql mysql -ugerenciacombustivel -pgerenciacombustivel
    
 # Link do Swagger
http://localhost:8080/swagger-ui.html
    Nesse caso o usuário será redirecionado para outra url pois foi utilizado o OpenApi pois apenas o swagger não é compativel com a versao do Spring Tool Suite que foi 
 utilizado nese projeto. 

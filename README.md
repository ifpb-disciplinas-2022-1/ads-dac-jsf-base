# JSF

Este projeto contém um projeto base para o desenvolvimento dos conteúdos e assuntos relacionados ao JSF.

## Executando o projeto

Para executarmos o código precisamos realizar o clone do projeto. Posteriormente, na pasta raiz do projeto, executar os seguintes comandos (ou executar o _script_ `run.sh`):
* `mvn clean package`
* `docker image build -t ricardojob/app .`
* `docker container run -p 8081:8080 --name app ricardojob/app`

A aplicação está disponível no link: `http://localhost:8081/app/`. 

> Importante observar o mapeamento das portas feita no momento de iniciar o container. Com a configuração apresentada teremos o seguinte comportamento: quando uma requisição ocorrer para porta (8081) do __host__ (máquina com o docker instalado), a requisição será redirecionada à porta (8080) do container.

## Roteiro de estudos


Temos um roteiro de apoio para revisar os conteúdos apresentados. Neste [roteiro]() temos **oito** requisitos que após serem implementados, temos revisado todos os principais conceitos do framework Java ServerFaces.

<!-- Temos um roteiro de apoio para revisar os conteúdos apresentados. Neste [roteiro](https://docs.google.com/document/d/1qjF9LxVsnIU8R0Ad3z1T5acijp4RUB52BSF70p3cqPg/edit) temos **oito** requisitos que após serem implementados, temos revisado todos os principais conceitos do framework Java ServerFaces. -->
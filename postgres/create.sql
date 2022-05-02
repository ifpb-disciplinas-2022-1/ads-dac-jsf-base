CREATE TABLE livros(
    id serial PRIMARY KEY, 
    titulo VARCHAR(80), 
    dataDeLancamento DATE
);
CREATE TABLE editoras(
    codigo SERIAL PRIMARY KEY, 
    localDeOrigem VARCHAR(100), 
    nomeFantasia VARCHAR(100)
);
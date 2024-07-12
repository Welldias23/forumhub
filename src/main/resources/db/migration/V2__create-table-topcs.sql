create table topcs(

      id serial primary key,
      titulo varchar(100) not null,
      mensagem varchar(150) not null,
      dataDeCriacao Date not null,
      usuarioId int not null,
      curso varchar(100) not null
);
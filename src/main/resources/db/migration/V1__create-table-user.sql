create table users(

      id serial primary key,
      login varchar(100) not null,
      password varchar(100) not null
);
create database notasalunobd;
use notasalunobd;

create table aluno(
RGM int auto_increment primary key,
nome varchar (100),
nota1 double,
nota2 double,
nota3 double,
media double
);
drop table aluno;

insert into aluno values(null,'adriana', 5.00, 10.00,4.00, null);
/*alter table aluno add COLUMN RGM;*/
select * from aluno ;
/* ACTIVAR SALIDA */
SET SERVEROUTPUT ON;

//BORRADO DE TABLAS

/*BEGIN
FOR cur_rec IN (SELECT table_name FROM user_tables)
LOOP
EXECUTE IMMEDIATE 'DROP TABLE ' || cur_rec.table_name || ' CASCADE CONSTRAINTS';
END LOOP;
END;*/

create table dept(
  deptno number(2,0),
  dname  varchar2(14),
  loc    varchar2(13),
  constraint pk_dept primary key (deptno)
);
 
create table emp(
  empno    number(4,0),
  ename    varchar2(10),
  job      varchar2(9),
  mgr      number(4,0),
  hiredate date,
  sal      number(7,2),
  comm     number(7,2),
  deptno   number(2,0),
  constraint pk_emp primary key (empno),
  constraint fk_deptno foreign key (deptno) references dept (deptno)
);

insert into dept
values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept
values(20, 'RESEARCH', 'DALLAS');
insert into dept
values(30, 'SALES', 'CHICAGO');
insert into dept
values(40, 'OPERATIONS', 'BOSTON');
 
insert into emp
values(
 7839, 'KING', 'PRESIDENT', null,
 to_date('17-11-1981','dd-mm-yyyy'),
 5000, null, 10
);
insert into emp
values(
 7698, 'BLAKE', 'MANAGER', 7839,
 to_date('1-5-1981','dd-mm-yyyy'),
 2850, null, 30
);
insert into emp
values(
 7782, 'CLARK', 'MANAGER', 7839,
 to_date('9-6-1981','dd-mm-yyyy'),
 2450, null, 10
);
insert into emp
values(
 7566, 'JONES', 'MANAGER', 7839,
 to_date('2-4-1981','dd-mm-yyyy'),
 2975, null, 20
);
insert into emp
values(
 7788, 'SCOTT', 'ANALYST', 7566,
 to_date('13-JUL-87','dd-mm-rr') - 85,
 3000, null, 20
);
insert into emp
values(
 7902, 'FORD', 'ANALYST', 7566,
 to_date('3-12-1981','dd-mm-yyyy'),
 3000, null, 20
);
insert into emp
values(
 7369, 'SMITH', 'CLERK', 7902,
 to_date('17-12-1980','dd-mm-yyyy'),
 800, null, 20
);
insert into emp
values(
 7499, 'ALLEN', 'SALESMAN', 7698,
 to_date('20-2-1981','dd-mm-yyyy'),
 1600, 300, 30
);
insert into emp
values(
 7521, 'WARD', 'SALESMAN', 7698,
 to_date('22-2-1981','dd-mm-yyyy'),
 1250, 500, 30
);
insert into emp
values(
 7654, 'MARTIN', 'SALESMAN', 7698,
 to_date('28-9-1981','dd-mm-yyyy'),
 1250, 1400, 30
);
insert into emp
values(
 7844, 'TURNER', 'SALESMAN', 7698,
 to_date('8-9-1981','dd-mm-yyyy'),
 1500, 0, 30
);
insert into emp
values(
 7876, 'ADAMS', 'CLERK', 7788,
 to_date('13-JUL-87', 'dd-mm-rr') - 51,
 1100, null, 20
);
insert into emp
values(
 7900, 'JAMES', 'CLERK', 7698,
 to_date('3-12-1981','dd-mm-yyyy'),
 950, null, 30
);
insert into emp
values(
 7934, 'MILLER', 'CLERK', 7782,
 to_date('23-1-1982','dd-mm-yyyy'),
 1300, null, 10
);

/* EJERCICIOS */

/* 1. Muestra por la salida el nombre de cada departamento junto al n�mero de 
empleados que tiene. */

/* 2. Obt�n el salario medio de los empleados y muestra por pantalla ese salario
medio junto al resultado del 21% de ese importe y para finalizar, poner la suma
del salario medio junto al 21% de dicho valor. Ej.: Importe de salario medio
1000, con 210 del 21% y total 1210. */

/* 3. Muestra por la salida el nombre y salario de los empleados que hayan sido
contratados en septiembre.*/

/* 4. Pide por la entrada de teclado un determinado mes y devuelve por la salida
el nombre del empleado que haya sido contratado en dicho mes. En el caso de que
no haya ninguno, mostrar el mensaje "No hay empleados que hayan sido contratados
en ese mes". */

/* 5. Se quiere hacer un bloque de c�digo an�nimo que pida todos los campos de
la tabla emp e introduzca dicho registro en la tabla. */

/* 6. Se quiere un c�digo de bloque an�nimo que borre registros de la tabla emp.
Para ello pedir� un c�digo empno por teclado, y si una vez comprobado que
existe, se borrar� de la tabla. Se debe mostrar un mensaje �No hay registros con
ese c�digo� cuando no haya empleados con ese empno. Si se borra el registro,
debes indicarlo por la pantalla con el mensaje �Se haborrado adecuadamente el
empleado�. */

/* 7. Se quiere saber el nombre de los empleados que hayan sido contratados en
un determinado mes. Para ello debes crear un bloque de c�digo an�nimo que pida
un mes por el teclado con letras. Con esa informaci�n debes obtener todos los
registros de la tabla emp cuyo hiredate haya sido en dicho mes, recuperar el
nombre y mostrarlo por la salida. */

/* 8. Se quiere saber cu�ntos empleados hay en cada departamento. Para ello crea
un bloque de c�digo an�nimo que pida por teclado el c�digo de departamento
deptno. Despu�s, habr� que comprobar que dicho c�digo existe o no en la tabla
dept mostrando un mensaje en caso positivo y otro en caso negativo.
Si hay departamentos con ese c�digo, se comprobar� que hay o no empleados de ese
departamento en la tabla emp, mostrando mensajes en ambos casos
(positivo y negativo). Para finalizar, s� y solo s� hay empleados de ese
departamento, debes calcular el n�mero de empleados que hay de ese departamento
e indicarlo en un mensaje como el que sigue �Hay xx empleados en ese
departamento�, donde xx es el n�mero obtenido del total de empleados de ese
departamento. */

/* 9. Se quiere saber el n�mero de veces de cierta vocal que tienen los nombres
de los empleados. Para ello se pedir� al usuario por teclado una vocal, que
habr� que comprobar inicialmente si realmente lo es o no. Si es vocal, se 
contar� cuantas veces aparece en cada nombre de cada empleado, indicando un 
mensaje como el que sigue: �KING tiene 1 vez la vocal i� donde se debe haber 
introducido inicialmente por teclado �i�. Deben mostrarse todos los empleados 
con el n�mero de veces que aparece la vocal introducida. */

/* 10. Se quiere un bloque de c�digo an�nimo que busque el empleado que tiene el 
nombre m�s largo y el que tiene el nombre m�s corto. En caso de coincidencia en 
el tama�o de los nombres, se pondr�n todos. */




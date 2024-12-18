//BORRADO DE TABLAS

/*BEGIN
FOR cur_rec IN (SELECT table_name FROM user_tables)
LOOP
EXECUTE IMMEDIATE 'DROP TABLE ' || cur_rec.table_name || ' CASCADE CONSTRAINTS';
END LOOP;
END;*/

//BD EMP-DEPT

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

/* 1. Mostrar los nombres de los empleados tengan un salario mayor que el de JAMES. */
SELECT ename, sal FROM emp WHERE sal > (SELECT sal FROM emp WHERE ename = 'JAMES');

/* 2. Mostrar los nombres de los empleados que trabajan en el mismo departamento que SMITH. Ordena el resultado por nombre. */
SELECT ename FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SMITH') ORDER BY ename;

/* 3. Mostrar los nombres de los empleados que trabajan en el mismo departamento que SMITH. Ordena el resultado. */
SELECT ename FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SMITH') ORDER BY ename DESC;

/* 4. Mostrar qu� empleados fueron contratados antes que MILLER. */
SELECT ename, hiredate FROM emp WHERE hiredate < (SELECT hiredate FROM emp WHERE ename = 'MILLER');

/* 5. Mostrar qu� empleados del departamento donde trabaja FORD, ganan m�s que lo que gana JAMES. */
SELECT ename, sal, deptno FROM emp WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'FORD') AND sal > (SELECT sal FROM emp WHERE ename = 'JAMES');

/* 6. Mostrar c�mo se llama el departamento donde trabaja SCOTT. */
SELECT dname FROM dept WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SCOTT');

/* 7. �Cu�ntos empleados ganan menos que MILLER? */
SELECT COUNT(*) FROM emp WHERE sal < (SELECT sal FROM emp WHERE ename = 'MILLER');

/* 8. �En qu� localidad trabaja KING? */
SELECT loc FROM dept WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'KING');

/* 9. �C�mo se llaman los departamentos en los que hay alg�n CLERK? */
SELECT dname FROM dept WHERE deptno IN (SELECT deptno FROM emp WHERE job = 'CLERK');

/* 10. �C�mo se llaman los departamentos en los que no hay ning�n ANALYST? */
SELECT dname FROM dept WHERE deptno NOT IN (SELECT deptno FROM emp WHERE job = 'ANALYST');
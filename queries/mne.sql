--polygon
insert into park(name, description, geometry) values ('Nacionalni park durmitor','nesto bzv',ST_GeomFromText('POLYGON((1 1,1 2,2 1,1 1))'));

insert into park(name, description, geometry) values ('Nacionalni Lovcen','nesto bzv',ST_GeomFromText('POLYGON((2 1,1 3,3 1,2 1))'));

select *
from
	park
	
	
select p.id from park as p order by p.id desc limit 1
	
select *
from 
	park_image
	
--point

insert into location(name, description, geometry) values ('Sokolovo grlo','nesto bzv',ST_GeomFromText('POINT(2 5)'));

select *
from
	location
	
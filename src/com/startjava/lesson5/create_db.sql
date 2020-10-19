--/CREATE TABLE

CREATE TABLE Jaegers(
	id 			SERIAL PRIMARY KEY,
	modelName 	TEXT,
	mark 		CHAR(6),
	height		DECIMAL,    
	weight 		DECIMAL,
	status 		VARCHAR(20),
	origin 		VARCHAR(20),
	launch 		DATE,
	kaijuKill 	INTEGER
	);
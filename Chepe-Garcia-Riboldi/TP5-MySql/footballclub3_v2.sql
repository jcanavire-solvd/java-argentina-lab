CREATE DATABASE IF NOT EXISTS base_football_club;

USE base_football_club;
CREATE TABLE IF NOT EXISTS player(
player_name VARCHAR(45),
adress VARCHAR(45),
PRIMARY KEY(player_name)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS stadium(
id_stadium INT NOT NULL,
capacity INT NOT NULL,
nick_name VARCHAR(45),
ocupation INT NOT NULL,
PRIMARY KEY(id_stadium)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS team(
team_name VARCHAR(45),
titular1 VARCHAR(45),
titular2 VARCHAR(45),
titular3 VARCHAR(45),
titular4 VARCHAR(45),
titular5 VARCHAR(45),
bench1 VARCHAR(45),
bench2 VARCHAR (45),
bench3 VARCHAR(45),
PRIMARY KEY(team_name),
CONSTRAINT fkplayer_name
FOREIGN KEY(titular1)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name1
FOREIGN KEY(titular2)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name2
FOREIGN KEY(titular3)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name3
FOREIGN KEY(titular4)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name4
FOREIGN KEY(titular5)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name5
FOREIGN KEY(bench1)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name6
FOREIGN KEY(bench2)
REFERENCES player(player_name),
CONSTRAINT fkplayer_name7
FOREIGN KEY(bench3)
REFERENCES player(player_name)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS football_club (
name Varchar(45),
trophys INT,
PRIMARY KEY(name),
id_stadium INT NOT NULL,
CONSTRAINT fkid_stadium
FOREIGN KEY(id_stadium)
REFERENCES stadium(id_stadium),
team_name VARCHAR(45),
CONSTRAINT fkteam_name
FOREIGN KEY(team_name)
REFERENCES team(team_name)
)ENGINE=INNODB;
 
 CREATE TABLE IF NOT EXISTS afiliate(
id_socio INT NOT NULL,
club VARCHAR(45),
precedes ENUM('YES', 'NO'),
PRIMARY KEY(club, id_socio),
CONSTRAINT fkclub
FOREIGN KEY(club)
REFERENCES football_club(name)
)ENGINE=INNODB;

CREATE TABLE IF NOT EXISTS positionn(
player_name VARCHAR(45),
position VARCHAR(45),
PRIMARY KEY(player_name),
CONSTRAINT fkplayer_name
FOREIGN KEY(player_name)
REFERENCES player(player_name)
)ENGINE=INNODB;


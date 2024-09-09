BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "User_Info" (
	"UserID"	INTEGER NOT NULL UNIQUE,
	"Username"	TEXT NOT NULL UNIQUE,
	"Password"	TEXT NOT NULL,
	"Email"	TEXT NOT NULL,
	"Phone Number"	INTEGER NOT NULL,
	PRIMARY KEY("UserID" AUTOINCREMENT)
);
INSERT INTO "User_Info" VALUES (1,'test1','testpwd','test@gmail.com',999999999);
INSERT INTO "User_Info" VALUES (2,'admin','admin','admin@admin.com',11111111);
COMMIT;

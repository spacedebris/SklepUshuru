DROP TABLE Szczegoly_transakcji;
DROP TABLE Transakcje;
DROP TABLE Pracownicy;
DROP TABLE Klienci;
DROP TABLE Towary;

CREATE TABLE Towary (
  Id_towaru NUMBER(10),
  Nazwa VARCHAR(32),
  Cena_net NUMBER,
  Stawka_VAT NUMBER,
  PRIMARY KEY (Id_towaru));
  
CREATE TABLE Klienci (
  Id_klienta NUMBER(10),
  Nazwisko VARCHAR(25),
  Imie VARCHAR(25),
  Miasto VARCHAR(25),
  Ulica VARCHAR(25),
  Telefon NUMBER(12),
  PRIMARY KEY (Id_klienta));

CREATE TABLE Pracownicy (
  Id_pracownika NUMBER(10),
  Nazwisko VARCHAR(25),
  Imie VARCHAR(25),
  Miasto VARCHAR(25),
  Ulica VARCHAR(25),
  Telefon NUMBER(12),
  Wyplata NUMBER,
  PRIMARY KEY (Id_pracownika));

CREATE TABLE Transakcje (
  Nr_transakcji NUMBER(10),
  Id_klienta NUMBER(10),
  Id_pracownika NUMBER(10),
  Data_zamowienia DATE default (sysdate),
  Data_odbioru DATE default (sysdate),
  Sposob_odbioru VARCHAR(10),
  Sposob_zaplaty VARCHAR(10),
  Rabat NUMBER,
  PRIMARY KEY (Nr_transakcji),
  FOREIGN KEY (Id_klienta) REFERENCES Klienci(Id_klienta),
  FOREIGN KEY (Id_pracownika) REFERENCES Pracownicy(Id_pracownika));

CREATE TABLE Szczegoly_transakcji (
  Nr_transakcji NUMBER(10),
  Ilosc NUMBER(5),
  Id_towaru NUMBER(10),
  PRIMARY KEY (Nr_transakcji),
  FOREIGN KEY (Id_towaru) REFERENCES Towary(Id_towaru));
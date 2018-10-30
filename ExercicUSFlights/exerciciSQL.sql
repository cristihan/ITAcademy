-- SQL Cristihan Valdiviezo Mayea

-- 1. Quantitat de registres de la taula de vols:
SELECT count(*) FROM flights;

-- 2. Retard promig de sortida i arribada segons l’aeroport origen.
SELECT avg(ArrDelay), avg(DepDelay) FROM flights group by Origin;


-- 3. Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen. A més,
-- volen que els resultat es mostrin de la següent forma (fixa’t en l’ordre de les files):
-- LAX, 2000, 01, retard
-- LAX, 2000, 02 , retard
-- LAX, 2000, 03 , retard

-- LAX, 2000, 12 , retard
-- LAX, 2001 , 01 , retard
-- LAX, 2001, 12 , retard
-- ONT , 2000 , 01 , retard
-- ONT, 2000, 02 , retard
-- etc
select origin, colYear, colMonth, avg(ArrDelay) as avgArrDelay from flights group by origin, colYear, colMonth order by origin;


-- 4. Retard promig d’arribada dels vols, per mesos i segons l’aeroport origen (mateixa
-- consulta que abans i amb el mateix ordre). Però a més, ara volen que en comptes
-- del codi de l’aeroport es mostri el nom de la ciutat.
-- Los Angeles, 2000, 01, retard
-- Los Angeles, 2000, 02, retard
select U.City, F.colYear, F.colMonth, avg(ArrDelay) as avgArreDelay from usairports U right join flights F on U.IATA = F.Origin group by U.City, F.colYear, F.colMonth;

select U.City, F.colYear, F.colMonth, avg(ArrDelay) as avgArreDelay from flights F left join usairports U on F.Origin = U.IATA group by U.City, F.colYear, F.colMonth;

select U.City, F.colYear, F.colMonth, avg(ArrDelay) as avgArreDelay from flights F, usairports U where F.Origin = U.IATA group by U.City, F.colYear, F.colMonth;


-- 5. Les companyies amb més vols cancelats. A més, han d’estar ordenades de forma
-- que les companyies amb més cancelacions apareguin les primeres.
select C.Description, sum(F.Cancelled)as Cancelled from flights F left join carriers C on  F.UniqueCarrier = C.CarrierCode group by C.description order by sum(F.cancelled) ASC;

-- 6. L’identificador dels 10 avions que més distància han recorregut fent vols.
select UniqueCarrier, FlightNum, avg(Distance) as Distance from flights group by UniqueCarrier, FlightNum Order by avg(Distance) DESC limit 10;

-- 7. Companyies amb el seu retard promig només d’aquelles les quals els seus vols
-- arriben al seu destí amb un retràs promig major de 10 minuts.
select UniqueCarrier, TailNum, avg(ArrDelay) as Retraso from flights group by UniqueCarrier order by avg(ArrDelay) DESC limit 10;
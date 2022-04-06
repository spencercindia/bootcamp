-- 20. The state abbreviation, and population of the largest city (name column 'city_population') of all states, territories, and districts.
-- Order the results from highest to lowest populations.
-- (56 rows)
SELECT population, state_abbreviation AS city_population
FROM city
GROUP BY state_abbreviation
ORDER BY population DESC;

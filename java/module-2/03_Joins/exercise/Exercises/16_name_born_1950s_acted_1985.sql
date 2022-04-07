-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
select distinct(person_name), birthday
from person
join movie_actor on person.person_id = movie_actor.actor_id
join movie using(movie_id)
where birthday >= '1950-01-01' and birthday < '1960-01-01' and release_date >= '1985-01-01' and release_date < '1986-01-01'
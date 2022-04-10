-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
select person_name, count(movie_actor.movie_id) as num_of_movies
from person
left join movie_actor on person.person_id = movie_actor.actor_id
where person_name LIKE 'George %'
group by person_name, person_id
order by person_name;
-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
select distinct title, person_name
from movie
join movie_actor using(movie_id)
join person on person.person_id = movie.director_id
where movie.director_id = movie_actor.actor_id;
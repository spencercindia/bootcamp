-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)
select title, tagline
from movie
join movie_actor using(movie_id)
join person on person.person_id = movie_actor.actor_id
join movie_genre using(movie_id)
join genre using(genre_id)
where genre_name = 'Family' and person_name = 'Samuel L. Jackson';
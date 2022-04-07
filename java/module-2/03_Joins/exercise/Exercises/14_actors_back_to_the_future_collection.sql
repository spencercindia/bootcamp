-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
select distinct(person_name)
from collection
join movie using(collection_id)
join movie_actor using(movie_id)
join person on movie_actor.actor_id = person.person_id
where collection_name = 'Back to the Future Collection';
-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT distinct(person_name)
from person
join movie on movie.director_id = person.person_id
join collection using(collection_id)
where collection_name = 'Harry Potter Collection'
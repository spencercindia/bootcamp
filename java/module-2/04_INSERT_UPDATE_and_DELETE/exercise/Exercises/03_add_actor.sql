-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)
insert into movie_actor (actor_id, movie_id)
values ((select person_id from person where person_name = 'Eric Stoltz'), (select movie_id from movie where title = 'Back to the Future'));



-- where movie_id = ((select movie_id from movie where title ilike 'Back to the Future'));

-- select * from movie join movie_actor using(movie_id) where actor_id = (select person_id from person where person_name = 'Eric Stoltz')
-- 4. The titles and taglines of all the movies that are in the Fantasy genre. Order the results by title (A-Z) (81 rows)
SELECT title, tagline
FROM genre
JOIN movie_genre USING(genre_id)
JOIN movie USING(movie_id)
WHERE genre_name = 'Fantasy'
ORDER BY title;
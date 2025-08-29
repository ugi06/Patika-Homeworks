-- First

SELECT title, rating FROM film
GROUP BY title , rating
ORDER BY rating;

-- Second

SELECT replacement_cost, COUNT(*)
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50 ;

--Third

SELECT store_id, COUNT(*)
FROM customer
GROUP BY store_id;

-- Fourth

SELECT country_id,COUNT(*)
FROM city
GROUP BY country_id
ORDER BY COUNT(*) DESC
LIMIT 1;
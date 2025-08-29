--First
SELECT DISTINCT replacement_cost FROM film;

-- Second
SELECT COUNT(DISTINCT replacement_cost) FROM film;

-- Third
SELECT COUNT(*) AS film_number
FROM film
WHERE title LIKE 'T%'
AND rating = 'G';

--Fourth

SELECT COUNT(*) AS five_digits_country
FROM country
WHERE LENGTH(country) = 5;

--Fifth

SELECT COUNT(*) AS end_with_R
FROM country
WHERE country ILIKE '%R';

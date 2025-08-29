--First

SELECT country FROM country
WHERE country LIKE 'A%a';

--Second

SELECT country FROM country
WHERE CHAR_LENGTH(country) >= 6 AND country LIKE '%n';

--Third

SELECT title FROM film
WHERE title ILIKE '%t%';

--Fourth

SELECT * FROM film
WHERE title LIKE 'C%'
AND length > 90
AND rental_rate = 2.99;
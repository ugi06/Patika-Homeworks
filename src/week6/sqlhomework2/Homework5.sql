-- First

SELECT title FROM film
WHERE title ILIKE '%n'
ORDER BY length
LIMIT 5;

--Second

SELECT title FROM film
WHERE title ILIKE '%n'
ORDER BY length
OFFSET 5
LIMIT 5;

-- Third

SELECT * FROM customer
WHERE store_id = 1
ORDER BY last_name DESC
LIMIT 4;
--First

SELECT COUNT(title) AS larger_films  FROM film
WHERE length >
(
SELECT AVG(length) FROM film
);

-- Second

SELECT COUNT(title) FROM film
WHERE rental_rate =
(
SELECT MAX(rental_rate) FROM film
);

-- Third

SELECT title FROM film
WHERE rental_rate =
(
SELECT MIN(rental_rate)
FROM film
)
OR
replacement_cost =
(
SELECT MIN(rental_rate)
FROM film
);

-- Fourth

SELECT customer_id, COUNT (*) FROM payment
GROUP BY customer_id
ORDER BY COUNT (*) DESC;
-- First

SELECT title , description
From film;


-- Second

SELECT * FROM film
WHERE film.length >60 OR film.length <70;


-- Third

SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost =28.99);

-- Fourth

SELECT last_name FROM customer
WHERE first_name = 'Mary';

-- Fifth

SELECT* FROM film
WHERE length < 50
AND rental_rate NOT IN (2.99, 4.99);
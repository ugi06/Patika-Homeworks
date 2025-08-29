-- First

SELECT ROUND(AVG(rental_rate) , 2)
FROM film;

-- Second

SELECT COUNT(title)
FROM film
WHERE title LIKE 'C%';

-- Third

SELECT MAX(length)
FROM film
WHERE rental_rate = 0.99;

-- Fourth

SELECT COUNT(DISTINCT replacement_cost)
FROM film
WHERE length > 150;
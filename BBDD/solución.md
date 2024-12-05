# Soluciones a los Ejercicios de SQLBolt

Este documento contiene las soluciones a los ejercicios planteados en el tutorial de SQLBolt. Puedes encontrar el tutorial completo en [SQLBolt](https://sqlbolt.com/).

---

## Lección 1: Introducción a SQL

**Enunciado:** Find the title of each film
**Solución:**

```sql
SELECT title FROM movies
```

**Enunciado:** Find the director of each film
**Solución:**

```sql
SELECT director FROM movies
```

**Enunciado:** Find the title and director of each film
**Solución:**

```sql
SELECT title,director FROM movies
```

**Enunciado:** Find the title and year of each film
**Solución:**

```sql
SELECT title,year FROM movies
```

**Enunciado:** Find all the information about each film
**Solución:**

```sql
SELECT * FROM movies
```

## SQL Lesson 2: Queries with constraints (Pt. 1)

**Enunciado:** Find the movie with a row id of 6
**Solución:**

```sql
SELECT * FROM movies WHERE id = 6;
```

**Enunciado:** Find the movies released in the years between 2000 and 2010
**Solución:**

```sql
SELECT * FROM movies WHERE year BETWEEN 2000 AND 2010;
```

**Enunciado:** Find the movies not released in the years between 2000 and 2010
**Solución:**

```sql
SELECT * FROM movies WHERE NOT year BETWEEN 2000 AND 2010;
```

**Enunciado:** Find the first 5 Pixar movies and their release year
**Solución:**

```sql
SELECT title,year FROM movies WHERE id < 6;
```

## SQL Lesson 3: Queries with constraints (Pt. 2)

**Enunciado:** Find all the Toy Story movies

**Solución:**

```sql
SELECT * FROM movies WHERE title LIKE 'Toy Story%';
```

**Enunciado:** Find all the movies directed by John Lasseter

**Solución:**

```sql
SELECT * FROM movies WHERE director = 'John Lasseter';
```

**Enunciado:** Find all the movies (and director) not directed by John Lasseter

**Solución:**

```sql
SELECT title,director FROM movies WHERE director NOT LIKE 'John Lasseter'
```

**Enunciado:** Find all the WALL-\* movies

**Solución:**

```sql
SELECT * FROM movies WHERE title LIKE 'WALL-_'
```

## SQL Lesson 4: Filtering and sorting Query results

**Enunciado:** List all directors of Pixar movies (alphabetically), without duplicates

**Solución**

```sql
SELECT DISTINCT director FROM movies ORDER BY director;
```

**Enunciado:** List the last four Pixar movies released (ordered from most recent to least)

**Solución**

```sql
SELECT * FROM movies ORDER BY year DESC limit 4;
```

**Enunciado:** List the first five Pixar movies sorted alphabetically

**Solución:**

```sql
SELECT * FROM movies ORDER BY title limit 5
```

**Enunciado:** List the next five Pixar movies sorted alphabetically

**Solución:**

```sql
SELECT * FROM movies ORDER BY title limit 5 OFFSET 5
```

## SQL Review: Simple SELECT Queries

**Enunciado:** List all the Canadian cities and their populations

**Solución:**

```sql
SELECT * FROM north_american_cities WHERE Country = 'Canada';
```

**Enunciado:** Order all the cities in the United States by their latitude from north to south

**Solución:**

```sql
SELECT * FROM north_american_cities WHERE country = 'United States' ORDER BY Latitude DESC;
```

**Enunciado:** List all the cities west of Chicago, ordered from west to east

**Solución:**

```sql
SELECT * FROM north_american_cities WHERE longitude < -87.629798 ORDER BY Longitude
```

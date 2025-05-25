-- Users Table
CREATE TABLE Users (
    user_id INT PRIMARY KEY,
    full_name VARCHAR(100),
    city VARCHAR(100)
);

-- Events Table
CREATE TABLE Events (
    event_id INT PRIMARY KEY,
    title VARCHAR(200),
    city VARCHAR(100),
    start_date DATETIME,
    status ENUM('upcoming', 'completed', 'cancelled')
);

-- Registrations Table
CREATE TABLE Registrations (
    registration_id INT PRIMARY KEY,
    user_id INT,
    event_id INT
);
-- Users
INSERT INTO Users (user_id, full_name, city) VALUES
(1, 'Alice Johnson', 'New York'),
(2, 'Bob Smith', 'Los Angeles'),
(3, 'Charlie Lee', 'Chicago');

-- Events
INSERT INTO Events (event_id, title, city, start_date, status) VALUES
(1, 'Tech Innovators Meetup', 'New York', '2025-06-10 10:00:00', 'upcoming'),
(2, 'AI & ML Conference', 'Chicago', '2025-05-15 09:00:00', 'completed'),
(3, 'Frontend Bootcamp', 'Los Angeles', '2025-07-01 10:00:00', 'upcoming');

-- Registrations
INSERT INTO Registrations (registration_id, user_id, event_id) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 2, 3);
SELECT 
    u.full_name,
    e.title AS event_title,
    e.city,
    e.start_date
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
  AND u.city = e.city
ORDER BY e.start_date;

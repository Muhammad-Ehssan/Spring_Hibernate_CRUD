# Spring Boot CRUD Application with Hibernate and MySQL

This repository contains a CRUD (Create, Read, Update, Delete) application developed using Spring Boot framework with Hibernate for ORM (Object-Relational Mapping) and MySQL as the backend database.

## Endpoints

### GET /employees

This endpoint retrieves all employees from the database.

### GET /employee/{id}

This endpoint retrieves a specific employee by their ID from the database.

### POST /employee

This endpoint adds a new employee to the database. It expects a JSON payload containing details of the employee to be added.

### DELETE /employee/{id}

This endpoint deletes an employee from the database based on their ID.

### PUT /employee

This endpoint updates an existing employee's details in the database. It expects a JSON payload containing the updated details of the employee.

## Technologies Used

- Spring Boot
- Hibernate
- MySQL

## Usage

1. Clone the repository to your local machine.
2. Set up MySQL database and update the database configuration in the `application.properties` file.
3. Run the application using your preferred IDE or by executing `mvn spring-boot:run` command in the terminal.
4. Access the provided endpoints using an API testing tool like Postman or cURL.

## Contributions

Contributions are welcome! Please feel free to fork the repository and submit pull requests to suggest improvements or additional features.

## License

This project is licensed under the [MIT License](LICENSE).

# Railway Reservation System 

This guide provides step-by-step instructions to integrate the frontend and backend of the Railway Reservation System.

## Prerequisites

- Node.js and npm installed on your machine.
- Java Development Kit (JDK) installed.
- MySQL server installed and running.

## Backend Integration

Clone the backend repository from GitHub:
  ```bash
  git clone https://github.com/TrainReservationSystem/railway-reservation-system-backend.git
  ```

Open the backend project in your preferred IDE.

Configure the MySQL database connection in application.properties:

   ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
    spring.datasource.username=<username>
    spring.datasource.password=<password>
   ```

Run the backend application:

   ```bash
    ./mvnw spring-boot:run
   ```

Frontend Integration
Clone the frontend repository from GitHub:

```bash
git clone https://github.com/TrainReservationSystem/railway-reservation-system.git
```

Navigate to the frontend directory:

```bash
cd railway-reservation-system
```

Install dependencies:

```bash
npm install
```

Set the backend API URL in src/config.js:

```javascript
export const server = 'http://localhost:8080';
```

Run the frontend application:

```bash
npm start
```

Access the application in your browser at http://localhost:3000.


## Deployment

- Deploy the backend application to a server environment such as Apache Tomcat or any other servlet container.
- Deploy the frontend application to a web server or hosting service such as Netlify or Vercel.

## Contributing

- Fork the repository.
- Make your contributions.
- Create a pull request for review.

## Support

For any inquiries or support, please contact [w.vasanimeet@gmail.com](mailto:w.vasanimeet@gmail.com).


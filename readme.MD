# Quick Talk Service

## Overview
Quick Talk Service is a Spring Boot application that provides a WebSocket-based chat service.

## Prerequisites
- Java 11 or higher
- Gradle
- Node.js (for the frontend if applicable)

## Setup

### Clone the repository
```sh
git clone https://github.com/Sameersah/quick_talk_service.git
cd quick_talk_service
```

## Build the application

```sh
./gradlew build
```

## Running the application

### Start the Spring Boot application

```sh
./gradlew bootRun
```

The application will start on http://localhost:8085.  

### WebSocket Endpoint

The WebSocket endpoint is available at ws://localhost:8080/chat.  

### Configuration
WebSocket Configuration

The WebSocket endpoint is /chat.
The allowed origin for WebSocket connections is http://localhost:3000.
The message broker is configured with a simple broker on /topic and application destination prefixes on /app.

## Example WebSocket Message

`{
"sender": "user1",
"content": "Hello, World!"
}`

## Endpoints
- /app/message - Endpoint to send messages.
- /topic/messages - Endpoint to receive broadcast messages.

# Testing
You can use tools like Postman or WebSocket clients to test the WebSocket endpoints.  

# License
This project is licensed under the MIT License.

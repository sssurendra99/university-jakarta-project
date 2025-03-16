
# Jakarta EE Calculator Service

## Overview
A SOAP-based calculator web service built with Jakarta EE. This application provides basic arithmetic operations through a SOAP API endpoint.

## Project Structure
```
jakarta-ee-app/
├── .gradle/                    # Gradle cache and build data
├── .vscode/                    # VS Code configuration
├── app/                        # Main application module
│   ├── build/                  # Compiled output
│   └── src/                    # Source code
│       ├── main/
│       │   ├── java/
│       │   │   ├── com/
│       │   │   │   └── example/
│       │   │   │       ├── calculatorservice/  # Core calculator service
│       │   │   │       └── endpoint/           # Web service endpoints
│       │   │   └── org/
│       │   │       └── example/                # Additional classes
│       │   ├── resources/                      # Configuration files
│       │   └── webapp/                         # Web application files
│       │       └── WEB-INF/                    # Web configuration
│       └── test/                               # Test code
├── build/                      # Build reports
├── gradle/                     # Gradle wrapper
└── wrapper/                    # Gradle wrapper files
```

## Technologies Used
- Jakarta EE
- Java 21
- Gradle 8.13
- SOAP Web Services
- XML

## Prerequisites
- JDK 11+
- Gradle 8.x
- Jakarta EE compatible application server

## Building and Running

### Building the Project
```bash
./gradlew build
```
for windows users:

```bash
.\gradlew build
```

### Running the Application
Deploy the generated WAR file (located in `app/build/libs/`) to your Jakarta EE compatible application server.

The SOAP calculator service will be available at:
```
http://localhost:8088/calculator
```

## Usage Examples

### Addition Operation
**Request:**
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <web:add>
         <num1>212</num1>
         <num2>3</num2>
      </web:add>
   </soapenv:Body>
</soapenv:Envelope>
```

**Response:**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
   <S:Body>
      <ns:addResponse xmlns="http://calculatorservice.example.com/">
         <return>215</return>
      </ns:addResponse>
   </S:Body>
</S:Envelope>
```

## Testing
You can test the service using:
- Postman
- SoapUI
- curl
- Other SOAP client tools

## Development

### IDE Setup
This project is configured to work with VS Code. Open the project folder in VS Code to get started.


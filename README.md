# Java RMI Examples

A collection of Java Remote Method Invocation (RMI) applications demonstrating client-server communication and distributed computing concepts.

## Contents

This repository includes four RMI services:

1. **Calculator Service** - Performs basic arithmetic operations
2. **DateTime Service** - Retrieves current date and time from server
3. **Student Service** - Lookup student information by ID
4. **Multi-Service** - Demonstrates multiple methods in a single RMI service

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java RMI concepts

## How to Run

### 1. Calculator Service

**Compile:**
```bash
cd calculator
javac *.java
```

**Run Server:**
```bash
java CalcServer
```

**Run Client (in new terminal):**
```bash
java CalcClient
```

**Usage:**
- Enter two numbers when prompted
- Server performs add, subtract, multiply, and divide operations

---

### 2. DateTime Service

**Compile:**
```bash
cd datetime
javac *.java
```

**Run Server:**
```bash
java DateTimeServer
```

**Run Client (in new terminal):**
```bash
java DateTimeClient
```

**Output:**
- Displays current date and time from server in format: `dd-MM-yyyy HH:mm:ss`

---

### 3. Student Service

**Compile:**
```bash
cd student
javac *.java
```

**Run Server:**
```bash
java StudentServer
```

**Run Client (in new terminal):**
```bash
java StudentClient
```

**Usage:**
- Enter student ID (101, 102, or 103)
- Server returns student name and marks

**Available Students:**
- ID 101: Ramesh | Marks: 85
- ID 102: Suresh | Marks: 90
- ID 103: Mahesh | Marks: 78

---

### 4. Multi-Service

**Compile:**
```bash
cd multiservice
javac *.java
```

**Run Server:**
```bash
java MultiServer
```

**Run Client (in new terminal):**
```bash
java MultiClient
```

**Features:**
- Greeting message
- Addition and multiplication operations
- Server status with timestamp

## Key Concepts Demonstrated

- **Remote Interface** - Extends `java.rmi.Remote`
- **Implementation** - Extends `UnicastRemoteObject`
- **RMI Registry** - Running on port 1099
- **Naming Service** - Binding/lookup using `rmi://localhost/ServiceName`
- **Exception Handling** - All remote methods throw `RemoteException`

## Important Notes

- All servers use RMI registry on port **1099**
- Only one server can run at a time (they all use the same port)
- To switch services, stop the current server before starting another
- Ensure the RMI registry is created before binding the service

## Troubleshooting

**Port Already in Use:**
```
java.rmi.server.ExportException: Port already in use
```
- Stop any running RMI server before starting a new one

**Connection Refused:**
```
java.rmi.ConnectException: Connection refused
```
- Make sure the server is running before starting the client

**Class Not Found:**
```
java.lang.ClassNotFoundException
```
- Ensure all files are compiled and in the correct package structure

## Author

College Assignment - Java RMI

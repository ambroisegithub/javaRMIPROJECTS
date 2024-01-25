
Project Title: RMI-based Product Information System

1. Architecture of the Selected Middleware Service
The chosen middleware service for this project is Java RMI (Remote Method Invocation). RMI is a Java-based middleware technology that enables communication between objects distributed across multiple Java Virtual Machines (JVMs). In this project, RMI is used to implement a simple product information system with a client-server architecture.

Client Side (Client.java):


>>>>The client initiates communication by obtaining a reference to the RMI registry using LocateRegistry.getRegistry("127.0.0.1", 9100).

>>>> client then looks up the remote objects (products) from the registry and invokes their methods.


Server Side (Server.java, ProductImpl.java):

>>>>The server exports remote objects (ProductImpl) using UnicastRemoteObject.exportObject.

>>>Products are created as instances of the ProductImpl class, which implements the Product interface.

>>>>RMI registry (LocateRegistry.getRegistry("127.0.0.1", 9000)) is used to bind the remote objects for client lookup.


2. Operation of the System
The system operates as follows:

>>>>The server creates instances of different products (ProductImpl objects) such as laptops, mobiles, bags, and chargers.

>>>>Each product is exported as a remote object, making it accessible to clients over the network.

>>>>The server registers these products in the RMI registry with unique names like "laptop," "ram," "bag," and "charger."

>>>>The client retrieves these remote objects from the RMI registry using their names and invokes their methods (getName(), getDescription(), getPrice()).

>>>>The server responds to client requests by providing the relevant product information.


3. Advantages of the Selected Middleware Service over Others

Java RMI was selected for this project due to its several advantages:

>>>>Simplicity and Integration: RMI is native to Java, making it easy to integrate into Java applications. The simplicity of RMI allows for the straightforward implementation of remote communication.

>>>>Object-Oriented Approach: RMI enables the distribution of Java objects between client and server, preserving the object-oriented nature of Java programming. This simplifies the development process by allowing developers to work with familiar constructs.

>>>>Automatic Serialization: RMI handles object serialization and deserialization automatically, simplifying the process of passing objects between different JVMs.

>>>>Dynamic Invocation: Clients can dynamically invoke methods on remote objects as if they were local, enhancing flexibility and ease of use.

In summary, Java RMI offers a robust and straightforward solution for building distributed systems in Java, providing a good balance between simplicity and functionality.

This project showcases how Java RMI can be employed to implement a distributed product information system, allowing clients to retrieve details about various products from a remote server. The chosen architecture and middleware service provide a solid foundation for building scalable and maintainable distributed systems in Java.





Compile the entire project, including the shared interface:

javac Client/*.java
javac Server/*.java
javac shared-code/*.java


Run the Server:
Start the RMI registry and run the server:

rmiregistry 9000
java Server.Server


Run the client:

Copy code
java Client.Client
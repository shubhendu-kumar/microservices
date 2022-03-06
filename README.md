# microservices
A practice session on Docker based Micro-services using Spring Boot

Services: -
1. __Department Service__ -- Holds the information about departments
2. **User Service** -- Holds the information about users. Ever user tagged with 1 department  
3. **API-Gateway** -- A wrapper on top of above services to manage single entry point for services. It also has Circuit breaker logic to manage Fallbacks.
4. __Config-Server__ -- Fetch the generic configuration from external server.
5. __Registry-Server__ -- Eureka Server to manage all services.
  

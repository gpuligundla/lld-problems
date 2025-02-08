You are tasked with designing and implementing a ride-sharing application where passengers can request rides, and drivers can be matched to them based on proximity. The application should handle different types of vehicles (such as cars, bikes, luxury cars) and support multiple fare calculation strategies. The system must notify both passengers and drivers about ride statuses and calculate the fare based on the type of ride and distance traveled.

Your task is to design a clean, maintainable, and scalable solution using SOLID principles and appropriate Design Patterns. Follow the requirements carefully and ensure that your code adheres to good software design practices.

Constraints

The ride-matching algorithm must assign the nearest driver based on the distance between the passenger and driver.

You must implement at least three fare calculation strategies: Standard, Shared, and Luxury.

The system should be able to support different vehicle types: Car and Bike (with the option to extend for future vehicle types).

Notifications must be sent to both the passenger and driver as the ride progresses through different statuses (pending, ongoing, completed).

Expected Deliverables-
Explanation of how SOLID principles are applied and why certain design patterns (e.g., Strategy, Observer, Mediator) were used.

Source Code for the ride-sharing application with clean, modular, and maintainable code.

Test Cases to verify correct functionality of the ride-matching system, fare calculation, and notification system.
The Singleton Design Pattern ensures that a class has only one instance throughout the application lifecycle and provides a global access point to that instance.

This pattern is commonly used for shared resources such as configuration managers, logging services, database connections, and caching mechanisms.

Key Characteristics
*Private constructor to prevent external instantiation
*Static method to provide global access
*Single shared instance
*Can be implemented with lazy or eager initialization

When to Use
When exactly one object is required to coordinate actions across the system
When shared resources must be controlled centrally
The Singleton pattern helps maintain consistency, reduce memory usage, and ensure controlled access to critical resources.

There are different variations of singleton patterns
1) Lazy Initialization
2) Threadsafe
3) Double check locking
4) Cloning issue evading
5) Enum singleton

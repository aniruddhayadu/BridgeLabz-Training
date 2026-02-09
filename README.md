# Java8 and it's Features 


# 📅 (Date: 30-Jan-2026) : Lambdas, Method References & Scenario-Based Problems

Practiced functional programming concepts in Java using Lambda Expressions and Method References to write clean, concise, and readable code.


Covered:

 - Lambda expressions and functional interfaces
 - Method references (static, instance, constructor)
 - Stream-based filtering and transformations
 - Effective use of predicates, consumers, and functions


Solved real-world scenario-based problems involving advanced Java concepts:

 - HealthCheckPro – Used custom annotations and reflection to scan API methods and auto-generate metadata/documentation
 - MarkMate – Processed student marks from CSV files and generated JSON report cards with totals, averages, and grades
 - EventTracker – Built an audit system using annotations and reflection to generate structured JSON logs for user actions

Focused on practical usage of Annotations, Reflection, CSV & JSON data handling, and exception-safe design patterns.

🔗 **Code Link:**  
👉 [Lambdas and Method Reference](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/gcr-code-base/Java8Features/src/com/lambdaexpressions)

--- 

# 📅 (Date: 30-Jan-2026) : Interfaces & Functional Interfaces in Java, and Stream API Practice (Real-Time Employee Scenarios)

Practiced interface-based design and modern Java interface features.

Covered:

 - Defining and implementing interfaces
 - Interface best practices and ISP
 - Default and static methods
 - Method conflict resolution
 - Polymorphism and decoupling

Functional Interfaces:
 - SAM concept and @FunctionalInterface
 - Built-in functional interfaces
 - Custom functional interfaces
 - Lambda compatibility (SAM conversion)

Also explored marker interfaces vs annotations and common design pitfalls. Practiced Java 8 Stream API using a real-world Employee dataset to solve analytical and aggregation-based problems.
Worked on scenarios involving:
 - Counting male/female employees (overall & department-wise)
 - Extracting department names and grouping employees by department
 - Calculating average age and average salary (gender-wise & department-wise)
 - Finding highest, lowest, second/third highest & lowest paid employees
 - Identifying most experienced and youngest employees
 - Filtering employees based on joining year and salary thresholds
 - Retrieving top/bottom 5 highest and lowest paid employees
 - Computing total and average salary of the organization
  
Focused on effective usage of:
 - filter, map, sorted, limit
 - Collectors.groupingBy, partitioningBy, averagingDouble, counting
 - Comparator chaining and Optional handling

🔗 **Code Link:**  
👉 [Interfaces Practice](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/gcr-code-base/Java8Features/src/com/functionalInterfaces)
👉 [Stream API Employee Scenarios](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/scenario-based-codebase/Java8ScenarioBased/src)

--- 

# 📅 (Date: 30-Jan-2026) : Java Stream API & Parallel Streams

Practiced functional-style data processing using the Java Stream API.


Covered:

Stream pipeline structure (source → intermediate → terminal)
Intermediate operations: filter, map, sorted, distinct
Terminal operations: collect, forEach, count
Lazy evaluation and stateless vs stateful operations
Ordered vs unordered streams


Parallel Streams:

parallelStream() vs sequential stream
ForkJoinPool and multi-threaded execution
Order handling with forEachOrdered()
Performance considerations and best practices


Also practiced forEach() with lambdas and method references.

🔗 **Code Link:**  
👉 [Stream API Practice](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/gcr-code-base/Java8Features/src/com/streamAPI)

--- 

# 📅 (Date: 31-Jan-2026) : Collectors in Java Stream API

Explored the role and capabilities of Collectors used with the Stream.collect() method for data aggregation and transformation.


Covered:

Converting streams to collections using toList(), toSet(), toMap()
Transforming and aggregating stream data
Grouping elements using groupingBy()
Partitioning data using partitioningBy()
Joining stream elements into strings with joining()
Generating statistics using summarizingInt()


Practiced real-world scenarios including grouping, partitioning, mapping, and statistical summaries using Collectors.

🔗 **Code Link:**  
👉 [Collectors Practice](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/gcr-code-base/Java8Features/src/com/collectors)

--- 

# 📅 (Date: 01-Feb-2026) : Smart City Transport & Service Management System (Java 8)

Designed a real-world Smart City Transport & Service Management System leveraging core Java 8 features to build a modern, extensible, and clean architecture.
Worked on:

 - Using Lambda Expressions to filter and sort transport schedules (time, fare, availability)
 - Applying Method References for logging, printing services, and utility method calls
 - Designing interfaces with default & static methods for shared transport behavior
 - Implementing Stream API + forEach() to process and display live transport data
 - Using Collectors (groupingBy, partitioningBy, summarizingDouble) for analytics and revenue reports
 - Implementing Functional Interfaces with lambdas for dynamic fare calculation
 - Using Marker Interfaces to prioritize emergency services (ambulance, fire services)

Outcome:
 - Enabled real-time filtering, grouping, and summarization of transport data
 - Built a system easily extensible to new services (Ferry, Bike Rental) via interfaces
 - Demonstrated clean, scalable, and enterprise-ready Java 8 design principles

🔗 **Code Link:**  
👉 [Java 8 workshop](https://github.com/aniruddhayadu/BridgeLabz-Training/tree/java8-programmming-practice/java8-programmming-practice/gcr-code-base/Java8Features/src/com/java8workshop/smartcitytransport)

--- 


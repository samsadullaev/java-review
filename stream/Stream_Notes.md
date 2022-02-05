##    Stream 

`map()`-takes `Stream<T>` and returns `Stream<T>`. It mapper function produces single value for each input value. It is called. One-To-One mapping.  

`flatMap()`- takes `Stream<Stream<T>>` as input and returns Stream<T>.It is mapper function produces multiple value for each input value.It is called One-To-Many mapping. 


````java
 Stream.of(1,2,3,4);  ->  [1,2,3,4] 
 [[1,2],[3,4],[5,6],[7,8]] -> [1,2,3,4,5,6,7,8]
````


### Java Collectors

`toCollection(Supplier)` : is used to create a collection using collector.  

           List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
           System.out.println(numberList);


`toList() `: returns a Collector interface that gathers the input data into a new list.  

          System.out.println("*******TOLIST()*******");
           List<Integer>numberList2=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
           System.out.println(numberList2);

`toSet()`: returns a Collector interface that gathers the input data into a new set

          System.out.println("*******TOSET()*******");
           Set<Integer>numberSet2=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
          System.out.println(numberSet2);
  `toMap(Function, Function)` : returns a collector interface that gathers the input data into a new map

        System.out.println("*******TOMAP()*******");
        Map<String,Integer>dishMap=DishData.getAll().stream()
                .collect(Collectors.toMap(Dish ::getName, Dish::getCalories));
        System.out.println(dishMap);


 `counting()` : returns a Collector that counts the number of the elements  

         Long eventCount = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.counting()); 
         System.out.println(eventCount);

  `summingInt(ToIntFunction) `: returns a Collector that produces the sum of a integer-valued function.  

         System.out.println("********SUMMINGINT()***********");
          Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

           System.out.println(sum);

`averageingInt(ToIntFunction)` : returns the average of the integers passed values

        System.out.println("*******AVERAGEINGINT()******");
        Double calorieAvg =  DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAvg);

`joining() `: is used to join various elements of a character or string array into a single string object

        System.out.println("********JOINING()***********");
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str =  courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);


`partioningBy() :` is used to partition a stream of objects(or set of elements) based on a given predicate

        System.out.println("********PARTIONINGBY()***********");
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);       

`groupingBy() :` is used for groping objects by some property and storing results in a map instance

        System.out.println("********GROUPINGBY()***********");
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

        
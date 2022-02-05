import java.util.Optional;

import static java.util.Comparator.comparing;


public class TransactionTest {

    public static void main(String[] args) {
        //1.Find all transactions in the year 2011 and sort them by value(small to high)
        System.out.println("******Task-1*****");
        TransactionData.getAllTransactions().stream()
                .filter(each->each.getYear()==2011)
                .sorted(comparing(each->each.getValue()))
                .forEach(System.out::println);

        //2. What are all the unique cities where the traders work?
        System.out.println("******Task-2*****");
        TransactionData.getAllTransactions().stream()
                .map(each->each.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("******Task-3*****");
        TransactionData.getAllTransactions().stream()
                .filter(each->each.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(comparing(Trader ::getName))
                .forEach(System.out::println);

        //4. Return a string of all traders’ names sorted alphabetically.
        System.out.println("******Task-4*****");
        String result = TransactionData.getAllTransactions().stream()
                .map(each -> each.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2+" ");
        /// .forEach(each-> System.out.print(each + " "));
        System.out.println(result);

        System.out.println();

        //5. Are any traders based in Milan?
        System.out.println("******Task-5*****");
     //   TransactionData.getAllTransactions().stream()
         //       .filter(each-> each.getTrader().getCity().equals("Milan"))
           //     .forEach(System.out::println);
        boolean milanBased = TransactionData.getAllTransactions().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);


        //6. Print the values of all transactions from the traders living in Cambridge.
        System.out.println("******Task-6*****");
        TransactionData.getAllTransactions().stream()
                .filter(each->each.getTrader().getCity().equals("Cambridge"))
                .map(each->each.getValue())
                .forEach(System.out::println);

        //7. What is the highest value of all the transactions?
        System.out.println("******Task-7*****");
        Optional<Integer> maxValue = TransactionData.getAllTransactions().stream()
                .map(each->each.getValue())
                .reduce(Integer::max);
        System.out.println("Max value: " + maxValue.get());

        //8. Find the transaction with the smallest value.
        System.out.println("******Task-8*****");
        Optional<Transaction> minValue = TransactionData.getAllTransactions().stream()
                .reduce((t1,t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(minValue.get());


        Optional<Transaction>smallestValue=TransactionData.getAllTransactions().stream().min(comparing(Transaction::getValue));
        System.out.println(smallestValue.get());

    }
}

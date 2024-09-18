package makkajaiDevchallengeTask;

	import java.util.Arrays;
	import java.util.List;

	public class Generic {

	    public static void main(String[] args) {
	        // Example input, normally this would come from user input or a file
	        List<Products> items1 = Arrays.asList(
	            new Products("book", 12.49, false),
	            new Products("music CD", 14.99, false),
	            new Products("chocolate bar", 0.85, false)
	        );

	        List<Products> items2 = Arrays.asList(
	            new Products("imported box of chocolates", 10.00, true),
	            new Products("imported bottle of perfume", 47.50, true)
	        );

	        List<Products> items3 = Arrays.asList(
	            new Products("imported bottle of perfume", 27.99, true),
	            new Products("bottle of perfume", 18.99, false),
	            new Products("packet of headache pills", 9.75, false),
	            new Products("box of imported chocolates", 11.25, true)
	        );

	        System.out.println("Output 1:");
	        ReceiptGenration.printReceipt(items1);

	        System.out.println("\nOutput 2:");
	        ReceiptGenration.printReceipt(items2);

	        System.out.println("\nOutput 3:");
	        ReceiptGenration.printReceipt(items3);
	    }
	}

package basic.problems.array;

public class StockProfit {
    public static void main(String[] args) {
        int[] arr = {20,40,50,30,80,200,300,500};
        int bought = arr[0];
        int max = 0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                max = arr[i];
            }else {
                max = arr[i+1];
            }
        }

        System.out.println("Max value of stock: " + max);
        System.out.println("profit: " + (max-bought));
    }
}

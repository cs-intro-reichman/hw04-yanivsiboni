public class Primes {
    public static void main(String[] args) {
        int userNumber = Integer.parseInt(args[0]);
        int primeCounter = 0;
        boolean arr[] = new boolean[userNumber + 1];
        arr[0] = false;
        for (int i = 2; i < arr.length;i++)
            arr[i] = true;
        for (int i = 2; i < arr.length;i++){
            for(int j = 2; j < arr.length; j++){
                if ((j % i == 0) && (j != i) && (arr[j] == true)) {
                    arr[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + userNumber + ":");
        for (int i = 0; i < arr.length; i++){
            if (arr[i]){
                primeCounter += 1;
                System.out.println(i);
            }
        }
        System.out.println("There are " + primeCounter + " primes between 2 and " + userNumber + "(" + (int)(((double)primeCounter / (double)userNumber) * 100) + "% are primes)");
        
    }
}
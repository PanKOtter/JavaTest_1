import java.util.ArrayList;
import java.util.Collections;

class slidingWindow {

    static ArrayList<Integer> minima(int arr[], int n, int k) {
        ArrayList<Integer> minima = new ArrayList<>();
        /**the calculated minimum value
         * is kept here
         */

        ArrayList<Integer> min_window = new ArrayList<>();
        /**the sliding  window
         *  is size k
         *  remains the same
         */
        if (n < k) {
            System.out.println("Invalid");
        }
        int ind = k;
        /** shows which array element
         * will be examined next
          */

        int g = 1;
        while ((minima.size()) <= 3 & ind<=n) {

            if (g == 1) {
                for (int j = 0; j < k; j++) {
                    minima.add(arr[j]);
                }
            }
            min_window.add(Collections.min(minima)); //calculate min value
            //System.out.println(minima.contains(arr[n]));??
            minima.remove(0);
            if(ind==n){
                break;
            }
            minima.add(arr[ind]);


            ind += 1;

            g +=1;
        }
        System.out.print("The final result is:  ");
        return min_window;
    }
        public static void main (String[] args){
            int arr[] = {5, 1, 3, 2, 6, 8, 4, 6};
            int k = 3;
            int n = arr.length;
            System.out.println(minima(arr, n, k));
        }
    }

package statistics;

public class Min {
	// getting the miniumum value
		public static int getMinValue(int[] array) {
		    int minValue = array[0];
		    for (int i = 1; i < array.length; i++) {
		        if (array[i] < minValue) {
		            minValue = array[i];
		        }
		    }
		    return minValue;
		}
}
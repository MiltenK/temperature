public class Main {
    public static void main(String[] args) {


//        int dayCount = Integer.parseInt(arr[0]) + 1;

        int maxi = getMaxDuration();
        System.out.println(maxi);
    }

    private static int getMaxDuration() {
        int[] degree = convertToInts();
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] > 0){
                count++;
            }
            else{
                if (count>maxi){
                    maxi = count;
                    count = 0;
                }
            }
        }
        return maxi;
    }

    public static int[] convertToInts(){
        String[] arr = ArrayReader.execute();
        int[] degree = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            degree[i - 1] = Integer.parseInt(arr[i]);
        }
        return degree;
    }
}
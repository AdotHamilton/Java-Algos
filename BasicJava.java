import java.util.*;
public class BasicJava {

    public void printNums() {
        for (int i = 0; i< 256; i++){
            System.out.println(i);
        }
    }

    public void printOddNums() {
        for (int i = 0; i< 256; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void printSum(){
        int sum = 0;
        for(int i=0; i<256; i++){
            sum += i;
            System.out.println("New number: "+ i + " Sum: "+ sum);
        }
    }

    public void printArrayVals(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void printMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
    }

    public void iterateArray(int[] arr) {
        for (int i : arr) {
            int x = i;
            System.out.print(x + " ");
        }
    }

    public void printAvg(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum / arr.length);
    }

    public void populateArray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<256; i++){
            if(i % 2 != 0){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
    public void greaterThanY(int[] arr, int y){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }

    public String squareVals(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        return Arrays.toString(arr);
    }

    public String removeNegatives(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }

    public String maxMinAvg(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int avg = sum / arr.length;
        int[] newArr = {max, min, avg};
        return Arrays.toString(newArr);
    }
    
    public String shiftArr(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
            
        }
        arr[arr.length-1] = 0;
        return Arrays.toString(arr);
    }
}
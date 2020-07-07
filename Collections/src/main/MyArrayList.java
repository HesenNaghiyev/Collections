package main;

public class MyArrayList {

    private String [] arr =new String[10];
    int addedElementLength =0;

    public void add(String element){
        if (arr.length==addedElementLength){
            String [] arr2 =new String[arr.length/2+arr.length];
            for (int  i =0; i<arr.length; i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
        arr[addedElementLength++]=element;
    }


    public String getIndex(int i){
        return arr[i];
    }

    public int size(){
        return addedElementLength;
    }


}

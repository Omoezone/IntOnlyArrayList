package com.company;

public class IntOnlyArrayList {
    int[] data;

    public IntOnlyArrayList(int[] data) {
        this.data = data;
    }

    public int size(){
        return data.length;
    }
    public int get(int index){
        return data[index];
    }
    public void remove(int index){

    }
    public void add(int index){
        int[] copyData = new int[data.length+1];
        for(int i = 0; i < data.length;i++){
            data[i] = copyData[i];
        }
        copyData[data.length] = index;
        System.arraycopy(copyData,0,data,0,copyData.length-1);
        data = copyData;
    }

}

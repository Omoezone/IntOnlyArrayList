package com.company;

public class IntOnlyArrayList {
    int[] data;
    boolean flag;

    public IntOnlyArrayList() {
        this.data = new int[1];
        flag = true;
    }

    public int size(){
        return data.length;
    }
    public int get(int index){
        return data[index];
    }
    public void remove(int index){
        for(int i = 0; i < data.length; i++){
            if(data[i] == index){
                // shifting elements
                for(int j = i; j < data.length - 1; j++){
                    data[j] = data[j+1];
                }
                break;
            }
        }
        int[] copyData = new int[data.length-1];
        System.arraycopy(data, 0, copyData, 0, data.length - 1);
        data = copyData;
    }
    public void add(int index){
        if(flag){
            data[0] = index;
            flag = false;
        }else {
            int[] copyData = new int[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                copyData[i] = data[i];
            }
            copyData[data.length] = index;
            System.arraycopy(copyData, 0, data, 0, copyData.length - 1);
            data = copyData;
        }
    }

}

package ru.job4j.sort;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int index = 0;

        while (fstIndex<left.length && sndIndex<right.length){

            if(left[fstIndex]<right[sndIndex]){
                result[index]=left[fstIndex];
                fstIndex++;
            }
            else{
                result[index]=right[sndIndex];
                sndIndex++;
            }
            index++;
        }

        while (fstIndex<left.length){
            result[index]=left[fstIndex];
            fstIndex++;
            index++;
        }

        while (sndIndex<right.length){
            result[index]=right[sndIndex];
            sndIndex++;
            index++;
        }
        return result;
    }
}

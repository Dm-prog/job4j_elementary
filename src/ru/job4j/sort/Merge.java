package ru.job4j.sort;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rls = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for(int k = 0; k != rls.length; k += 1) {
            if((i != left.length) && (j == right.length)) {
                rls[k] = left[i++];
                continue;
            }
            if((i != left.length) && (j != right.length)) {
                if((left[i] < right[j])) {
                    rls[k] = left[i++];
                    continue;
                } else {
                    rls[k] = right[j++];
                    continue;
                }
            }
            if((i == left.length) && (j != right.length)) {
                rls[k] = right[j++];
                continue;
            }
        }
        return(rls);
    }
}

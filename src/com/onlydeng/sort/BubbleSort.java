package com.onlydeng.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * dengjhc(邓江华)
 * 2019/10/21 11:19
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] sourceArr = {1, 2, 4, 56, 7, 223, 2, 6, 85};
        System.out.println(Arrays.toString(sort(sourceArr)));
    }

    /**
     * 找最大
     *
     * @param sourceArr 源信息
     * @return int[]
     */
    public static int[] sort(int[] sourceArr) {
        int len = sourceArr.length;
        int[] targetArr = Arrays.copyOf(sourceArr, len);

        int i = 0;
        while (i < len) {
            // 认为当前是可能是最大的（可能最大数）
            int tryMax = targetArr[i];
            for (int j = 1; j < len; j++) {
                int swap = targetArr[j];
                // 逐个与后面的数进行比较
                if (tryMax <= swap) {
                    // 如果"可能最大数"小于（等于）"比较数"，则更新"可能最大数"
                    // 此处等于比较保证顺序是一致的，具备稳定性
                    tryMax = swap;
                } else {
                    // 否则说明"可能最大数"大于"比较数"，则交换两个数的位置
                    // [1 6 2 3 7 1],6 > 2,交换位置为 [1,2,6,3,7,1]
                    targetArr[j - 1] = swap;
                    targetArr[j] = tryMax;
                }
            }
            // 最后一个已经是最大数，下次无需对比
            // [1,2,3,6,1,7],7无需参与比较
            targetArr[--len] = tryMax;
        }
        return targetArr;
    }

}

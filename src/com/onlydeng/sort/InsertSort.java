package com.onlydeng.sort;

import java.util.Arrays;

/**
 * 插入排序
 * dengjhc(邓江华)
 * 2019/10/21 15:57
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] sourceArr = {1, 2, 5, 4, 56, 7, 223, 2, 6, 85};
        System.out.println(Arrays.toString(sort(sourceArr)));
    }

    public static int[] sort(int[] sourceArr) {
        int len = sourceArr.length;
        int[] targetArr = Arrays.copyOf(sourceArr, len);

        // 从左排序到右,第一个默认是有序的
        for (int i = 1; i < targetArr.length; i++) {
            int num = targetArr[i];
            // 左侧最后一个数可能移动的下标
            int j = i;
            while (j > 0 && targetArr[j - 1] > num) {
                targetArr[j] = targetArr[j - 1];
                j--;
            }
            targetArr[j] = num;
        }
        return targetArr;
    }


//    public static int[] sort(int[] sourceArr) {
//        int len = sourceArr.length;
//        int[] targetArr = Arrays.copyOf(sourceArr, len);
//
//        int insertIndex = 0;
//        int insert;
//
//        // 遍历全部数据
//        while (len > 0) {
//            insert = targetArr[insertIndex];
//            // 走一次的逻辑
//            for (int i = 1; i < len; i++) {
//                int swap = targetArr[i];
//                if (swap > insert) {
//                    // 如果比较数大于设定的插入数，则当前插入数找到了插入位置【当前比较数位置减1】
//                    // 设定比较数为新的插入数
//                    // 经过第一步得到[2,4,8,3,4,5]，由于8大于4，因此插入数更新为8，4插入到8所在位置的前一位
//                    targetArr[i - 1] = insert;
//                    insert = swap;
//                } else {
//                    // 比较数小于等于插入数，向前移动位置【保证左侧有序】
//                    // [4,2,8,3,4,5]，插入数为4，2小于4，则向前移动变成[2,4,8,3,4,5]
//                    targetArr[insertIndex] = swap;
//                }
//                // 更新插入数位置
//                insertIndex = i;
//            }
//            // 第一轮完成，将插入数写入插入位置
//            targetArr[insertIndex] = insert;
//
//            // 最大数无需比较
//            len--;
//            // 重置插入数位置
//            insertIndex = 0;
//        }
//        return targetArr;
//    }


}

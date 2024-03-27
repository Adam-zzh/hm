package com.hm.sc.demo;

import lombok.Data;

/**
 * 〈线段数组〉<br>
 *  NOTE:注意lowbit方法取n的最低位
 *  +最低位是沿着食物链向上延伸
 *  -最低位是消除1，增加0 结尾有k个0就管辖2的k次方个数字
 *
 * @author ZZH
 * @create 2024/3/27
 * @since 1.0.0
 */
@Data
public class SegmentArray {

    private int[] oriArray;

    private int[] segmentArray;

    private int length;

    public SegmentArray(int[] a){
        this.oriArray = a;
        this.length = a.length;
        this.segmentArray = new int[length + 1];
        int index = 0;
        for (int i : oriArray) {
            this.update(++index, i);
        }
    }

    private int lowBit(int i){
        return i & (-i);
    }

    public void update(int index, int val){
        for (int i = index; i <= length;) {
            segmentArray[i] += val;
            i+=lowBit(i);
        }

    }
    public int query(int i){
        int ret = 0;
        i++;
        for (int j = i; j > 0;) {
            ret += segmentArray[j];
            j -= lowBit(j);
        }
        return ret;
    }

    public int sumRange(int i, int j){
        return query(j) - (i >= 1 ? query(i-1) : 0);
    }

    public static void main(String[] args) {
        SegmentArray segmentArray1 = new SegmentArray(new int[]{2, 3, 2, 3, 2, 3});
        System.out.println(segmentArray1.sumRange(0, 5));

    }

}
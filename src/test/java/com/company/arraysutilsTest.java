package com.company;

import org.junit.Assert;
import org.junit.Test;

public class arraysutilsTest {
    @Test
    public void binarySearch_elementExist(){
        int[] array={1,3,5,7,9,10};
        int n=7;
        int result= new arraysutils().binarySearch(array,n);
        Assert.assertEquals(3,result);
    }
    @Test
    public void binarySearch(){
        int[] array={1,3,5,7,9,10};
        int n=2;
        int result= new arraysutils().binarySearch(array,n);
        Assert.assertEquals(-2,result);
    }

        @Test
        public void bubbleSort(){
            int[] array={1,5,7,3,9,10};
            new arraysutils().bubbleSort(array);
            Assert.assertArrayEquals(new int[]{1,3,5,7,9,10},array);



    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.xuanhieu.mathutil.core;

import static com.xuanhieu.mathutil.core.MathUtil.*;
//import static là dành riêng cho những hàm static 
//gọi hàm mà bỏ qua tên class
//trong class có nhiều hàm static import.*

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    public static Object[][] initData() {
        return new Integer[][]{
                    {1, 1},
                    {2, 2},
                    {3, 6},
                    {4, 24},
                    {5, 720},
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgumentReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
    
//    @Test
//    public void testGetFactorialGivenRightArgumentReturnWell() {
//        assertEquals(24, getFactorial(4));
//    }
    
    //bắt ngoại lệ khi đưa data cà chớn
    //@Test (expected = tên ngoại lệ.class) Junit 4, JUnit 5 không 
    //kiểu này
    
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    
    
}

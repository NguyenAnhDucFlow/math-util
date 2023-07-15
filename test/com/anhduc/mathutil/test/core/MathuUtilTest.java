/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhduc.mathutil.test.core;

import com.anhduc.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathuUtilTest {
    
    //ĐÂY LÀ CLSS SẼ SỬ DỤNG CÁC HÀM CỦA THƯ VIỆN/FRAMEWORK JUNIT
    //ĐỂ KIỂM THỬ KIỂM TRA CODE CHÍNH HÀM TÍNH GIAI THỪA
    //CLASS core.MathUtil
    //viết code để test code chính bên kia
    //có nhiều quy tắc đặt tên kiểm thử 
    //nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    //hàm dưới đây là tình huống test hàm chạy thành công
    //ta sẽ xài hàm kiểu well
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là psvm
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        int n = 0; //test thử tình huống tử tế
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(120, MathUtil.getFactorial(5));
        assertEquals(720, MathUtil.getFactorial(6));    
    }
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu không thể đo lường   
    // so sánh theo kiểu value mà chỉ đo lường = cách chúng xuất hiện hay không
    // assertEquals() không dùng để so sánh ngoại lệ
    //       Equals() là bằng nhau hay không trên value!!
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgmentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    //xai lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận 21
    // tui cần thấy màu xanh khi chơi với 21!
    
    
}

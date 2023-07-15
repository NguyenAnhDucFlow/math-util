/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhduc.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    // trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, không cần lưu lại trạng thái/ giá trị
    //chọn thiết kế là hàm static
    
        // ham tính giai thừa !!!
    //n! = 1.2.3.4.5.6...n
    //không có giai thừa âm
    //0!=1!=1 đó là quy ước
    //giai thừa tăng rất nhanh về giá trị
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if (n == 0 || n ==1)
            return 1; 
        long product = 1; // tích nhân dồn, thuật toán  heo đất, ốc bu dồn thịt
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
}

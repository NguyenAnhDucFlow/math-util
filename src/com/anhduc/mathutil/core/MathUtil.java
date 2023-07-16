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
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        if (n == 0 || n ==1)
//            return 1; 
//        long product = 1; // tích nhân dồn, thuật toán  heo đất, ốc bu dồn thịt
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        return product;
//    }
    // Học đệ quy trong 30s - RECURSION
    // Hiện tượng gọi lại chính mình với 1 quy mô khác
    // Ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    // búp bê to, nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa... đến điểm dừng
    
    //tính giùm tui 6!
    //n! = 1.2.3.4.5.6.n!
    //6! = 6.5!
    //5! = 5.4!
    // chốt hạ = n = n . (n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0...20 ple!");
        if (n == 0 || n == 1)
            return 1;
        return n * getFactorial(n -1); 
           
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhduc.mathutil.main;

import com.anhduc.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiêm coi hàm tính giai thừa coi chạy đúng như thiết kế không
        // ta phải đưa các tình huống trong thực tế
        //ví dụ -5, 0,1, 20
        // TEST CASEE 1 TÌNH HUỐNG HÀM APP, HAY MÀN HINH, TÍNH NĂNG, ĐƯỢC ĐƯA VÀO SỬ DỤNG
        // ĐƯỢC SỬ DỤNG GIẢ LÂP
        //TEST CASE LÀ 1 TÌNH HUỐN SỬ DỤNG APP XÀI APP MÀ NÓ BAO HÀM DATA ĐẬU VÀO CỤ THỂ NÀO ĐÓ
        // OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM VÀ DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        long EXPECTED = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + EXPECTED + "expected");
        System.out.println("5! = " + actual + "actual");
    }
}

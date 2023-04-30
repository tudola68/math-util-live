package com.tu.mathutil;

public class MathUtil {
    // n! = 1.2.3.4.5.6. ... .n 
    // Quy ước: 0! = 1! = 1
    // Không tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long (kiểu long tối đa 18 con số 0)
    // 21! là lố kiểu long
    // nếu đưa vào số âm hoặc n >= 21 thì ta không tính,
    // và ta đưa ra một ngoại lệ không tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalue argument n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}

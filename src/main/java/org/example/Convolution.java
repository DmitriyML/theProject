package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Convolution {
    /*  Этот метод производит умножение двух полиномов, переданных в параметре как
    * массивы char  */
    static void convert(char[] p, char[] q){

        char pq ;
        String s;
        AtomicInteger nDigits = new AtomicInteger();
        AtomicInteger nChar = new AtomicInteger();
        AtomicInteger nSpecial = new AtomicInteger();




        List<Character> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();










        for (int j = 0; j < p.length; j++) {
            for (int i = 0; i < q.length; i++) {
                pq = (char)(p[i]*q[j]);
//                pq = (char)((pq + (result.get(i+j)))%128) ;

                if(result.size() < i+j+1) {
                    pq = (char)(pq%0x80);
                    result.add(pq);
                }
                else {
                    pq = (char)((pq + result.get(i+j))%0x80) ;
                    result.set( (i+j), pq);
                }
           }
       }

        /* делаем просмотр предварительно сформированного пароля и определяем - сколько в нём из разрешенных символов
        * по категориям */
        result.forEach((n)-> {
            if(n>=0x20) {
                if(n>=0x30 && n<=0x39) {
                    nDigits.getAndIncrement();
                }
                else if((n>0x40 && n<0x5B)||(n>0x60 && n<0x7B)) {
                    nChar.getAndIncrement();
                }
                else if(n=='#'||n=='$'||n=='%'||n=='&'||n=='/'||n=='<'||n=='>'||n=='?'||n=='@'||n=='\\'||n=='_'||n=='{'||n=='}') {
                    nSpecial.getAndIncrement();
                }
            }
        });

        result.forEach((n)->{
            if(n<0x20) {

            }
        })






        result.forEach(sb::append);

        System.out.println(sb.toString());






    }
}

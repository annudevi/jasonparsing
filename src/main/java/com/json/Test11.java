//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.json;

import org.springframework.http.ResponseEntity;

public class Test11 {
   
    public static void main(String[] args)  {
        String pnum = "123456";
        if (pnum.matches("[0-9]+") && pnum.length() > 5) {
            System.out.println(" pnum " + pnum);
        }

        ResponseEntity.ok();
        int num = 10;
        String msg = "not found";
         num = num / 9;
        System.out.println(" num " + num);
//        if (num < 2) {
//            throw new NotFoundException(msg);
//        } else {
//            boolean isNumeric = pnum.chars().allMatch((x) -> {
//                return Character.isDigit(x);
//            });
//            if (isNumeric) {
//                String pnum1 = "";
//                String var10000 = pnum.substring(0, 3);
//                pnum1 = "%" + var10000 + "%" + pnum.substring(3, 6) + "%" + pnum.substring(6, pnum.length());
//                System.out.println(" pnum " + pnum1);
//            } else if (!isNumeric) {
//                pnum = pnum.replaceAll("[^a-zA-Z0-9]", "%");
//                System.out.println(" in else loop " + pnum);
//            }
//
//            System.out.println(" is numeric " + isNumeric);
//        }
//    }
}
}
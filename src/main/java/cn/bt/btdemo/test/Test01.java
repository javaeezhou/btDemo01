package cn.bt.btdemo.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test01 {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }
}

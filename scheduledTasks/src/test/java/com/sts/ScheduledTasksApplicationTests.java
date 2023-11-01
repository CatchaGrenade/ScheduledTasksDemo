package com.sts;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScheduledTasksApplicationTests {

    @Autowired
    StringEncryptor stringEncryptor;

    @Test
    void contextLoads() {
    }

    @Test
    public void encryptPwd() {
        String passwordEn = stringEncryptor.encrypt("Csq19961012");
        String passwordDe = stringEncryptor.decrypt(passwordEn);
        System.out.println("password密文：" + passwordEn);
        System.out.println("password明文：" + passwordDe);
    }

}

package com.cfl.hellojwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class HellojwtApplicationTests {

    /**
     * 生成token
     */
    @Test
    void contextLoads() {
        Map<String,Object> map = new HashMap<>();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND,120);
        String token = JWT.create()
                .withHeader(map)
                .withClaim("userId",123)
                .withClaim("username","xiaochen")
                .withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256("UHIUHVNEWUIN"));
        System.out.print("最终生成的token是：");
        System.out.println(token);
    }

    /**
     * token验证
     */
    @Test
    public void testToken(){

        //生成验证对象
        JWTVerifier uhiuhvnewuin = JWT.require(Algorithm.HMAC256("UHIUHVNEWUIN")).build();
        DecodedJWT verify = uhiuhvnewuin.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2MDc4NjU5NzcsInVzZXJJZCI6MTIzLCJ1c2VybmFtZSI6InhpYW9jaGVuIn0.3xAjDOAybcDJrDoJTcaFzw0A4ca4RXLEQDSCK2T3HLM");
        System.out.println(verify.getClaim("userId"));
        System.out.println(verify.getClaim("username"));
    }

}

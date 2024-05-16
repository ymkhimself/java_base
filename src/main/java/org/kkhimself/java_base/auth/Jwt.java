package org.kkhimself.java_base.auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

public class Jwt {


    public String GenerateToken(String userId) throws JWTCreationException {

        String secret = "your-secret"; // 替换为您的密钥
        String accessToken = "your-access-token"; // 替换为您的访问令牌


        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                .withClaim("userId", userId)
                .sign(algorithm);

    }

}

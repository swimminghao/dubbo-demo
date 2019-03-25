package service.impl;

import javabean.UserAddress;
import lombok.SneakyThrows;
import service.user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 夸克
 * @date 2019/3/18 00:15
 */
public class UserServiceImpl implements UserService {
    @SneakyThrows
    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("调用到了服务。。。。。1");

        Thread.sleep(1000);

        System.out.println("调用到了消费者");
        final UserAddress userAddress1 = new UserAddress()
                .setUserId(1L)
                .setAddressId(1L)
                .setAddressNo("123")
                .setAddressStr("庆丰大街")
                .setUserName("小张");

        final UserAddress userAddress2  = new UserAddress()
                .setUserId(1L)
                .setAddressId(2L)
                .setAddressNo("456")
                .setAddressStr("西湖")
                .setUserName("小王");

        return new ArrayList<UserAddress>(){{
            add(userAddress1);
            add(userAddress2);
        }};
    }
}



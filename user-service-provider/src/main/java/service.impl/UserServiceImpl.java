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

        System.out.println("调用到了服务。。。。。");


        final UserAddress userAddress1 = new UserAddress()
                .setUserId(1L)
                .setAddressId(1L)
                .setAddressNo("123")
                .setAddressStr("苏州")
                .setUserName("奇衡三");

        final UserAddress userAddress2 = new UserAddress()
                .setUserId(2L)
                .setAddressId(2L)
                .setAddressNo("456")
                .setAddressStr("西湖")
                .setUserName("海问香");

        return new ArrayList<UserAddress>() {{
            add(userAddress1);
            add(userAddress2);
        }};
    }
}



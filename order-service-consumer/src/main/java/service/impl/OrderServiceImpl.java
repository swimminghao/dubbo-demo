package service.impl;

import javabean.UserAddress;
import org.springframework.stereotype.Service;
import service.order.OrderService;
import service.user.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 夸克
 * @date 2019/3/18 00:14
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private UserService userService;

    /**
     * 生成订单过程：
     * 调用远程接口 查询用户信息
     * 将用户信息去生成订单
     *
     * @return
     */
    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        if (null != userAddressList && userAddressList.size() > 0) {
            System.out.println("调用远程接口完成");
//            System.out.println(userAddressList);
//            Stream.of(userAddressList).forEach(System.out::println);
            Optional.of(userAddressList).ifPresent(System.out::println);
        }

        return userAddressList;
    }
}

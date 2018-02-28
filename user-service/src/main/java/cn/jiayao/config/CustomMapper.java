package cn.jiayao.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Component;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/2/28 13:34
 * desc  :  参考:http://blog.csdn.net/kinginblue/article/details/51236938
 * Copyright(©) 2017 by xiaomo.
 *
 * @author xiaomo
 */
@Component
public class CustomMapper extends ObjectMapper {
    public CustomMapper() {
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}

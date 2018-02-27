package cn.jiayao.dao;

import cn.jiayao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin
 * 继承JpaRepository 泛型为 实体类和主键类型
 */
public interface UserDao extends JpaRepository<User,Long> {

}

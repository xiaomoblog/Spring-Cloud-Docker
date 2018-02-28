package cn.jiayao.dao;

import cn.jiayao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * 继承JpaRepository 泛型为 实体类和主键类型
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {

}

package vn.vuduy.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.vuduy.laptopshop.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { // Bạn đang kế thừa interface CrudRepository với
                                                                     // hai tham số kiểu(generics)
                                                                     // User:là Entity đại diện cho bảng CSDL
                                                                     // Long: là KDL của khóa chính (@ID) trong User
    public User save(User vuduy);
}

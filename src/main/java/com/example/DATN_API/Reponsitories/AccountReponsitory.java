
package com.example.DATN_API.Reponsitories;

import com.example.DATN_API.Entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountReponsitory extends JpaRepository<Account, Integer> {
    @Query("select acc from Account acc")
    Page<Account> getAll(Pageable pageable);

    @Query("select acc from Account acc where acc.username like %?1%")
    Page<Account> getAllfindbyUsername(Pageable pageable,String username);

    @Query("select acc from Account acc  where acc.infoAccount.fullname like %?1%")
    Page<Account> getAllfindbyFullname(Pageable pageable,String fullname);


    @Query(value = "SELECT * FROM account where username=?1", nativeQuery = true)
	Account findByUsername(String username);

}


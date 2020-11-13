package com.project.thereporter.entities.repositories;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.thereporter.entities.UserSetup;


public interface UserSetupRepository extends JpaRepository<UserSetup, Long> {
	@Query("select u from UserSetup u where u.activeStatus = 'Y' and u.emailId = ?1")
	Optional<UserSetup> getUserDetails(String username);

	@Query("select u from UserSetup u where u.userId = ?1")
	Optional<UserSetup> findById(Integer userId);

	@Query("select count(*) from UserSetup u where u.activeStatus=?1 and u.adminStatus='N'")
	Long getUserCount(String status);

	Optional<UserSetup> findByMobileNoAndPasswordAndDeactivatedOnIsNull(String username, String password);

	Optional<UserSetup> findByUserName(String username);
	
	List<UserSetup> findByUserIdIn(List<Long> userIds);

	Optional<UserSetup> findByMobileNo(String string);
	
	@Query("select u from UserSetup u where u.adminStatus='N'")
	Collection<UserSetup> getUserList();

}

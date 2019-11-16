package com.demo.startup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.demo.startup.entities.UserEntity;

@Service
public interface UserEntityRepository extends PagingAndSortingRepository<UserEntity, Long> {

	@Query("select U from UserEntity U where U.name= name ")
	List<?> findByName(String name);

	@Query("select U from UserEntity U where U.description = description ")
	List<?> findByDescription(String description);

	@Query("Select U from UserEnity U where U.userName = username and U.password = password ")
	List<?> loginQuery(String username, String password);
	
	

}

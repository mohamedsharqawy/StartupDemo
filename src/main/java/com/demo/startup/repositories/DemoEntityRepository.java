package com.demo.startup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.demo.startup.entities.DemoEntity;

@Service
public interface DemoEntityRepository extends PagingAndSortingRepository<DemoEntity, Long> {
	
	@Query("select D from DemoEntity D where D.name= name ")
	List<?>findByName (String name );
	
	
	@Query("select D from DemoEntity D where D.description = description ")
	List<?>findByDescription (String description );

}

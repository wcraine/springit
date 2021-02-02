package com.vega.springit2.repository;

import com.vega.springit2.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  LinkRepository extends JpaRepository<Link,Long> {

    // Link findByTitle(String title);

}

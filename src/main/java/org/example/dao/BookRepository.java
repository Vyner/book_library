package org.example.dao;

import org.example.model.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookInfo, Long> {

}

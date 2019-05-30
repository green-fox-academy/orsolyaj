package com.connection.sqlconnection.repository;

import com.connection.sqlconnection.model.Assignee;
import org.springframework.data.repository.CrudRepository;

public interface IAssigneeRepository extends CrudRepository<Assignee,Long> {
}

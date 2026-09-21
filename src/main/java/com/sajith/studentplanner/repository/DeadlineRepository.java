package com.sajith.studentplanner.repository;

import com.sajith.studentplanner.model.Deadline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeadlineRepository extends JpaRepository<Deadline,Long> {
}

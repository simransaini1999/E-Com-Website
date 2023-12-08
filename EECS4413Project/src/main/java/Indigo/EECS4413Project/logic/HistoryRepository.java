package Indigo.EECS4413Project.logic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Indigo.EECS4413Project.model.History;

@Repository
public interface HistoryRepository extends JpaRepository <History, Integer>{

}

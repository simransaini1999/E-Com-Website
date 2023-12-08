package Indigo.EECS4413Project.logic;

import org.springframework.data.jpa.repository.JpaRepository;

import Indigo.EECS4413Project.model.History;

public interface HistoryRepository extends JpaRepository <History, Integer>{

}

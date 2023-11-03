package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.FileEntity;

public interface IFileRepository extends JpaRepository<FileEntity, Integer> {

}

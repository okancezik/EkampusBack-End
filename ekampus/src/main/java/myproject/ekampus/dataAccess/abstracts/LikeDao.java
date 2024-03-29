package myproject.ekampus.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.ekampus.entities.concretes.Like;

public interface LikeDao extends JpaRepository<Like, Integer> {

	Optional<Like> findByPost_Id(int postId);
	
	Optional<Like> findByPost_IdAndLikeStudent_Id(int postId, int studentId);
	
	Optional<List<Like>> findByLikeStudent_Id(int studentId);
}

package toy.starbucks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.starbucks.domain.Qna;

public interface QnaRepository extends JpaRepository<Qna, Long> {
}

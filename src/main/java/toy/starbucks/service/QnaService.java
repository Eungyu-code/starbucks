package toy.starbucks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import toy.starbucks.domain.Qna;
import toy.starbucks.repository.QnaRepository;

@Service
@RequiredArgsConstructor
public class QnaService {

    private final QnaRepository qnaRepository;

    public void save(Qna qna) {

        qnaRepository.save(qna);
    }
}

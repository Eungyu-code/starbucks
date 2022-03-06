package toy.starbucks.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Qna {

    @Id
    @GeneratedValue
    @Column(name = "qna_id")
    private Long id;

    private String title;

    private String questions;

    //private Member member;

    // Qna 생성 메소드

    public void addQNA(Member member, String title, String questions) {

        //this.member = member;
        this.title = title;
        this.questions = questions;
    }

}

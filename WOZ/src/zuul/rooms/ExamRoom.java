package zuul.rooms;

import zuul.studies.Exam;

/**
 * Created by user on 13/11/14.
 */
public class ExamRoom extends Room{

    private Exam exam;

    /**
     * Create a rooms described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     *
     * @param description The rooms's description.
     */
    public ExamRoom(String description) {
        super(description);
        this.exam = new Exam();
    }


    public Exam getExam() {
        return exam;
    }
}

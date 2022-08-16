package za.edu.vcconnect.st10068305.api.student;

import za.edu.vcconnect.st10068305.api.Subject;

public class GradeEightStudent extends Student {
    public GradeEightStudent() {
        // Enforce grade 8's to have all subjects.
        this.setSubjects(new Subject[]{
                Subject.ACCOUNTING,
                Subject.AFRIKAANS,
                Subject.HISTORY,
                Subject.ENGLISH,
                Subject.CONSUMER_STUDIES,
                Subject.BUSINESS_STUDIES,
                Subject.ARTS_AND_CULTURE,
                Subject.ZULU,
                Subject.MATHS,
                Subject.PHYSICS,
                Subject.LIFE_ORIENTATION,
                Subject.ENGINEERING_GRAPHICS_AND_DESIGN
        });
    }
}

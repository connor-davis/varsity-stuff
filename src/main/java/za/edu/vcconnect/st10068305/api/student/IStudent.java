package za.edu.vcconnect.st10068305.api.student;

import za.edu.vcconnect.st10068305.api.Subject;

public interface IStudent {
    void setSubjects(Subject[] subjects);
    Subject[] getSubjects();
}

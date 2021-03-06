package com.routine.portal.routinePortal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClassDetailsMonday {
    @Id
    private String classDetailsId;

    private String roomNo;

    private String startTime;

    private String endTime;

    private String label;

    private String courseCode;

    private String section;

    private String facultyMember;

    private String facultyMemberEmployeeId;


}

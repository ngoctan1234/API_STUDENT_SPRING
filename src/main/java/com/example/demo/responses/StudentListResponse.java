package com.example.demo.responses;

import com.example.demo.models.Student;
import lombok.*;

import java.util.List;

@Builder
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentListResponse {
    private List<StudentResonse> studentResonseList;
    private int totalPages;
}

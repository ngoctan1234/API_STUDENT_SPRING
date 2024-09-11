package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Builder
@Data
@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tên không được để trống")
    @Size(min = 2, max = 50, message = "Tên phải có từ 2 đến 50 ký tự")
    private String ten;

    @NotBlank(message = "Thành phố không được để trống")
    private String thanhPho;

    @Past(message = "Ngày tháng năm sinh phải là một ngày trong quá khứ")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate ngaySinh;
    @NotNull(message = "Xếp loại không được để trống")
    @Enumerated(EnumType.STRING)
    private XepLoai xepLoai;  // Thêm thuộc tính xếp loại
}

package ra.md04_ss2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    @DateTimeFormat( pattern = "dd-MM-yyyy")
    private LocalDateTime createdAt;
    @DateTimeFormat( pattern = "dd-MM-yyyy")
    private LocalDateTime updatedAt;



}

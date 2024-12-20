package ru.govzcode.user_service.entity;

import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String id;
    private String username;
    private String password;
}

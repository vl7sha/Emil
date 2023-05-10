package com.example.emil.dto;

import com.example.emil.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {

    private String name;

    private User author;

}

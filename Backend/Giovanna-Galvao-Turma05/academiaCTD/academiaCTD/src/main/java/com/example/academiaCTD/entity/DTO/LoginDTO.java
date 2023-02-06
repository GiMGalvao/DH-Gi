package com.example.academiaCTD.entity.DTO;

import lombok.Data;

    @Data

    public class LoginDTO {

        @NotEmpty(message = "{campo.email.obrigatorio}")
        private String email;

        @NotEmpty(message = "{campo.senha.obrigatorio}")
        private String senha;
}




package com.postechfiap.meu_hospital.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "usuarios",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_usuario_email", columnNames = "email"),
                @UniqueConstraint(name = "uk_usuario_login", columnNames = "login")
        })
public class UsuarioEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name =  "id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    private String nome;

    @Setter
    @Column(unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private LocalDateTime dataNascimento;

    @Setter
    @Column(unique = true, length = 11)
    private String cpf;

    @Setter
    @Column(unique = true)
    private String login;

    private String senha;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

  public UsuarioEntity(String nome, String email, String login, String senha, LocalDateTime dataNascimento, String cpf) {
      this.nome = nome;
      this.email = email;
      this.login = login;
      this.senha = senha;
      this.dataNascimento = dataNascimento;
      this.cpf = cpf;
  }

  public UsuarioEntity(UUID id, String nome, String email, String login, String senha, LocalDateTime dataNascimento, String cpf) {
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.login = login;
      this.senha = senha;
      this.dataNascimento = dataNascimento;
      this.cpf = cpf;
  }

    public void atualizarSenha(String senha) {
        this.senha = senha;
    }

    @PrePersist
    protected void onCreate() {
        if (this.dataCriacao == null) {
            this.dataCriacao = LocalDateTime.now();
        }
        if (this.dataAtualizacao == null) {
            this.dataAtualizacao = this.dataCriacao;
        }
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + this.getClass().getSimpleName().toUpperCase()));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
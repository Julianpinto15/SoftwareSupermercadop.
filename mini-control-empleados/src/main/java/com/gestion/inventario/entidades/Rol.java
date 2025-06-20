package com.gestion.inventario.entidades;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre;  // Esto devolverá solo el nombre del rol
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

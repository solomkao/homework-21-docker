package com.solomka.docker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Song {

    @Id
    Long id;

    @Column
    String title;

    @Column
    String lyrics;
}

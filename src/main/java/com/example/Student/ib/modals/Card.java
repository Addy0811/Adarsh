package com.example.Student.ib.modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "id_card")
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private int id;
    @Column(name = "card_status")
    private CardStatus cardStatus;

    @Column(name = "dues")
    private int due;

    @OneToOne
    @JoinColumn(name = "Student_id")
    private Student svn;
}

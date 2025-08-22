package mn.erdenee.course.demo.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mn.erdenee.course.demo.Enum.TransportType;

@Entity
@Table(name = "transport")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="passenger_id")
    private int passenger_id;

    private int amount;

    @Enumerated(EnumType.STRING)
    private TransportType trans;

    private LocalDateTime start_time;
    private LocalDateTime end_time;
}

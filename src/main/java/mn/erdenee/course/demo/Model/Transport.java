package mn.erdenee.course.demo.Model;

import jakarta.persistence.*;
import mn.erdenee.course.demo.Enum.TransportType;

import java.time.LocalDateTime;

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

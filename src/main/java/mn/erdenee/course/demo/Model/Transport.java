package mn.erdenee.course.demo.Model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
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


    @ManyToMany
    @JoinTable(
            name="transport_distance",
            joinColumns = @JoinColumn(name = "transport_id"),
            inverseJoinColumns = @JoinColumn(name = "distance_id")
    )

    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private Set<Distance> distances = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }
}

package FraudApplication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor@Builder
@Entity
public class FraudCheckHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name= "fraud_sequence_generator",sequenceName = "fraud_sequence_generator")
    private Integer id;
    private Integer customerId;
    private Boolean isFraud;
    private LocalDateTime createdAt;


}

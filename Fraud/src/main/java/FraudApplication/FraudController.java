package FraudApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/fraud-check")
public class FraudController {
    private  final FraudCheckService fraudCheckService;

    FraudController(FraudCheckService fraudCheckService){
        this.fraudCheckService = fraudCheckService;
    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId")Integer customerId){
        boolean isfraudulent= fraudCheckService.isFraudulentCustomer(customerId);
        log.info("Fraud check for customer {}",customerId);
        return new FraudCheckResponse(isfraudulent);
    }
}

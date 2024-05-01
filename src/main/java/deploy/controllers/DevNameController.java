package deploy.controllers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dev-name")
public class DevNameController {

    @Value("${devName}")
    private String devName;

    @GetMapping
    public ResponseEntity<String> getDevNam() {
        return ResponseEntity.ok("DevName: " + devName);
    }
}
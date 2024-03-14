package mx.edu.utez.sda.twiliopracticadavid.contoller;

import lombok.AllArgsConstructor;
import mx.edu.utez.sda.twiliopracticadavid.models.SMSrequest;
import mx.edu.utez.sda.twiliopracticadavid.service.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api/twilio")
@AllArgsConstructor
public class TwilioController {
    @Autowired
    TwilioService twilioService;

    @PostMapping(value = "/sendSMS")
    public ResponseEntity<String> sendSMS(@RequestBody SMSrequest smSrequest){
        return new ResponseEntity<>(twilioService.sendSMS(smSrequest), HttpStatus.OK);
    }
}

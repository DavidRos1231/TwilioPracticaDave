package mx.edu.utez.sda.twiliopracticadavid.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import mx.edu.utez.sda.twiliopracticadavid.models.SMSrequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    @Value("${TWILIO_ACCOUNT_SID}")
    String sid;
    @Value("${TWILIO_ACCOUNT_TOKEN}")
    String token;
    @Value("${TWILIO_ACCOUNT_PHONE}")
    String phone;
    public String sendSMS(SMSrequest smsRequest) {
        Twilio.init(sid, token);

        Message.creator(new PhoneNumber("+"+smsRequest.getNumero()),
                new PhoneNumber(phone),
                smsRequest.getMensaje()
                ).create();
        return "Mensaje creado correctamente";
    }
}

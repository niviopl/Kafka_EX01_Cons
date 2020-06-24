package br.com.mastertech.ConsumerConsPorta;

import br.com.mastertech.ProducerConsPorta.Autoriza;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class GerarArq {


    @KafkaListener(topics = "spec2-nivio-pinheiro-1", groupId = "teste-1")
    public void receber(@Payload Autoriza autoriza) {
        System.out.println("Nome (" + autoriza.getNome() + ")    porta(" + autoriza.getPorta() + ")" );
    }

}
